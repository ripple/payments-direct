# QuoteApi

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createQuoteCollectionV2**](#createquotecollectionv2) | **POST** /v3/quotes/quote-collection | Create quote collection|
|[**getQuoteCollectionV2**](#getquotecollectionv2) | **GET** /v3/quotes/quote-collection/{quote-collection-id} | Get quote collection|
|[**getQuoteV2**](#getquotev2) | **GET** /v3/quotes/{quote-id} | Get a quote|

# **createQuoteCollectionV2**
> QuoteCollectionV2 createQuoteCollectionV2(quoteCollectionRequestV2)

Creates a collection of quotes for a proposed payment, one for each payment rail available for the corridor. A payment rail Ripple can\'t price is left out. Each quote has its own `quoteId`, `paymentRail`, exchange rate, and fees, and all quotes in the collection have the same expiry time. To create the payment, use the `quoteId` of the quote you choose.  To request a quote for one payment rail only, include `paymentRail`. For valid values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference).  **Request notes:** - `payoutCategory` and `destinationBlockchainNetwork` aren\'t part of the request. For a stablecoin payout, the blockchain network is the payment rail, and you omit `destinationCountry`. - `paymentRail` is an optional request field. - The `payinCategory` values `FUNDED` and `T_PLUS_ONE` are not accepted. Use `PRE_FUNDING` in place of `FUNDED`, and `CREDIT_FUNDING` in place of `T_PLUS_ONE`. 

### Example

```typescript
import {
    QuoteApi,
    Configuration,
    QuoteCollectionRequestV2
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new QuoteApi(configuration);

let quoteCollectionRequestV2: QuoteCollectionRequestV2; //Create quote collection request

const { status, data } = await apiInstance.createQuoteCollectionV2(
    quoteCollectionRequestV2
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **quoteCollectionRequestV2** | **QuoteCollectionRequestV2**| Create quote collection request | |


### Return type

**QuoteCollectionV2**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Creates a collection of quotes |  -  |
|**400** | Bad request |  -  |
|**401** | Unauthorized request |  -  |
|**403** | The principal identified by the authorization header doesn\&#39;t have enough scopes to perform this operation |  -  |
|**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getQuoteCollectionV2**
> QuoteCollectionV2 getQuoteCollectionV2()

Retrieve a previously created quote collection by its unique identifier.  Use this endpoint to check the status of quotes (ACTIVE or EXPIRED) and retrieve quote details needed for payment creation. 

### Example

```typescript
import {
    QuoteApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new QuoteApi(configuration);

let quoteCollectionId: string; //The unique identifier of the quote collection you want to retrieve (default to undefined)

const { status, data } = await apiInstance.getQuoteCollectionV2(
    quoteCollectionId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **quoteCollectionId** | [**string**] | The unique identifier of the quote collection you want to retrieve | defaults to undefined|


### Return type

**QuoteCollectionV2**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Valid quote collection found |  -  |
|**401** | Unauthorized request |  -  |
|**403** | The principal identified by the authorization header doesn\&#39;t have enough scopes to perform this operation |  -  |
|**404** | Quote collection not found |  -  |
|**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getQuoteV2**
> QuoteV2 getQuoteV2()

Retrieve a specific quote by its unique identifier.  Use this endpoint to: - Verify quote details before creating a payment - Check if a quote is still active (not expired) - Retrieve the `quoteId` needed for payment creation  **Note:** Quotes expire after a defined period. Check the `quoteStatus` field to confirm the quote is `ACTIVE` before using it to create a payment. 

### Example

```typescript
import {
    QuoteApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new QuoteApi(configuration);

let quoteId: string; //The unique identifier of the quote to retrieve (default to undefined)

const { status, data } = await apiInstance.getQuoteV2(
    quoteId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **quoteId** | [**string**] | The unique identifier of the quote to retrieve | defaults to undefined|


### Return type

**QuoteV2**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Valid quote found |  -  |
|**401** | Unauthorized request |  -  |
|**403** | The principal identified by the authorization header doesn\&#39;t have enough scopes to perform this operation |  -  |
|**404** | Quote not found |  -  |
|**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

