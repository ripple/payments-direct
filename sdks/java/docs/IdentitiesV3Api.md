# IdentitiesV3Api

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFinancialInstrument**](IdentitiesV3Api.md#createFinancialInstrument) | **POST** /v3/identities/{identity-id}/financial-instruments | Add a financial instrument (v3) |
| [**createIdentity**](IdentitiesV3Api.md#createIdentity) | **POST** /v3/identities | Create an identity (v3) |
| [**deactivateFinancialInstrumentV3**](IdentitiesV3Api.md#deactivateFinancialInstrumentV3) | **DELETE** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Deactivate a Financial Instrument (v3) |
| [**deactivateIdentityV3**](IdentitiesV3Api.md#deactivateIdentityV3) | **DELETE** /v3/identities/{identity-id} | Deactivate an identity (v3) |
| [**getFinancialInstrumentById**](IdentitiesV3Api.md#getFinancialInstrumentById) | **GET** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Get a financial instrument by ID (v3) |
| [**getFinancialInstruments**](IdentitiesV3Api.md#getFinancialInstruments) | **GET** /v3/identities/{identity-id}/financial-instruments | Get a list of financial instruments of the identity (v3) |
| [**getIdentities**](IdentitiesV3Api.md#getIdentities) | **GET** /v3/identities | Get a list of identities (v3) |
| [**getIdentityById**](IdentitiesV3Api.md#getIdentityById) | **GET** /v3/identities/{identity-id} | Get an identity by ID (v3) |
| [**getIdentityByInternalId**](IdentitiesV3Api.md#getIdentityByInternalId) | **GET** /v3/identities/by-internal-id/{internal-id} | Get an identity by Internal ID (v3) |
| [**putFinancialInstrument**](IdentitiesV3Api.md#putFinancialInstrument) | **PUT** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Update a financial instrument (v3) |
| [**putIdentity**](IdentitiesV3Api.md#putIdentity) | **PUT** /v3/identities/{identity-id} | Update an identity (v3) |



## createFinancialInstrument

> CreateFinancialInstrumentResponseDTO createFinancialInstrument(identityId, rippleFinancialInstrumentDTO)

Add a financial instrument (v3)

Create a financial instrument for the specified identity. The request body must include the payment rail (financialInstrumentType), currency or asset code, and the rail-specific details (for example, US ACH account numbers or a wallet address). In the current release, each identity can have **one** financial instrument. Future releases will support multiple instruments per identity. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String identityId = "2f4ac57f-c5ba-4051-b51f-b3565778717b"; // String | Unique identifier of the identity that will own the financial instrument.
        RippleFinancialInstrumentDTO rippleFinancialInstrumentDTO = new RippleFinancialInstrumentDTO(); // RippleFinancialInstrumentDTO | 
        try {
            CreateFinancialInstrumentResponseDTO result = apiInstance.createFinancialInstrument(identityId, rippleFinancialInstrumentDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#createFinancialInstrument");
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
| **identityId** | **String**| Unique identifier of the identity that will own the financial instrument. | |
| **rippleFinancialInstrumentDTO** | [**RippleFinancialInstrumentDTO**](RippleFinancialInstrumentDTO.md)|  | |

### Return type

[**CreateFinancialInstrumentResponseDTO**](CreateFinancialInstrumentResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Financial instrument created. |  -  |
| **400** | Invalid request. |  -  |
| **404** | Identity not found. |  -  |
| **500** | Internal processing error |  -  |


## createIdentity

> CreateIdentityResponseV3DTO createIdentity(createIdentityRequestV3DTO)

Create an identity (v3)

Create a new payment identity as an ORIGINATOR or BENEFICIARY for either an INDIVIDUAL or BUSINESS. The request body must follow the v3 identity schema and will be validated against corridor rules where applicable. On success, the API returns the new identityId and its initial version. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        CreateIdentityRequestV3DTO createIdentityRequestV3DTO = new CreateIdentityRequestV3DTO(); // CreateIdentityRequestV3DTO | 
        try {
            CreateIdentityResponseV3DTO result = apiInstance.createIdentity(createIdentityRequestV3DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#createIdentity");
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
| **createIdentityRequestV3DTO** | [**CreateIdentityRequestV3DTO**](CreateIdentityRequestV3DTO.md)|  | |

### Return type

[**CreateIdentityResponseV3DTO**](CreateIdentityResponseV3DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Identity created. |  -  |
| **400** | Invalid request. |  -  |
| **409** | Conflict - An identity with the provided internalId already exists. |  -  |
| **500** | Internal processing error. |  -  |


## deactivateFinancialInstrumentV3

> deactivateFinancialInstrumentV3(identityId, financialInstrumentId)

Deactivate a Financial Instrument (v3)

Deactivate a financial instrument of an Identity. Deactivation is permanent and prevents further use in payments. Historical versions remain available for audit. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String identityId = "2f4ac57f-c5ba-4051-b51f-b3565778717b"; // String | The unique ID of the identity.
        String financialInstrumentId = "c7e2f5b4-d1a2-4c3a-9e1b-4d5c6f7e8a9d"; // String | The ID of the financial instrument to deactivate.
        try {
            apiInstance.deactivateFinancialInstrumentV3(identityId, financialInstrumentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#deactivateFinancialInstrumentV3");
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
| **identityId** | **String**| The unique ID of the identity. | |
| **financialInstrumentId** | **String**| The ID of the financial instrument to deactivate. | |

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
| **204** | Financial Instrument deactivated. |  -  |
| **400** | Invalid request. |  -  |
| **404** | Financial Instrument not found for the identity. |  -  |
| **405** | Method not allowed. |  -  |
| **409** | Conflicting resource state. Identity/Financial Instrument already deactivated or cannot be deactivated. |  -  |
| **500** | Internal processing error. |  -  |


## deactivateIdentityV3

> deactivateIdentityV3(identityId)

Deactivate an identity (v3)

Deactivate an identity and its financial instruments. Deactivation is permanent and prevents further use in payments. Historical versions remain available for audit. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String identityId = "146f3c51-c313-47ce-b6f2-691c5a238b3e"; // String | ID of the identity to deactivate.
        try {
            apiInstance.deactivateIdentityV3(identityId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#deactivateIdentityV3");
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
| **identityId** | **String**| ID of the identity to deactivate. | |

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
| **204** | Identity deactivated. |  -  |
| **400** | Invalid request. |  -  |
| **404** | Identity not found. |  -  |
| **422** | Identity already deactivated or cannot be deactivated. |  -  |
| **500** | Internal processing error. |  -  |


## getFinancialInstrumentById

> GetFinancialInstrumentResponseDTO getFinancialInstrumentById(identityId, financialInstrumentId, version, expandIdentity)

Get a financial instrument by ID (v3)

Retrieves one financial instrument associated with the specified identity. In the current release, one instrument is retrieved at most because only a single instrument is allowed per identity. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String identityId = "2f4ac57f-c5ba-4051-b51f-b3565778717b"; // String | Unique identifier of the identity whose instruments you want to list.
        String financialInstrumentId = "2f4ac57f-c5ba-4051-b51f-b3565778717b"; // String | The ID of the financial instrument of the identity.
        String version = "2"; // String | Version of the identity
        Boolean expandIdentity = true; // Boolean | Optional parameter to expand the financial instrument details. If set to true, the details about the identity will be included in the response. 
        try {
            GetFinancialInstrumentResponseDTO result = apiInstance.getFinancialInstrumentById(identityId, financialInstrumentId, version, expandIdentity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#getFinancialInstrumentById");
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
| **identityId** | **String**| Unique identifier of the identity whose instruments you want to list. | |
| **financialInstrumentId** | **String**| The ID of the financial instrument of the identity. | |
| **version** | **String**| Version of the identity | [optional] |
| **expandIdentity** | **Boolean**| Optional parameter to expand the financial instrument details. If set to true, the details about the identity will be included in the response.  | [optional] |

### Return type

[**GetFinancialInstrumentResponseDTO**](GetFinancialInstrumentResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of financial instruments for the identity. |  -  |
| **400** | Identity ID or financial instrument ID is not valid |  -  |
| **404** | The specified identity-id does not exist. |  -  |
| **500** | Internal processing error |  -  |


## getFinancialInstruments

> ListFinancialInstrumentsResponseDTO getFinancialInstruments(identityId, version, nextToken, limit)

Get a list of financial instruments of the identity (v3)

List financial instruments for an identity.

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String identityId = "2f4ac57f-c5ba-4051-b51f-b3565778717b"; // String | Unique UUID string that maps to an identity
        String version = "2"; // String | Version of the identity
        String nextToken = "eyJrZXkxIjoidmFsdWVfMSIsImtleTIiOiJ2YWx1ZTIifQ=="; // String | The token to use for the next page of results. If provided, the API will return financial instruments after this token.
        Integer limit = 10; // Integer | The maximum number of financial instruments to return. Default is 10, maximum is 100.
        try {
            ListFinancialInstrumentsResponseDTO result = apiInstance.getFinancialInstruments(identityId, version, nextToken, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#getFinancialInstruments");
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
| **identityId** | **String**| Unique UUID string that maps to an identity | |
| **version** | **String**| Version of the identity | [optional] |
| **nextToken** | **String**| The token to use for the next page of results. If provided, the API will return financial instruments after this token. | [optional] |
| **limit** | **Integer**| The maximum number of financial instruments to return. Default is 10, maximum is 100. | [optional] [default to 10] |

### Return type

[**ListFinancialInstrumentsResponseDTO**](ListFinancialInstrumentsResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested financial instruments of the identity in JSON format |  -  |
| **400** | Invalid request |  -  |
| **404** | No identity or financial instruments found |  -  |
| **500** | Internal Processing Error |  -  |


## getIdentities

> ListIdentitiesResponseV3DTO getIdentities(paymentRole, nickName, limit, nextToken)

Get a list of identities (v3)

Retrieve identities for your tenant with optional filters. Use &#x60;limit&#x60; and &#x60;next-token&#x60; for pagination. The response includes a &#x60;data&#x60; array and an optional &#x60;nextToken&#x60;. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String paymentRole = "BENEFICIARY"; // String | Filter by payment role.
        String nickName = "Alice"; // String | Filter by nickname.
        Integer limit = 10; // Integer | Maximum number of identities to return. Default value is 10, maximum is 100.
        String nextToken = "eyJrZXkxIjoidmFsdWVfMSIsImtleTIiOiJ2YWx1ZTIifQ=="; // String | Opaque token to fetch the next page of results.
        try {
            ListIdentitiesResponseV3DTO result = apiInstance.getIdentities(paymentRole, nickName, limit, nextToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#getIdentities");
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
| **paymentRole** | **String**| Filter by payment role. | [optional] |
| **nickName** | **String**| Filter by nickname. | [optional] |
| **limit** | **Integer**| Maximum number of identities to return. Default value is 10, maximum is 100. | [optional] [default to 10] |
| **nextToken** | **String**| Opaque token to fetch the next page of results. | [optional] |

### Return type

[**ListIdentitiesResponseV3DTO**](ListIdentitiesResponseV3DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A page of identities. |  -  |
| **400** | Invalid request. |  -  |
| **404** | No identities found. |  -  |
| **500** | Internal processing error. |  -  |


## getIdentityById

> GetIdentityResponseV3DTO getIdentityById(identityId, version)

Get an identity by ID (v3)

Retrieve a specific identity by ID. If &#x60;version&#x60; is not provided, the latest version is returned. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String identityId = "2f4ac57f-c5ba-4051-b51f-b3565778717b"; // String | The ID of the identity to retrieve.
        String version = "2"; // String | Specific version to retrieve. If omitted, returns the latest version.
        try {
            GetIdentityResponseV3DTO result = apiInstance.getIdentityById(identityId, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#getIdentityById");
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
| **identityId** | **String**| The ID of the identity to retrieve. | |
| **version** | **String**| Specific version to retrieve. If omitted, returns the latest version. | [optional] |

### Return type

[**GetIdentityResponseV3DTO**](GetIdentityResponseV3DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Identity details. |  -  |
| **400** | Invalid identity ID. |  -  |
| **404** | Identity not found. |  -  |
| **500** | Internal processing error. |  -  |


## getIdentityByInternalId

> GetIdentityResponseV3DTO getIdentityByInternalId(internalId)

Get an identity by Internal ID (v3)

Retrieve a specific identity by its internal ID.  **Behavior:** - Only returns identities in the &#x60;ACTIVE&#x60; state. Deactivated identities will result in an error. - Always returns the latest version of the identity. Historical versions are not accessible through this endpoint. - If no active identity exists for the given &#x60;internal-id&#x60;, a 404 is returned. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String internalId = "customer-12345-uuid"; // String | The Internal ID of the identity to retrieve.
        try {
            GetIdentityResponseV3DTO result = apiInstance.getIdentityByInternalId(internalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#getIdentityByInternalId");
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
| **internalId** | **String**| The Internal ID of the identity to retrieve. | |

### Return type

[**GetIdentityResponseV3DTO**](GetIdentityResponseV3DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Identity details. |  -  |
| **400** | Invalid internal ID. |  -  |
| **404** | Active Identity not found. |  -  |
| **500** | Internal processing error. |  -  |


## putFinancialInstrument

> UpdateFinancialInstrumentResponseDTO putFinancialInstrument(identityId, financialInstrumentId, putRippleFinancialInstrumentDTO)

Update a financial instrument (v3)

Update editable fields of a financial instrument including rail-specific details and labels. The financialInstrumentType is immutable after creation. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String identityId = "2f4ac57f-c5ba-4051-b51f-b3565778717b"; // String | The unique ID of the identity.
        String financialInstrumentId = "c7e2f5b4-d1a2-4c3a-9e1b-4d5c6f7e8a9d"; // String | The ID of the financial instrument to update.
        PutRippleFinancialInstrumentDTO putRippleFinancialInstrumentDTO = new PutRippleFinancialInstrumentDTO(); // PutRippleFinancialInstrumentDTO | 
        try {
            UpdateFinancialInstrumentResponseDTO result = apiInstance.putFinancialInstrument(identityId, financialInstrumentId, putRippleFinancialInstrumentDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#putFinancialInstrument");
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
| **identityId** | **String**| The unique ID of the identity. | |
| **financialInstrumentId** | **String**| The ID of the financial instrument to update. | |
| **putRippleFinancialInstrumentDTO** | [**PutRippleFinancialInstrumentDTO**](PutRippleFinancialInstrumentDTO.md)|  | |

### Return type

[**UpdateFinancialInstrumentResponseDTO**](UpdateFinancialInstrumentResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Financial instrument updated. |  -  |
| **400** | Invalid request. |  -  |
| **404** | Identity or financial instrument not found. |  -  |
| **409** | Conflicting resource state. |  -  |
| **500** | Internal processing error. |  -  |


## putIdentity

> GetIdentityResponseV3DTO putIdentity(identityId, putIdentityRequestV3DTO)

Update an identity (v3)

Update all fields of an existing identity. Supports updates to PII fields and metadata. Each successful PUT creates a new version and preserves prior versions for audit. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.IdentitiesV3Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        IdentitiesV3Api apiInstance = new IdentitiesV3Api(defaultClient);
        String identityId = "2f4ac57f-c5ba-4051-b51f-b3565778717b"; // String | The ID of the identity to update.
        PutIdentityRequestV3DTO putIdentityRequestV3DTO = new PutIdentityRequestV3DTO(); // PutIdentityRequestV3DTO | 
        try {
            GetIdentityResponseV3DTO result = apiInstance.putIdentity(identityId, putIdentityRequestV3DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesV3Api#putIdentity");
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
| **identityId** | **String**| The ID of the identity to update. | |
| **putIdentityRequestV3DTO** | [**PutIdentityRequestV3DTO**](PutIdentityRequestV3DTO.md)|  | |

### Return type

[**GetIdentityResponseV3DTO**](GetIdentityResponseV3DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Identity updated. Latest version returned. |  -  |
| **400** | Invalid request. |  -  |
| **404** | Identity not found. |  -  |
| **409** | Conflict - The provided internalId already exists on a different identity. |  -  |
| **500** | Internal processing error. |  -  |

