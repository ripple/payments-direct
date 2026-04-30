# IdentitiesV3Api

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createFinancialInstrument**](#createfinancialinstrument) | **POST** /v3/identities/{identity-id}/financial-instruments | Add a financial instrument (v3)|
|[**createIdentity**](#createidentity) | **POST** /v3/identities | Create an identity (v3)|
|[**deactivateFinancialInstrumentV3**](#deactivatefinancialinstrumentv3) | **DELETE** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Deactivate a Financial Instrument (v3)|
|[**deactivateIdentityV3**](#deactivateidentityv3) | **DELETE** /v3/identities/{identity-id} | Deactivate an identity (v3)|
|[**getFinancialInstrumentById**](#getfinancialinstrumentbyid) | **GET** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Get a financial instrument by ID (v3)|
|[**getFinancialInstruments**](#getfinancialinstruments) | **GET** /v3/identities/{identity-id}/financial-instruments | Get a list of financial instruments of the identity (v3)|
|[**getIdentities**](#getidentities) | **GET** /v3/identities | Get a list of identities (v3)|
|[**getIdentityById**](#getidentitybyid) | **GET** /v3/identities/{identity-id} | Get an identity by ID (v3)|
|[**getIdentityByInternalId**](#getidentitybyinternalid) | **GET** /v3/identities/by-internal-id/{internal-id} | Get an identity by Internal ID (v3)|
|[**putFinancialInstrument**](#putfinancialinstrument) | **PUT** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Update a financial instrument (v3)|
|[**putIdentity**](#putidentity) | **PUT** /v3/identities/{identity-id} | Update an identity (v3)|

# **createFinancialInstrument**
> CreateFinancialInstrumentResponse createFinancialInstrument(rippleFinancialInstrument)

Create a financial instrument for the specified identity. The request body must include the payment rail (financialInstrumentType), currency or asset code, and the rail-specific details (for example, US ACH account numbers or a wallet address). In the current release, each identity can have **one** financial instrument. Future releases will support multiple instruments per identity. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration,
    RippleFinancialInstrument
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let identityId: string; //Unique identifier of the identity that will own the financial instrument. (default to undefined)
let rippleFinancialInstrument: RippleFinancialInstrument; //

const { status, data } = await apiInstance.createFinancialInstrument(
    identityId,
    rippleFinancialInstrument
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **rippleFinancialInstrument** | **RippleFinancialInstrument**|  | |
| **identityId** | [**string**] | Unique identifier of the identity that will own the financial instrument. | defaults to undefined|


### Return type

**CreateFinancialInstrumentResponse**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Financial instrument created. |  -  |
|**400** | Invalid request. |  -  |
|**404** | Identity not found. |  -  |
|**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createIdentity**
> CreateIdentityResponseV3 createIdentity(createIdentityRequestV3)

Create a new payment identity as an ORIGINATOR or BENEFICIARY for either an INDIVIDUAL or BUSINESS. The request body must follow the v3 identity schema and will be validated against corridor rules where applicable. On success, the API returns the new identityId and its initial version. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration,
    CreateIdentityRequestV3
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let createIdentityRequestV3: CreateIdentityRequestV3; //

const { status, data } = await apiInstance.createIdentity(
    createIdentityRequestV3
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createIdentityRequestV3** | **CreateIdentityRequestV3**|  | |


### Return type

**CreateIdentityResponseV3**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Identity created. |  -  |
|**400** | Invalid request. |  -  |
|**409** | Conflict - An identity with the provided internalId already exists. |  -  |
|**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateFinancialInstrumentV3**
> deactivateFinancialInstrumentV3()

Deactivate a financial instrument of an Identity. Deactivation is permanent and prevents further use in payments. Historical versions remain available for audit. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let identityId: string; //The unique ID of the identity. (default to undefined)
let financialInstrumentId: string; //The ID of the financial instrument to deactivate. (default to undefined)

const { status, data } = await apiInstance.deactivateFinancialInstrumentV3(
    identityId,
    financialInstrumentId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityId** | [**string**] | The unique ID of the identity. | defaults to undefined|
| **financialInstrumentId** | [**string**] | The ID of the financial instrument to deactivate. | defaults to undefined|


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
|**204** | Financial Instrument deactivated. |  -  |
|**400** | Invalid request. |  -  |
|**404** | Financial Instrument not found for the identity. |  -  |
|**405** | Method not allowed. |  -  |
|**409** | Conflicting resource state. Identity/Financial Instrument already deactivated or cannot be deactivated. |  -  |
|**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateIdentityV3**
> deactivateIdentityV3()

Deactivate an identity and its financial instruments. Deactivation is permanent and prevents further use in payments. Historical versions remain available for audit. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let identityId: string; //ID of the identity to deactivate. (default to undefined)

const { status, data } = await apiInstance.deactivateIdentityV3(
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
|**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFinancialInstrumentById**
> GetFinancialInstrumentResponse getFinancialInstrumentById()

Retrieves one financial instrument associated with the specified identity. In the current release, one instrument is retrieved at most because only a single instrument is allowed per identity. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let identityId: string; //Unique identifier of the identity whose instruments you want to list. (default to undefined)
let financialInstrumentId: string; //The ID of the financial instrument of the identity. (default to undefined)
let version: string; //Version of the identity (optional) (default to undefined)
let expandIdentity: boolean; //Optional parameter to expand the financial instrument details. If set to true, the details about the identity will be included in the response.  (optional) (default to undefined)

const { status, data } = await apiInstance.getFinancialInstrumentById(
    identityId,
    financialInstrumentId,
    version,
    expandIdentity
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityId** | [**string**] | Unique identifier of the identity whose instruments you want to list. | defaults to undefined|
| **financialInstrumentId** | [**string**] | The ID of the financial instrument of the identity. | defaults to undefined|
| **version** | [**string**] | Version of the identity | (optional) defaults to undefined|
| **expandIdentity** | [**boolean**] | Optional parameter to expand the financial instrument details. If set to true, the details about the identity will be included in the response.  | (optional) defaults to undefined|


### Return type

**GetFinancialInstrumentResponse**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | List of financial instruments for the identity. |  -  |
|**400** | Identity ID or financial instrument ID is not valid |  -  |
|**404** | The specified identity-id does not exist. |  -  |
|**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFinancialInstruments**
> ListFinancialInstrumentsResponse getFinancialInstruments()

List financial instruments for an identity.

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let identityId: string; //Unique UUID string that maps to an identity (default to undefined)
let version: string; //Version of the identity (optional) (default to undefined)
let nextToken: string; //The token to use for the next page of results. If provided, the API will return financial instruments after this token. (optional) (default to undefined)
let limit: number; //The maximum number of financial instruments to return. Default is 10, maximum is 100. (optional) (default to 10)

const { status, data } = await apiInstance.getFinancialInstruments(
    identityId,
    version,
    nextToken,
    limit
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityId** | [**string**] | Unique UUID string that maps to an identity | defaults to undefined|
| **version** | [**string**] | Version of the identity | (optional) defaults to undefined|
| **nextToken** | [**string**] | The token to use for the next page of results. If provided, the API will return financial instruments after this token. | (optional) defaults to undefined|
| **limit** | [**number**] | The maximum number of financial instruments to return. Default is 10, maximum is 100. | (optional) defaults to 10|


### Return type

**ListFinancialInstrumentsResponse**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Requested financial instruments of the identity in JSON format |  -  |
|**400** | Invalid request |  -  |
|**404** | No identity or financial instruments found |  -  |
|**500** | Internal Processing Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIdentities**
> ListIdentitiesResponseV3 getIdentities()

Retrieve identities for your tenant with optional filters. Use `limit` and `next-token` for pagination. The response includes a `data` array and an optional `nextToken`. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let paymentRole: string; //Filter by payment role. (optional) (default to undefined)
let nickName: string; //Filter by nickname. (optional) (default to undefined)
let limit: number; //Maximum number of identities to return. Default value is 10, maximum is 100. (optional) (default to 10)
let nextToken: string; //Opaque token to fetch the next page of results. (optional) (default to undefined)

const { status, data } = await apiInstance.getIdentities(
    paymentRole,
    nickName,
    limit,
    nextToken
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **paymentRole** | [**string**] | Filter by payment role. | (optional) defaults to undefined|
| **nickName** | [**string**] | Filter by nickname. | (optional) defaults to undefined|
| **limit** | [**number**] | Maximum number of identities to return. Default value is 10, maximum is 100. | (optional) defaults to 10|
| **nextToken** | [**string**] | Opaque token to fetch the next page of results. | (optional) defaults to undefined|


### Return type

**ListIdentitiesResponseV3**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | A page of identities. |  -  |
|**400** | Invalid request. |  -  |
|**404** | No identities found. |  -  |
|**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIdentityById**
> GetIdentityResponseV3 getIdentityById()

Retrieve a specific identity by ID. If `version` is not provided, the latest version is returned. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let identityId: string; //The ID of the identity to retrieve. (default to undefined)
let version: string; //Specific version to retrieve. If omitted, returns the latest version. (optional) (default to undefined)

const { status, data } = await apiInstance.getIdentityById(
    identityId,
    version
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **identityId** | [**string**] | The ID of the identity to retrieve. | defaults to undefined|
| **version** | [**string**] | Specific version to retrieve. If omitted, returns the latest version. | (optional) defaults to undefined|


### Return type

**GetIdentityResponseV3**

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

# **getIdentityByInternalId**
> GetIdentityResponseV3 getIdentityByInternalId()

Retrieve a specific identity by its internal ID.  **Behavior:** - Only returns identities in the `ACTIVE` state. Deactivated identities will result in an error. - Always returns the latest version of the identity. Historical versions are not accessible through this endpoint. - If no active identity exists for the given `internal-id`, a 404 is returned. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let internalId: string; //The Internal ID of the identity to retrieve. (default to undefined)

const { status, data } = await apiInstance.getIdentityByInternalId(
    internalId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **internalId** | [**string**] | The Internal ID of the identity to retrieve. | defaults to undefined|


### Return type

**GetIdentityResponseV3**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Identity details. |  -  |
|**400** | Invalid internal ID. |  -  |
|**404** | Active Identity not found. |  -  |
|**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **putFinancialInstrument**
> UpdateFinancialInstrumentResponse putFinancialInstrument(putRippleFinancialInstrument)

Update editable fields of a financial instrument including rail-specific details and labels. The financialInstrumentType is immutable after creation. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration,
    PutRippleFinancialInstrument
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let identityId: string; //The unique ID of the identity. (default to undefined)
let financialInstrumentId: string; //The ID of the financial instrument to update. (default to undefined)
let putRippleFinancialInstrument: PutRippleFinancialInstrument; //

const { status, data } = await apiInstance.putFinancialInstrument(
    identityId,
    financialInstrumentId,
    putRippleFinancialInstrument
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **putRippleFinancialInstrument** | **PutRippleFinancialInstrument**|  | |
| **identityId** | [**string**] | The unique ID of the identity. | defaults to undefined|
| **financialInstrumentId** | [**string**] | The ID of the financial instrument to update. | defaults to undefined|


### Return type

**UpdateFinancialInstrumentResponse**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Financial instrument updated. |  -  |
|**400** | Invalid request. |  -  |
|**404** | Identity or financial instrument not found. |  -  |
|**409** | Conflicting resource state. |  -  |
|**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **putIdentity**
> GetIdentityResponseV3 putIdentity(putIdentityRequestV3)

Update all fields of an existing identity. Supports updates to PII fields and metadata. Each successful PUT creates a new version and preserves prior versions for audit. 

### Example

```typescript
import {
    IdentitiesV3Api,
    Configuration,
    PutIdentityRequestV3
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new IdentitiesV3Api(configuration);

let identityId: string; //The ID of the identity to update. (default to undefined)
let putIdentityRequestV3: PutIdentityRequestV3; //

const { status, data } = await apiInstance.putIdentity(
    identityId,
    putIdentityRequestV3
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **putIdentityRequestV3** | **PutIdentityRequestV3**|  | |
| **identityId** | [**string**] | The ID of the identity to update. | defaults to undefined|


### Return type

**GetIdentityResponseV3**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Identity updated. Latest version returned. |  -  |
|**400** | Invalid request. |  -  |
|**404** | Identity not found. |  -  |
|**409** | Conflict - The provided internalId already exists on a different identity. |  -  |
|**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

