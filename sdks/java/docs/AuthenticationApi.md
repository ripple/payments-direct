# AuthenticationApi

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticate**](AuthenticationApi.md#authenticate) | **POST** /v2/oauth/token | Request an access token |
| [**testAuthToken**](AuthenticationApi.md#testAuthToken) | **GET** /v2/oauth/token/test | Test access token |



## authenticate

> AuthenticationResponseDTO authenticate(authenticationRequestDTO, authorization)

Request an access token

Request an access token for authentication with Ripple APIs.  You need to request a token for the environment you want to authenticate with.  **Note**: The length of the access token isn&#39;t fixed, hence it can vary. Avoid validating tokens based on character length.  **Tutorials**  * Learn how to [Request an access token](../../tutorials/request-an-access-token/).  #### Environments  | Environment | Domain | Description | | --- | --- | --- | | Test | &#x60;api.test.ripple.com&#x60; | Test environment with simulated currency. | | Production | &#x60;api.ripple.com&#x60; | Production environment for Ripple Payments Direct | 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthenticationRequestDTO authenticationRequestDTO = new AuthenticationRequestDTO(); // AuthenticationRequestDTO | 
        String authorization = "Basic ZGVtbzpwQDU1dzByZA=="; // String | 
        try {
            AuthenticationResponseDTO result = apiInstance.authenticate(authenticationRequestDTO, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#authenticate");
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
| **authenticationRequestDTO** | [**AuthenticationRequestDTO**](AuthenticationRequestDTO.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

[**AuthenticationResponseDTO**](AuthenticationResponseDTO.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the authentication response object that includes the token, type, scopes, and expiry. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## testAuthToken

> List&lt;ValidateTokenResponseDTO&gt; testAuthToken()

Test access token

Test if an access token can be used for authentication with Ripple APIs and how much time remains on it.

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        try {
            List<ValidateTokenResponseDTO> result = apiInstance.testAuthToken();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#testAuthToken");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;ValidateTokenResponseDTO&gt;**](ValidateTokenResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | If a valid bearer token is supplied, the time remaining before the token expires is returned. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |

