# LedgerPublicApi

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalances**](LedgerPublicApi.md#getBalances) | **GET** /v2/balances | Get available balances |



## getBalances

> GetBalances200ResponseDTO getBalances(currency)

Get available balances

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.LedgerPublicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        LedgerPublicApi apiInstance = new LedgerPublicApi(defaultClient);
        String currency = "currency_example"; // String | The currency for which you want to get the balance.
        try {
            GetBalances200ResponseDTO result = apiInstance.getBalances(currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerPublicApi#getBalances");
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
| **currency** | **String**| The currency for which you want to get the balance. | [optional] |

### Return type

[**GetBalances200ResponseDTO**](GetBalances200ResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing balance details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized access |  -  |
| **500** | Internal server error |  -  |

