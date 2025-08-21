# QuoteApi

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createQuoteCollection**](QuoteApi.md#createQuoteCollection) | **POST** /v2/quotes/quote-collection | Create quote collection |
| [**getQuote**](QuoteApi.md#getQuote) | **GET** /v2/quotes/{quote-id} | Get quote |
| [**getQuoteCollection**](QuoteApi.md#getQuoteCollection) | **GET** /v2/quotes/quote-collection/{quote-collection-id} | Get quote collection |



## createQuoteCollection

> QuoteCollectionDTO createQuoteCollection(quoteCollectionRequestDTO)

Create quote collection

Creates a collection of quotes for a proposed payment.  **Tutorials**  * Learn how to [Create a quote](../../tutorials/create-a-payment/#create-a-quote-collection). 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.QuoteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        QuoteApi apiInstance = new QuoteApi(defaultClient);
        QuoteCollectionRequestDTO quoteCollectionRequestDTO = new QuoteCollectionRequestDTO(); // QuoteCollectionRequestDTO | Create quote collection request
        try {
            QuoteCollectionDTO result = apiInstance.createQuoteCollection(quoteCollectionRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuoteApi#createQuoteCollection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **quoteCollectionRequestDTO** | [**QuoteCollectionRequestDTO**](QuoteCollectionRequestDTO.md)| Create quote collection request | |

### Return type

[**QuoteCollectionDTO**](QuoteCollectionDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creates a collection of quotes |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | The principal identified by the authorization header doesn&#39;t have enough scopes to perform this operation |  -  |
| **500** | Internal server error |  -  |


## getQuote

> QuoteDTO getQuote(quoteId)

Get quote

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.QuoteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        QuoteApi apiInstance = new QuoteApi(defaultClient);
        UUID quoteId = UUID.fromString("22222222-aaaa-2222-bbbb-222222222222"); // UUID | The unique identifier of the quote to retrieve
        try {
            QuoteDTO result = apiInstance.getQuote(quoteId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuoteApi#getQuote");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **quoteId** | **UUID**| The unique identifier of the quote to retrieve | |

### Return type

[**QuoteDTO**](QuoteDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Valid quote found |  -  |
| **401** | Unauthorized request |  -  |
| **403** | The principal identified by the authorization header doesn&#39;t have enough scopes to perform this operation |  -  |
| **404** | Quote not found |  -  |
| **500** | Internal server error |  -  |


## getQuoteCollection

> QuoteCollectionDTO getQuoteCollection(quoteCollectionId)

Get quote collection

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.QuoteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        QuoteApi apiInstance = new QuoteApi(defaultClient);
        UUID quoteCollectionId = UUID.fromString("11111111-aaaa-2222-bbbb-222222222222"); // UUID | The unique identifier of the quote collection you want to retrieve
        try {
            QuoteCollectionDTO result = apiInstance.getQuoteCollection(quoteCollectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuoteApi#getQuoteCollection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **quoteCollectionId** | **UUID**| The unique identifier of the quote collection you want to retrieve | |

### Return type

[**QuoteCollectionDTO**](QuoteCollectionDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Valid quote collection found |  -  |
| **401** | Unauthorized request |  -  |
| **403** | The principal identified by the authorization header doesn&#39;t have enough scopes to perform this operation |  -  |
| **404** | Quote collection not found |  -  |
| **500** | Internal server error |  -  |

