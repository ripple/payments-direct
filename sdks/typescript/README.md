## @ripple/payments-direct-client@2026.04

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
npm install @ripple/payments-direct-client@2026.04 --save
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
*IdentitiesV3Api* | [**createFinancialInstrument**](docs/IdentitiesV3Api.md#createfinancialinstrument) | **POST** /v3/identities/{identity-id}/financial-instruments | Add a financial instrument (v3)
*IdentitiesV3Api* | [**createIdentity**](docs/IdentitiesV3Api.md#createidentity) | **POST** /v3/identities | Create an identity (v3)
*IdentitiesV3Api* | [**deactivateFinancialInstrumentV3**](docs/IdentitiesV3Api.md#deactivatefinancialinstrumentv3) | **DELETE** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Deactivate a Financial Instrument (v3)
*IdentitiesV3Api* | [**deactivateIdentityV3**](docs/IdentitiesV3Api.md#deactivateidentityv3) | **DELETE** /v3/identities/{identity-id} | Deactivate an identity (v3)
*IdentitiesV3Api* | [**getFinancialInstrumentById**](docs/IdentitiesV3Api.md#getfinancialinstrumentbyid) | **GET** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Get a financial instrument by ID (v3)
*IdentitiesV3Api* | [**getFinancialInstruments**](docs/IdentitiesV3Api.md#getfinancialinstruments) | **GET** /v3/identities/{identity-id}/financial-instruments | Get a list of financial instruments of the identity (v3)
*IdentitiesV3Api* | [**getIdentities**](docs/IdentitiesV3Api.md#getidentities) | **GET** /v3/identities | Get a list of identities (v3)
*IdentitiesV3Api* | [**getIdentityById**](docs/IdentitiesV3Api.md#getidentitybyid) | **GET** /v3/identities/{identity-id} | Get an identity by ID (v3)
*IdentitiesV3Api* | [**getIdentityByInternalId**](docs/IdentitiesV3Api.md#getidentitybyinternalid) | **GET** /v3/identities/by-internal-id/{internal-id} | Get an identity by Internal ID (v3)
*IdentitiesV3Api* | [**putFinancialInstrument**](docs/IdentitiesV3Api.md#putfinancialinstrument) | **PUT** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Update a financial instrument (v3)
*IdentitiesV3Api* | [**putIdentity**](docs/IdentitiesV3Api.md#putidentity) | **PUT** /v3/identities/{identity-id} | Update an identity (v3)
*LedgerPublicApi* | [**getBalances**](docs/LedgerPublicApi.md#getbalances) | **GET** /v2/balances | Get available balances
*LedgerPublicApi* | [**getStatementsTransactionsForCustomer**](docs/LedgerPublicApi.md#getstatementstransactionsforcustomer) | **GET** /v2/ledger-transactions | Get ledger transactions
*PaymentsV2Api* | [**createPaymentV2**](docs/PaymentsV2Api.md#createpaymentv2) | **POST** /v3/payments | Create payment V2
*PaymentsV2Api* | [**getPaymentByIdV2**](docs/PaymentsV2Api.md#getpaymentbyidv2) | **GET** /v3/payments/{paymentId} | Get a payment by ID V2
*PaymentsV2Api* | [**getPaymentStateTransitionsByIdV2**](docs/PaymentsV2Api.md#getpaymentstatetransitionsbyidv2) | **GET** /v3/payments/{paymentId}/states | Get state transitions by payment ID
*PaymentsV2Api* | [**searchPaymentsV2**](docs/PaymentsV2Api.md#searchpaymentsv2) | **POST** /v3/payments/filter | Search payments V2
*PaymentsV2Api* | [**updatePaymentLabelsV2**](docs/PaymentsV2Api.md#updatepaymentlabelsv2) | **PATCH** /v3/payments/{paymentId}/labels | Update payment labels
*QuoteApi* | [**createQuoteCollectionV2**](docs/QuoteApi.md#createquotecollectionv2) | **POST** /v3/quotes/quote-collection | Create quote collection
*QuoteApi* | [**getQuoteCollectionV2**](docs/QuoteApi.md#getquotecollectionv2) | **GET** /v3/quotes/quote-collection/{quote-collection-id} | Get quote collection
*QuoteApi* | [**getQuoteV2**](docs/QuoteApi.md#getquotev2) | **GET** /v3/quotes/{quote-id} | Get a quote


### Documentation For Models

 - [AdjustedExchangeRate](docs/AdjustedExchangeRate.md)
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
 - [CreateIdentityRequestV3](docs/CreateIdentityRequestV3.md)
 - [CreateIdentityResponseV3](docs/CreateIdentityResponseV3.md)
 - [DestinationV2](docs/DestinationV2.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [EuSepa](docs/EuSepa.md)
 - [FeeSummary](docs/FeeSummary.md)
 - [FeeSummaryV2](docs/FeeSummaryV2.md)
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
 - [IdentityResponseV3](docs/IdentityResponseV3.md)
 - [IndividualIdentity](docs/IndividualIdentity.md)
 - [IndividualIdentityAddress](docs/IndividualIdentityAddress.md)
 - [IndividualIdentityIdentityDocumentsInner](docs/IndividualIdentityIdentityDocumentsInner.md)
 - [ListFinancialInstrumentsResponse](docs/ListFinancialInstrumentsResponse.md)
 - [ListIdentitiesResponseV3](docs/ListIdentitiesResponseV3.md)
 - [ModelError](docs/ModelError.md)
 - [MxSpei](docs/MxSpei.md)
 - [NgBankPayout](docs/NgBankPayout.md)
 - [OriginatorV2](docs/OriginatorV2.md)
 - [Page](docs/Page.md)
 - [PaymentError](docs/PaymentError.md)
 - [PaymentErrorResponse](docs/PaymentErrorResponse.md)
 - [PaymentFilterV2](docs/PaymentFilterV2.md)
 - [PaymentRailObjects](docs/PaymentRailObjects.md)
 - [PaymentRequestV2](docs/PaymentRequestV2.md)
 - [PaymentV2](docs/PaymentV2.md)
 - [PaymentWithDetailsV2](docs/PaymentWithDetailsV2.md)
 - [PaymentsResponseV2](docs/PaymentsResponseV2.md)
 - [PayoutExecutionDetails](docs/PayoutExecutionDetails.md)
 - [PutIdentityRequestV3](docs/PutIdentityRequestV3.md)
 - [PutRippleFinancialInstrument](docs/PutRippleFinancialInstrument.md)
 - [PutRippleIdentity](docs/PutRippleIdentity.md)
 - [QuoteAmountType](docs/QuoteAmountType.md)
 - [QuoteCollectionRequestV2](docs/QuoteCollectionRequestV2.md)
 - [QuoteCollectionV2](docs/QuoteCollectionV2.md)
 - [QuoteError](docs/QuoteError.md)
 - [QuoteErrorResponse](docs/QuoteErrorResponse.md)
 - [QuoteStatus](docs/QuoteStatus.md)
 - [QuoteV2](docs/QuoteV2.md)
 - [RippleFinancialInstrument](docs/RippleFinancialInstrument.md)
 - [RippleFinancialInstrumentEntry](docs/RippleFinancialInstrumentEntry.md)
 - [RippleIdentity](docs/RippleIdentity.md)
 - [SearchPaymentsRequestV2](docs/SearchPaymentsRequestV2.md)
 - [SortV2](docs/SortV2.md)
 - [StateTransitionV2](docs/StateTransitionV2.md)
 - [StateTransitionsResponseV2](docs/StateTransitionsResponseV2.md)
 - [TaxBreakdown](docs/TaxBreakdown.md)
 - [TaxSummary](docs/TaxSummary.md)
 - [TotalFeeBreakdown](docs/TotalFeeBreakdown.md)
 - [TotalFeeBreakdownV2](docs/TotalFeeBreakdownV2.md)
 - [TrackingReference](docs/TrackingReference.md)
 - [TransactionDetailsV2](docs/TransactionDetailsV2.md)
 - [UpdateFinancialInstrumentResponse](docs/UpdateFinancialInstrumentResponse.md)
 - [UpdatePaymentLabelsRequest](docs/UpdatePaymentLabelsRequest.md)
 - [UpdatePaymentLabelsResponse](docs/UpdatePaymentLabelsResponse.md)
 - [UsAch](docs/UsAch.md)
 - [UsFedwire](docs/UsFedwire.md)
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

