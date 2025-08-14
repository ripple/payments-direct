# QuoteApi

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createQuoteCollection**](#createquotecollection) | **POST** /v2/quotes/quote-collection | Create quote collection|
|[**getQuote**](#getquote) | **GET** /v2/quotes/{quote-id} | Get quote|
|[**getQuoteCollection**](#getquotecollection) | **GET** /v2/quotes/quote-collection/{quote-collection-id} | Get quote collection|

# **createQuoteCollection**
> QuoteCollection createQuoteCollection(quoteCollectionRequest)

Creates a collection of quotes for a proposed payment.  **Tutorials**  * Learn how to [Create a quote](../../tutorials/create-a-payment/#create-a-quote-collection). 

### Example

```typescript
import {
    QuoteApi,
    Configuration,
    QuoteCollectionRequest
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new QuoteApi(configuration);

let quoteCollectionRequest: QuoteCollectionRequest; //Create quote collection request

const { status, data } = await apiInstance.createQuoteCollection(
    quoteCollectionRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **quoteCollectionRequest** | **QuoteCollectionRequest**| Create quote collection request | |


### Return type

**QuoteCollection**

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

# **getQuote**
> Quote getQuote()


### Example

```typescript
import {
    QuoteApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new QuoteApi(configuration);

let quoteId: string; //The unique identifier of the quote to retrieve (default to undefined)

const { status, data } = await apiInstance.getQuote(
    quoteId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **quoteId** | [**string**] | The unique identifier of the quote to retrieve | defaults to undefined|


### Return type

**Quote**

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

# **getQuoteCollection**
> QuoteCollection getQuoteCollection()


### Example

```typescript
import {
    QuoteApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new QuoteApi(configuration);

let quoteCollectionId: string; //The unique identifier of the quote collection you want to retrieve (default to undefined)

const { status, data } = await apiInstance.getQuoteCollection(
    quoteCollectionId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **quoteCollectionId** | [**string**] | The unique identifier of the quote collection you want to retrieve | defaults to undefined|


### Return type

**QuoteCollection**

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

