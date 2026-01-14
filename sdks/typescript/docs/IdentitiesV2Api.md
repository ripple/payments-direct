# IdentitiesV2Api

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createIdentityV2**](#createidentityv2) | **POST** /v2/identities | Create a new identity (v2) - Legacy|
|[**deactivateIdentityV2**](#deactivateidentityv2) | **DELETE** /v2/identities/{identity-id} | Delete an identity (v2) - Legacy|
|[**getIdentitiesV2**](#getidentitiesv2) | **GET** /v2/identities | Get a list of identities (v2) - Legacy|
|[**getIdentityByIdV2**](#getidentitybyidv2) | **GET** /v2/identities/{identity-id} | Get an identity by ID (v2) - Legacy|

# **createIdentityV2**
> CreateIdentityResponse createIdentityV2(createIdentityRequestV2)

Create a new identity.  <!-- **Tutorials**  * Learn how to [Create an identity](../../tutorials/create-an-identity/). --> 

### Example

```typescript
import {
    IdentitiesV2Api,
    Configuration,
    CreateIdentityRequestV2
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV2Api(configuration);

let createIdentityRequestV2: CreateIdentityRequestV2; //

const { status, data } = await apiInstance.createIdentityV2(
    createIdentityRequestV2
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createIdentityRequestV2** | **CreateIdentityRequestV2**|  | |


### Return type

**CreateIdentityResponse**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | successful operation |  -  |
|**400** | Invalid Request |  -  |
|**500** | Internal Processing Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateIdentityV2**
> deactivateIdentityV2()

Deactivate an identity and its financial instruments. Deactivation is permanent and prevents further use in payments. Historical versions remain available for audit. 

### Example

```typescript
import {
    IdentitiesV2Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV2Api(configuration);

let identityId: string; //ID of the identity to deactivate. (default to undefined)

const { status, data } = await apiInstance.deactivateIdentityV2(
    identityId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityId** | [**string**] | ID of the identity to deactivate. | defaults to undefined|


### Return type

void (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**204** | Identity deactivated. |  -  |
|**400** | Invalid request. |  -  |
|**404** | Identity not found. |  -  |
|**422** | Identity already deactivated or cannot be deactivated. |  -  |
|**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIdentitiesV2**
> ListIdentitiesResponseV2 getIdentitiesV2()

Get a list of identities that match the query parameters.  **Note**: Depending on the number of identities in your account, not all of them may be returned even if they match your query parameters. 

### Example

```typescript
import {
    IdentitiesV2Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV2Api(configuration);

let identityType: IdentityTypeV2; //The type of identities you want to retrieve (optional) (default to undefined)
let nickName: string; //The nickname for the identity provided at the time of identity creation (optional) (default to undefined)

const { status, data } = await apiInstance.getIdentitiesV2(
    identityType,
    nickName
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityType** | **IdentityTypeV2** | The type of identities you want to retrieve | (optional) defaults to undefined|
| **nickName** | [**string**] | The nickname for the identity provided at the time of identity creation | (optional) defaults to undefined|


### Return type

**ListIdentitiesResponseV2**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Requested identity info in JSON format |  -  |
|**400** | Invalid request |  -  |
|**404** | No identities found |  -  |
|**500** | Internal Processing Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIdentityByIdV2**
> IdentityResponseV2 getIdentityByIdV2()

Retrieve a specific identity by ID. If `version` is not provided, the latest version is returned. 

### Example

```typescript
import {
    IdentitiesV2Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV2Api(configuration);

let identityId: string; //The ID of the identity to retrieve. (default to undefined)
let version: number; //Specific version to retrieve. If omitted, returns the latest version. (optional) (default to undefined)

const { status, data } = await apiInstance.getIdentityByIdV2(
    identityId,
    version
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityId** | [**string**] | The ID of the identity to retrieve. | defaults to undefined|
| **version** | [**number**] | Specific version to retrieve. If omitted, returns the latest version. | (optional) defaults to undefined|


### Return type

**IdentityResponseV2**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Identity details. |  -  |
|**400** | Invalid identity ID. |  -  |
|**404** | Identity not found. |  -  |
|**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

