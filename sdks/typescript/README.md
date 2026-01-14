## @ripple/payments-direct-client@1.0.0

This generator creates TypeScript/JavaScript client that utilizes [axios](https://github.com/axios/axios). The generated Node module can be used in the following environments:

Environment
* Node.js
* Webpack
* Browserify

Language level
* ES5 - you must have a Promises/A+ library installed
* ES6

Module system
* CommonJS
* ES6 module system

It can be used in both TypeScript and JavaScript. In TypeScript, the definition will be automatically resolved via `package.json`. ([Reference](https://www.typescriptlang.org/docs/handbook/declaration-files/consumption.html))

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Publishing

First build the package then run `npm publish`

### Consuming

navigate to the folder of your consuming project and run one of the following commands.

_published:_

```
npm install @ripple/payments-direct-client@1.0.0 --save
```

_unPublished (not recommended):_

```
npm install PATH_TO_GENERATED_PACKAGE --save
```

### Documentation for API Endpoints

All URIs are relative to *https://api.test.ripple.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**authenticate**](docs/AuthenticationApi.md#authenticate) | **POST** /v2/oauth/token | Request an access token
*AuthenticationApi* | [**testAuthToken**](docs/AuthenticationApi.md#testauthtoken) | **GET** /v2/oauth/token/test | Test access token
*IdentitiesV2Api* | [**createIdentityV2**](docs/IdentitiesV2Api.md#createidentityv2) | **POST** /v2/identities | Create a new identity (v2) - Legacy
*IdentitiesV2Api* | [**deactivateIdentityV2**](docs/IdentitiesV2Api.md#deactivateidentityv2) | **DELETE** /v2/identities/{identity-id} | Delete an identity (v2) - Legacy
*IdentitiesV2Api* | [**getIdentitiesV2**](docs/IdentitiesV2Api.md#getidentitiesv2) | **GET** /v2/identities | Get a list of identities (v2) - Legacy
*IdentitiesV2Api* | [**getIdentityByIdV2**](docs/IdentitiesV2Api.md#getidentitybyidv2) | **GET** /v2/identities/{identity-id} | Get an identity by ID (v2) - Legacy
*IdentitiesV3Api* | [**createFinancialInstrument**](docs/IdentitiesV3Api.md#createfinancialinstrument) | **POST** /v3/identities/{identity-id}/financial-instruments | Add a financial instrument (v3)
*IdentitiesV3Api* | [**createIdentity**](docs/IdentitiesV3Api.md#createidentity) | **POST** /v3/identities | Create an identity (v3)
*IdentitiesV3Api* | [**deactivateFinancialInstrumentV3**](docs/IdentitiesV3Api.md#deactivatefinancialinstrumentv3) | **DELETE** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Deactivate a Financial Instrument (v3)
*IdentitiesV3Api* | [**deactivateIdentityV3**](docs/IdentitiesV3Api.md#deactivateidentityv3) | **DELETE** /v3/identities/{identity-id} | Deactivate an identity (v3)
*IdentitiesV3Api* | [**getFinancialInstrumentById**](docs/IdentitiesV3Api.md#getfinancialinstrumentbyid) | **GET** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Get a financial instrument by ID (v3)
*IdentitiesV3Api* | [**getFinancialInstruments**](docs/IdentitiesV3Api.md#getfinancialinstruments) | **GET** /v3/identities/{identity-id}/financial-instruments | Get a list of financial instruments of the identity (v3)
*IdentitiesV3Api* | [**getIdentities**](docs/IdentitiesV3Api.md#getidentities) | **GET** /v3/identities | Get a list of identities (v3)
*IdentitiesV3Api* | [**getIdentityById**](docs/IdentitiesV3Api.md#getidentitybyid) | **GET** /v3/identities/{identity-id} | Get an identity by ID (v3)
*IdentitiesV3Api* | [**putFinancialInstrument**](docs/IdentitiesV3Api.md#putfinancialinstrument) | **PUT** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Update a financial instrument (v3)
*IdentitiesV3Api* | [**putIdentity**](docs/IdentitiesV3Api.md#putidentity) | **PUT** /v3/identities/{identity-id} | Update an identity (v3)
*LedgerPublicApi* | [**getBalances**](docs/LedgerPublicApi.md#getbalances) | **GET** /v2/balances | Get available balances
*LedgerPublicApi* | [**getStatementsTransactionsForCustomer**](docs/LedgerPublicApi.md#getstatementstransactionsforcustomer) | **GET** /v2/ledger-transactions | Get ledger transactions
*PaymentsApi* | [**createPayment**](docs/PaymentsApi.md#createpayment) | **POST** /v2/payments | Create payment (v2)
*PaymentsApi* | [**getPaymentById**](docs/PaymentsApi.md#getpaymentbyid) | **GET** /v2/payments/{paymentId} | Get a payment by ID (v2)
*PaymentsApi* | [**getPaymentStateTransitionsById**](docs/PaymentsApi.md#getpaymentstatetransitionsbyid) | **GET** /v2/payments/{paymentId}/states | Get state transitions by payment ID (v2)
*PaymentsApi* | [**searchPayments**](docs/PaymentsApi.md#searchpayments) | **POST** /v2/payments/filter | Search payments
*PaymentsApi* | [**updatePaymentLabels**](docs/PaymentsApi.md#updatepaymentlabels) | **PATCH** /v2/payments/{paymentId}/labels | Update payment labels (v2)
*PaymentsV2Api* | [**createPaymentV2**](docs/PaymentsV2Api.md#createpaymentv2) | **POST** /v3/payments | Create payment (v3)
*PaymentsV2Api* | [**getPaymentByIdV2**](docs/PaymentsV2Api.md#getpaymentbyidv2) | **GET** /v3/payments/{paymentId} | Get a payment by ID (v3)
*PaymentsV2Api* | [**getPaymentStateTransitionsByIdV2**](docs/PaymentsV2Api.md#getpaymentstatetransitionsbyidv2) | **GET** /v3/payments/{paymentId}/states | Get state transitions by payment ID (v3)
*PaymentsV2Api* | [**searchPaymentsV2**](docs/PaymentsV2Api.md#searchpaymentsv2) | **POST** /v3/payments/filter | Search payments (v3)
*PaymentsV2Api* | [**updatePaymentLabelsV2**](docs/PaymentsV2Api.md#updatepaymentlabelsv2) | **PATCH** /v3/payments/{paymentId}/labels | Update payment labels (v3)
*QuoteApi* | [**createQuoteCollection**](docs/QuoteApi.md#createquotecollection) | **POST** /v2/quotes/quote-collection | Create quote collection
*QuoteApi* | [**getQuote**](docs/QuoteApi.md#getquote) | **GET** /v2/quotes/{quote-id} | Get quote
*QuoteApi* | [**getQuoteCollection**](docs/QuoteApi.md#getquotecollection) | **GET** /v2/quotes/quote-collection/{quote-collection-id} | Get quote collection


### Documentation For Models

 - [AdjustedExchangeRate](docs/AdjustedExchangeRate.md)
 - [AfricaBankPayout](docs/AfricaBankPayout.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [AuthenticationResponse](docs/AuthenticationResponse.md)
 - [BrPix](docs/BrPix.md)
 - [BrTed](docs/BrTed.md)
 - [BusinessIdentity](docs/BusinessIdentity.md)
 - [BusinessIdentityAddress](docs/BusinessIdentityAddress.md)
 - [BusinessIdentityRegistrationInner](docs/BusinessIdentityRegistrationInner.md)
 - [CaEft](docs/CaEft.md)
 - [CoPse](docs/CoPse.md)
 - [CreateFinancialInstrumentResponse](docs/CreateFinancialInstrumentResponse.md)
 - [CreateIdentityRequestV2](docs/CreateIdentityRequestV2.md)
 - [CreateIdentityRequestV3](docs/CreateIdentityRequestV3.md)
 - [CreateIdentityResponse](docs/CreateIdentityResponse.md)
 - [CreateIdentityResponseV3](docs/CreateIdentityResponseV3.md)
 - [Destination](docs/Destination.md)
 - [DestinationV2](docs/DestinationV2.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [EuSepa](docs/EuSepa.md)
 - [FeeSummary](docs/FeeSummary.md)
 - [FinancialInstrumentMetadata](docs/FinancialInstrumentMetadata.md)
 - [GbFps](docs/GbFps.md)
 - [GetBalances200Response](docs/GetBalances200Response.md)
 - [GetBalances200ResponseBalancesInner](docs/GetBalances200ResponseBalancesInner.md)
 - [GetBalances400Response](docs/GetBalances400Response.md)
 - [GetBalances400ResponseErrorsInner](docs/GetBalances400ResponseErrorsInner.md)
 - [GetFinancialInstrumentResponse](docs/GetFinancialInstrumentResponse.md)
 - [GetIdentityResponseV3](docs/GetIdentityResponseV3.md)
 - [GetStatementsTransactionsForCustomer200ResponseInner](docs/GetStatementsTransactionsForCustomer200ResponseInner.md)
 - [GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner](docs/GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner.md)
 - [IdentityResponseV2](docs/IdentityResponseV2.md)
 - [IdentityResponseV3](docs/IdentityResponseV3.md)
 - [IdentityTypeV2](docs/IdentityTypeV2.md)
 - [IdentityV2](docs/IdentityV2.md)
 - [IndividualIdentity](docs/IndividualIdentity.md)
 - [IndividualIdentityAddress](docs/IndividualIdentityAddress.md)
 - [IndividualIdentityIdentityDocumentsInner](docs/IndividualIdentityIdentityDocumentsInner.md)
 - [ListFinancialInstrumentsResponse](docs/ListFinancialInstrumentsResponse.md)
 - [ListIdentitiesResponseV2](docs/ListIdentitiesResponseV2.md)
 - [ListIdentitiesResponseV3](docs/ListIdentitiesResponseV3.md)
 - [ModelError](docs/ModelError.md)
 - [MxSpei](docs/MxSpei.md)
 - [Originator](docs/Originator.md)
 - [OriginatorV2](docs/OriginatorV2.md)
 - [Page](docs/Page.md)
 - [Payment](docs/Payment.md)
 - [PaymentError](docs/PaymentError.md)
 - [PaymentErrorResponse](docs/PaymentErrorResponse.md)
 - [PaymentFilter](docs/PaymentFilter.md)
 - [PaymentFilterRangeType](docs/PaymentFilterRangeType.md)
 - [PaymentFilterV2](docs/PaymentFilterV2.md)
 - [PaymentRailObjects](docs/PaymentRailObjects.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PaymentRequestV2](docs/PaymentRequestV2.md)
 - [PaymentSortField](docs/PaymentSortField.md)
 - [PaymentState](docs/PaymentState.md)
 - [PaymentV2](docs/PaymentV2.md)
 - [PaymentWithDetails](docs/PaymentWithDetails.md)
 - [PaymentWithDetailsV2](docs/PaymentWithDetailsV2.md)
 - [PaymentsResponse](docs/PaymentsResponse.md)
 - [PaymentsResponseV2](docs/PaymentsResponseV2.md)
 - [PutIdentityRequestV3](docs/PutIdentityRequestV3.md)
 - [PutRippleFinancialInstrument](docs/PutRippleFinancialInstrument.md)
 - [PutRippleIdentity](docs/PutRippleIdentity.md)
 - [Quote](docs/Quote.md)
 - [QuoteAmountType](docs/QuoteAmountType.md)
 - [QuoteCollection](docs/QuoteCollection.md)
 - [QuoteCollectionRequest](docs/QuoteCollectionRequest.md)
 - [QuoteError](docs/QuoteError.md)
 - [QuoteErrorResponse](docs/QuoteErrorResponse.md)
 - [QuoteStatus](docs/QuoteStatus.md)
 - [RippleFinancialInstrument](docs/RippleFinancialInstrument.md)
 - [RippleFinancialInstrumentEntry](docs/RippleFinancialInstrumentEntry.md)
 - [RippleIdentity](docs/RippleIdentity.md)
 - [SearchPaymentsRequest](docs/SearchPaymentsRequest.md)
 - [SearchPaymentsRequestV2](docs/SearchPaymentsRequestV2.md)
 - [Sort](docs/Sort.md)
 - [SortV2](docs/SortV2.md)
 - [StateTransition](docs/StateTransition.md)
 - [StateTransitionV2](docs/StateTransitionV2.md)
 - [StateTransitionsResponse](docs/StateTransitionsResponse.md)
 - [StateTransitionsResponseV2](docs/StateTransitionsResponseV2.md)
 - [StateType](docs/StateType.md)
 - [TaxBreakdown](docs/TaxBreakdown.md)
 - [TaxSummary](docs/TaxSummary.md)
 - [TotalFeeBreakdown](docs/TotalFeeBreakdown.md)
 - [TransactionDetails](docs/TransactionDetails.md)
 - [TransactionDetailsV2](docs/TransactionDetailsV2.md)
 - [UpdateFinancialInstrumentResponse](docs/UpdateFinancialInstrumentResponse.md)
 - [UpdatePaymentLabelsRequest](docs/UpdatePaymentLabelsRequest.md)
 - [UpdatePaymentLabelsResponse](docs/UpdatePaymentLabelsResponse.md)
 - [UsAch](docs/UsAch.md)
 - [UsFedwire](docs/UsFedwire.md)
 - [UseCaseType](docs/UseCaseType.md)
 - [ValidateTokenResponse](docs/ValidateTokenResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation For Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
### Bearer

- **Type**: Bearer authentication (JWT)

<a id="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

