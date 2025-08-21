# IdentitiesV2Api

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIdentityV2**](IdentitiesV2Api.md#createIdentityV2) | **POST** /v2/identities | Create a new identity |
| [**deactivateIdentityV2**](IdentitiesV2Api.md#deactivateIdentityV2) | **DELETE** /v2/identities/{identity-id} | Delete an identity |
| [**getIdentitiesV2**](IdentitiesV2Api.md#getIdentitiesV2) | **GET** /v2/identities | Get a list of identities |
| [**getIdentityByIdV2**](IdentitiesV2Api.md#getIdentityByIdV2) | **GET** /v2/identities/{identity-id} | Get an identity by ID |



## createIdentityV2

> CreateIdentityResponseDTO createIdentityV2(createIdentityRequestV2DTO)

Create a new identity

Create a new identity.  &lt;!-- **Tutorials**  * Learn how to [Create an identity](../../tutorials/create-an-identity/). --&gt; 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV2Api apiInstance = new IdentitiesV2Api(defaultClient);
        CreateIdentityRequestV2DTO createIdentityRequestV2DTO = new CreateIdentityRequestV2DTO(); // CreateIdentityRequestV2DTO | 
        try {
            CreateIdentityResponseDTO result = apiInstance.createIdentityV2(createIdentityRequestV2DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV2Api#createIdentityV2");
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
| **createIdentityRequestV2DTO** | [**CreateIdentityRequestV2DTO**](CreateIdentityRequestV2DTO.md)|  | |

### Return type

[**CreateIdentityResponseDTO**](CreateIdentityResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | Invalid Request |  -  |
| **500** | Internal Processing Error |  -  |


## deactivateIdentityV2

> deactivateIdentityV2(identityId)

Delete an identity

Delete an identity

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV2Api apiInstance = new IdentitiesV2Api(defaultClient);
        String identityId = "146f3c51-c313-47ce-b6f2-691c5a238b3e"; // String | Unique UUID string that maps to the identity to be deleted.
        try {
            apiInstance.deactivateIdentityV2(identityId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV2Api#deactivateIdentityV2");
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
| **identityId** | **String**| Unique UUID string that maps to the identity to be deleted. | |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The identity was deleted successfully |  -  |
| **400** | Identity id is not of UUID format |  -  |
| **404** | Invalid Identity id does not exist |  -  |
| **422** | Unprocessable Identity Id |  -  |
| **500** | Internal Processing Error |  -  |


## getIdentitiesV2

> ListIdentitiesResponseV2DTO getIdentitiesV2(identityType, nickName)

Get a list of identities

Get a list of identities that match the query parameters.  **Note**: Depending on the number of identities in your account, not all of them may be returned even if they match your query parameters. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV2Api apiInstance = new IdentitiesV2Api(defaultClient);
        IdentityTypeV2DTO identityType = IdentityTypeV2DTO.fromValue("SENDER"); // IdentityTypeV2DTO | The type of identities you want to retrieve
        String nickName = "Successful Beneficiary"; // String | The nickname for the identity provided at the time of identity creation
        try {
            ListIdentitiesResponseV2DTO result = apiInstance.getIdentitiesV2(identityType, nickName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV2Api#getIdentitiesV2");
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
| **identityType** | [**IdentityTypeV2DTO**](.md)| The type of identities you want to retrieve | [optional] [enum: SENDER, BENEFICIARY, ORIGINATOR] |
| **nickName** | **String**| The nickname for the identity provided at the time of identity creation | [optional] |

### Return type

[**ListIdentitiesResponseV2DTO**](ListIdentitiesResponseV2DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested identity info in JSON format |  -  |
| **400** | Invalid request |  -  |
| **404** | No identities found |  -  |
| **500** | Internal Processing Error |  -  |


## getIdentityByIdV2

> IdentityResponseV2DTO getIdentityByIdV2(identityId, version)

Get an identity by ID

Get an identity by its unique ID

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV2Api apiInstance = new IdentitiesV2Api(defaultClient);
        String identityId = "146f3c51-c313-47ce-b6f2-691c5a238b3e"; // String | The ID of the identity to get.
        Integer version = 2; // Integer | Version of the identity you want to retrieve.  **Note**: If you don't specify a version, the latest version of the identity is returned. 
        try {
            IdentityResponseV2DTO result = apiInstance.getIdentityByIdV2(identityId, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV2Api#getIdentityByIdV2");
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
| **identityId** | **String**| The ID of the identity to get. | |
| **version** | **Integer**| Version of the identity you want to retrieve.  **Note**: If you don&#39;t specify a version, the latest version of the identity is returned.  | [optional] |

### Return type

[**IdentityResponseV2DTO**](IdentityResponseV2DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested identity info in JSON format |  -  |
| **400** | Identity ID is not in UUID format |  -  |
| **404** | Invalid - identity ID does not exist |  -  |

