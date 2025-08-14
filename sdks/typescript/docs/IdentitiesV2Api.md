# IdentitiesV2Api

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createIdentityV2**](#createidentityv2) | **POST** /v2/identities | Create a new identity|
|[**deactivateIdentityV2**](#deactivateidentityv2) | **DELETE** /v2/identities/{identity-id} | Delete an identity|
|[**getIdentitiesV2**](#getidentitiesv2) | **GET** /v2/identities | Get a list of identities|
|[**getIdentityByIdV2**](#getidentitybyidv2) | **GET** /v2/identities/{identity-id} | Get an identity by ID|

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

Delete an identity

### Example

```typescript
import {
    IdentitiesV2Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV2Api(configuration);

let identityId: string; //Unique UUID string that maps to the identity to be deleted. (default to undefined)

const { status, data } = await apiInstance.deactivateIdentityV2(
    identityId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityId** | [**string**] | Unique UUID string that maps to the identity to be deleted. | defaults to undefined|


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
|**204** | The identity was deleted successfully |  -  |
|**400** | Identity id is not of UUID format |  -  |
|**404** | Invalid Identity id does not exist |  -  |
|**422** | Unprocessable Identity Id |  -  |
|**500** | Internal Processing Error |  -  |

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

Get an identity by its unique ID

### Example

```typescript
import {
    IdentitiesV2Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV2Api(configuration);

let identityId: string; //The ID of the identity to get. (default to undefined)
let version: number; //Version of the identity you want to retrieve.  **Note**: If you don\'t specify a version, the latest version of the identity is returned.  (optional) (default to undefined)

const { status, data } = await apiInstance.getIdentityByIdV2(
    identityId,
    version
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityId** | [**string**] | The ID of the identity to get. | defaults to undefined|
| **version** | [**number**] | Version of the identity you want to retrieve.  **Note**: If you don\&#39;t specify a version, the latest version of the identity is returned.  | (optional) defaults to undefined|


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
|**200** | Requested identity info in JSON format |  -  |
|**400** | Identity ID is not in UUID format |  -  |
|**404** | Invalid - identity ID does not exist |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

