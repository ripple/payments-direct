import java.util.concurrent.TimeUnit;
import java.util.*;

import com.ripple.payments.direct.*;
import com.ripple.payments.direct.api.*;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentWorkflow {

    private static final String clientId = "";
    private static final String clientSecret = "";
    private static final String baseUrl = "";
    private static final String tenantId = "urn:ripplexcurrent-<env>:<tenantName>";
    private static String quoteId;
    private static String identityId;
    private static AuthenticationApi authApi;
    private static QuoteApi quoteApi;
    private static IdentitiesV2Api identityApi;
    private static PaymentsApi paymentsApi;
    private static LedgerPublicApi ledgerApi;
    private static Logger logger;


    public static void setup() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(baseUrl);

        authApi = new AuthenticationApi(apiClient);
        logger = LoggerFactory.getLogger(PaymentWorkflow.class);

    }

    // Get JWT token
    public static void authenticate() throws ApiException {

        AuthenticationRequestDTO authRequest = new AuthenticationRequestDTO()
                .clientId(clientId)
                .clientSecret(clientSecret)
                .audience(tenantId)
                .grantType(AuthenticationRequestDTO.GrantTypeEnum.CLIENT_CREDENTIALS);


        AuthenticationResponseDTO response = authApi.authenticate(authRequest, null);

        String accessToken = response.getAccessToken();
        logger.info("Access Token received.");

        // Update clients with auth
        ApiClient authClient = new ApiClient();
        authClient.setBasePath(baseUrl);
        authClient.setBearerToken(accessToken);

        quoteApi = new QuoteApi(authClient);
        identityApi = new IdentitiesV2Api(authClient);
        paymentsApi = new PaymentsApi(authClient);
        ledgerApi = new LedgerPublicApi(authClient);

    }

    // Get a quote
    public static void getQuote() throws ApiException {
        QuoteCollectionRequestDTO quoteRequest = new QuoteCollectionRequestDTO()
                .sourceCountry("US")
                .sourceCurrency("USD")
                .destinationCurrency("MXN")
                .destinationCountry("MX")
                .quoteAmount(Double.parseDouble("20"))
                .quoteAmountType(QuoteAmountTypeDTO.valueOf("SOURCE_AMOUNT"))
                .payinCategory("T_PLUS_ONE")
                .payoutCategory("BANK");


        QuoteCollectionDTO response = quoteApi.createQuoteCollection(quoteRequest);
        quoteId = String.valueOf(response.getQuotes().get(0).getQuoteId());
        logger.info("Quote ID: {}", quoteId);

    }

    // Create a beneficiary
    public static void createBeneficiary() throws ApiException {
        Map<String, Object> beneficiary = new HashMap<>();
        beneficiary = buildPiiData();

        CreateIdentityRequestV2DTO identityRequestV2 = new CreateIdentityRequestV2DTO();
        identityRequestV2.setNickName("Lindgren - Breitenberg");
        identityRequestV2.setIdentityType(IdentityTypeV2DTO.BENEFICIARY);
        identityRequestV2.setUseCaseType(UseCaseTypeDTO.BUSINESS);
        identityRequestV2.setPiiData(beneficiary);

        CreateIdentityResponseDTO response = identityApi.createIdentityV2(identityRequestV2);
        identityId = String.valueOf(response.getIdentityId());
        logger.info("Beneficiary Identity ID: {}", identityId);

        IdentityResponseV2DTO getIdentityResponse = identityApi.getIdentityByIdV2(identityId, null);
        logger.info("Beneficiary Identity ID using getIdentityById: {}", getIdentityResponse.getIdentityId());

    }

    // Create a payment
    public static void createPayment() throws ApiException {
        PaymentRequestDTO paymentRequest = new PaymentRequestDTO()
                .beneficiaryIdentityId(UUID.fromString(identityId))
                .purposeCode("OTHR")
                .internalId("test")
                .paymentLabels(Collections.singletonList("test-payment"))
                .quoteId(UUID.fromString(quoteId));

        PaymentDTO response = paymentsApi.createPayment(paymentRequest);
        logger.info("Payment ID: {}", response.getPaymentId());
    }

    // Poll for terminal payment state
    public static void waitForCompletedState() throws Exception {
        int maxAttempts = 25;
        int delaySeconds = 10;

        try {
            for (int i = 0; i < maxAttempts; i++) {
                StateTransitionsResponseDTO transitions = paymentsApi.getPaymentStateTransitionsById(UUID.fromString(quoteId));
                List<StateTransitionDTO> states = transitions.getStateTransitions();

                if (states.stream().anyMatch(t -> "COMPLETED".equals(String.valueOf(t.getUpdatedTo())))) {
                    logger.info("Payment completed successfully: {}", states);
                    return;
                }

                if (states.stream().anyMatch(t -> "FAILED".equals(String.valueOf(t.getUpdatedTo())))) {
                    PaymentWithDetailsDTO payment = paymentsApi.getPaymentById(UUID.fromString(quoteId));
                    List<PaymentErrorDTO> errors = payment.getErrors();
                    if (errors != null && !errors.isEmpty()) {
                        PaymentErrorDTO err = errors.get(0);
                        String errorMessage = "code:" + err.getCode() + "; type" + err.getType() + "; title:" + err.getTitle() + "; description:" + err.getDescription();
                        throw new Exception("Payment reached FAILED state. First error: " + errorMessage);
                    }
                    throw new Exception("Payment reached FAILED state with unknown error.");
                }

                logger.info("Attempt {}: Payment not yet completed or failed.", i + 1);
                TimeUnit.SECONDS.sleep(delaySeconds);
            }
        } catch (Exception e) {
            logger.info("Error polling payment status: {}", e);
            throw new Exception();
        }

        throw new Exception("Payment did not reach a terminal state within the allowed number of attempts.");
    }

    // Delete benecifiary
    public static void deleteBeneficiary() throws ApiException {

        identityApi.deactivateIdentityV2(identityId);
        logger.info("Beneficiary is deactivated/deleted.");

    }

    // If pre-funded, then use this. Otherwise this api is not needed.
    public static void getBalance() throws ApiException {

        ledgerApi.getBalances("USD");

    }

    public static void main(String[] args) throws Exception {
        setup();
        authenticate();
        getQuote();
        createBeneficiary();
        createPayment();
        waitForCompletedState();
        deleteBeneficiary();
        getBalance();
    }


    public static Map<String, Object> buildPiiData() {
        Map<String, Object> piiData = new HashMap<>();

        // --- Cdtr ---
        Map<String, Object> cdtr = new HashMap<>();
        cdtr.put("Nm", "Botsford and Sons");

        Map<String, Object> ctctDtls = new HashMap<>();
        ctctDtls.put("MobNb", "16-834-748-1777");
        ctctDtls.put("EmailAdr", "Raoul94@yahoo.com");
        cdtr.put("CtctDtls", ctctDtls);

        Map<String, Object> pstlAdr = new HashMap<>();
        pstlAdr.put("AdrLine", List.of("3103 Orn Garden"));
        pstlAdr.put("PstCd", "75357");
        pstlAdr.put("TwnNm", "West Marjolaine");
        pstlAdr.put("CtrySubDvsn", "Durango");
        pstlAdr.put("Ctry", "MX");
        cdtr.put("PstlAdr", pstlAdr);

        Map<String, Object> id = new HashMap<>();
        Map<String, Object> orgId = new HashMap<>();
        Map<String, Object> othr = new HashMap<>();
        Map<String, Object> schmeNm = new HashMap<>();
        Map<String, Object> cntrIncor = new HashMap<>();
        cntrIncor.put("CtryofIncorprtn", "MX");
        schmeNm.put("Cd", "TXID");

        othr.put("Id", "751-539-9808");
        othr.put("SchmeNm", schmeNm);
        orgId.put("Othr", othr);
        orgId.put("RelShipToDbtr", "SUBS");
        orgId.put("dtAndPlcofIncorp", cntrIncor);
        id.put("OrgId", orgId);
        cdtr.put("Id", id);

        piiData.put("Cdtr", cdtr);

        // --- CdtrAcct ---
        Map<String, Object> cdtrAcct = new HashMap<>();
        cdtrAcct.put("Ccy", "MXN");

        Map<String, Object> acctOthr = new HashMap<>();
        Map<String, Object> acctSchmeNm = new HashMap<>();
        acctSchmeNm.put("Cd", "CLABE");
        acctOthr.put("SchmeNm", acctSchmeNm);
        acctOthr.put("Id", "002010077777777771");

        Map<String, Object> acctId = new HashMap<>();
        acctId.put("Othr", acctOthr);
        cdtrAcct.put("Id", acctId);

        piiData.put("CdtrAcct", cdtrAcct);

        // --- CdtrAgt ---
        Map<String, Object> cdtrAgt = new HashMap<>();

        Map<String, Object> brnchId = new HashMap<>();
        Map<String, Object> brnchPstlAdr = new HashMap<>();
        brnchPstlAdr.put("Ctry", "MX");
        brnchId.put("PstlAdr", brnchPstlAdr);

        Map<String, Object> finInstnId = new HashMap<>();
        finInstnId.put("Nm", "enhance");

        cdtrAgt.put("BrnchId", brnchId);
        cdtrAgt.put("FinInstnId", finInstnId);

        piiData.put("CdtrAgt", cdtrAgt);

        return piiData;
    }
}
