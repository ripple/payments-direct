## @ripple/payments-direct-client@0.0.2

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
npm install @ripple/payments-direct-client@0.0.2 --save
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
*IdentitiesV2Api* | [**createIdentityV2**](docs/IdentitiesV2Api.md#createidentityv2) | **POST** /v2/identities | Create a new identity
*IdentitiesV2Api* | [**deactivateIdentityV2**](docs/IdentitiesV2Api.md#deactivateidentityv2) | **DELETE** /v2/identities/{identity-id} | Delete an identity
*IdentitiesV2Api* | [**getIdentitiesV2**](docs/IdentitiesV2Api.md#getidentitiesv2) | **GET** /v2/identities | Get a list of identities
*IdentitiesV2Api* | [**getIdentityByIdV2**](docs/IdentitiesV2Api.md#getidentitybyidv2) | **GET** /v2/identities/{identity-id} | Get an identity by ID
*LedgerPublicApi* | [**getBalances**](docs/LedgerPublicApi.md#getbalances) | **GET** /v2/balances | Get available balances
*PaymentsApi* | [**createPayment**](docs/PaymentsApi.md#createpayment) | **POST** /v2/payments | Create payment
*PaymentsApi* | [**getPaymentById**](docs/PaymentsApi.md#getpaymentbyid) | **GET** /v2/payments/{paymentId} | Get a payment by ID
*PaymentsApi* | [**getPaymentStateTransitionsById**](docs/PaymentsApi.md#getpaymentstatetransitionsbyid) | **GET** /v2/payments/{paymentId}/states | Get state transitions by payment ID
*PaymentsApi* | [**searchPayments**](docs/PaymentsApi.md#searchpayments) | **POST** /v2/payments/filter | Search payments
*PaymentsApi* | [**updatePaymentLabels**](docs/PaymentsApi.md#updatepaymentlabels) | **PATCH** /v2/payments/{paymentId}/labels | Update payment labels
*QuoteApi* | [**createQuoteCollection**](docs/QuoteApi.md#createquotecollection) | **POST** /v2/quotes/quote-collection | Create quote collection
*QuoteApi* | [**getQuote**](docs/QuoteApi.md#getquote) | **GET** /v2/quotes/{quote-id} | Get quote
*QuoteApi* | [**getQuoteCollection**](docs/QuoteApi.md#getquotecollection) | **GET** /v2/quotes/quote-collection/{quote-collection-id} | Get quote collection


### Documentation For Models

 - [AdjustedExchangeRate](docs/AdjustedExchangeRate.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [AuthenticationResponse](docs/AuthenticationResponse.md)
 - [CreateIdentityRequestV2](docs/CreateIdentityRequestV2.md)
 - [CreateIdentityResponse](docs/CreateIdentityResponse.md)
 - [Destination](docs/Destination.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FeeSummary](docs/FeeSummary.md)
 - [GetBalances200Response](docs/GetBalances200Response.md)
 - [GetBalances200ResponseBalancesInner](docs/GetBalances200ResponseBalancesInner.md)
 - [GetBalances400Response](docs/GetBalances400Response.md)
 - [GetBalances400ResponseErrorsInner](docs/GetBalances400ResponseErrorsInner.md)
 - [IdentityResponseV2](docs/IdentityResponseV2.md)
 - [IdentityTypeV2](docs/IdentityTypeV2.md)
 - [IdentityV2](docs/IdentityV2.md)
 - [ListIdentitiesResponseV2](docs/ListIdentitiesResponseV2.md)
 - [ModelError](docs/ModelError.md)
 - [Originator](docs/Originator.md)
 - [Page](docs/Page.md)
 - [Payment](docs/Payment.md)
 - [PaymentError](docs/PaymentError.md)
 - [PaymentErrorResponse](docs/PaymentErrorResponse.md)
 - [PaymentFilter](docs/PaymentFilter.md)
 - [PaymentFilterRangeType](docs/PaymentFilterRangeType.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PaymentSortField](docs/PaymentSortField.md)
 - [PaymentState](docs/PaymentState.md)
 - [PaymentWithDetails](docs/PaymentWithDetails.md)
 - [PaymentsResponse](docs/PaymentsResponse.md)
 - [Quote](docs/Quote.md)
 - [QuoteAmountType](docs/QuoteAmountType.md)
 - [QuoteCollection](docs/QuoteCollection.md)
 - [QuoteCollectionRequest](docs/QuoteCollectionRequest.md)
 - [QuoteError](docs/QuoteError.md)
 - [QuoteErrorResponse](docs/QuoteErrorResponse.md)
 - [QuoteStatus](docs/QuoteStatus.md)
 - [SearchPaymentsRequest](docs/SearchPaymentsRequest.md)
 - [Sort](docs/Sort.md)
 - [StateTransition](docs/StateTransition.md)
 - [StateTransitionsResponse](docs/StateTransitionsResponse.md)
 - [StateType](docs/StateType.md)
 - [TotalFeeBreakdown](docs/TotalFeeBreakdown.md)
 - [TransactionDetails](docs/TransactionDetails.md)
 - [UpdatePaymentLabelsRequest](docs/UpdatePaymentLabelsRequest.md)
 - [UpdatePaymentLabelsResponse](docs/UpdatePaymentLabelsResponse.md)
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

