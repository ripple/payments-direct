# QuoteApi

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createQuoteCollectionV2**](QuoteApi.md#createQuoteCollectionV2) | **POST** /v3/quotes/quote-collection | Create quote collection |
| [**getQuoteCollectionV2**](QuoteApi.md#getQuoteCollectionV2) | **GET** /v3/quotes/quote-collection/{quote-collection-id} | Get quote collection |
| [**getQuoteV2**](QuoteApi.md#getQuoteV2) | **GET** /v3/quotes/{quote-id} | Get a quote |



## createQuoteCollectionV2

> QuoteCollectionV2DTO createQuoteCollectionV2(quoteCollectionRequestV2DTO)

Create quote collection

Create a quote collection to preview the cost and terms of a proposed payment before initiating it.  **What&#39;s new in v3:** - &#x60;payoutCategory&#x60; and &#x60;destinationBlockchainNetwork&#x60; are no longer accepted in requests. - &#x60;paymentRail&#x60; is added as an optional field in the request to allow filtering quotes by a specific payment rail. When paymentRail is not passed, quotes will be returned for all supported payment rails.   **Tutorials** - &#x60;paymentRail&#x60; is added as an optional field in the request to allow filtering quotes by a specific payment rail. When paymentRail is not passed, quotes will be returned for all supported payment rails. For a list of supported values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference). 

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
        QuoteCollectionRequestV2DTO quoteCollectionRequestV2DTO = new QuoteCollectionRequestV2DTO(); // QuoteCollectionRequestV2DTO | Create quote collection request
        try {
            QuoteCollectionV2DTO result = apiInstance.createQuoteCollectionV2(quoteCollectionRequestV2DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuoteApi#createQuoteCollectionV2");
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
| **quoteCollectionRequestV2DTO** | [**QuoteCollectionRequestV2DTO**](QuoteCollectionRequestV2DTO.md)| Create quote collection request | |

### Return type

[**QuoteCollectionV2DTO**](QuoteCollectionV2DTO.md)

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


## getQuoteCollectionV2

> QuoteCollectionV2DTO getQuoteCollectionV2(quoteCollectionId)

Get quote collection

Retrieve a previously created quote collection by its unique identifier.  Use this endpoint to check the status of quotes (ACTIVE or EXPIRED) and retrieve quote details needed for payment creation. 

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
            QuoteCollectionV2DTO result = apiInstance.getQuoteCollectionV2(quoteCollectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuoteApi#getQuoteCollectionV2");
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

[**QuoteCollectionV2DTO**](QuoteCollectionV2DTO.md)

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


## getQuoteV2

> QuoteV2DTO getQuoteV2(quoteId)

Get a quote

Retrieve a specific quote by its unique identifier.  Use this endpoint to: - Verify quote details before creating a payment - Check if a quote is still active (not expired) - Retrieve the &#x60;quoteId&#x60; needed for payment creation  **Note:** Quotes expire after a defined period. Check the &#x60;quoteStatus&#x60; field to confirm the quote is &#x60;ACTIVE&#x60; before using it to create a payment. 

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
            QuoteV2DTO result = apiInstance.getQuoteV2(quoteId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuoteApi#getQuoteV2");
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

[**QuoteV2DTO**](QuoteV2DTO.md)

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

