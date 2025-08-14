# AuthenticationApi

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**authenticate**](#authenticate) | **POST** /v2/oauth/token | Request an access token|
|[**testAuthToken**](#testauthtoken) | **GET** /v2/oauth/token/test | Test access token|

# **authenticate**
> AuthenticationResponse authenticate(authenticationRequest)

Request an access token for authentication with Ripple APIs.  You need to request a token for the environment you want to authenticate with.  **Note**: The length of the access token isn\'t fixed, hence it can vary. Avoid validating tokens based on character length.  **Tutorials**  * Learn how to [Request an access token](../../tutorials/request-an-access-token/).  #### Environments  | Environment | Domain | Description | | --- | --- | --- | | Test | `api.test.ripple.com` | Test environment with simulated currency. | | Production | `api.ripple.com` | Production environment for Ripple Payments Direct | 

### Example

```typescript
import {
    AuthenticationApi,
    Configuration,
    AuthenticationRequest
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new AuthenticationApi(configuration);

let authenticationRequest: AuthenticationRequest; //
let authorization: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.authenticate(
    authenticationRequest,
    authorization
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **authenticationRequest** | **AuthenticationRequest**|  | |
| **authorization** | [**string**] |  | (optional) defaults to undefined|


### Return type

**AuthenticationResponse**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Returns the authentication response object that includes the token, type, scopes, and expiry. |  -  |
|**400** | Bad Request |  -  |
|**401** | Unauthorized |  -  |
|**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testAuthToken**
> Array<ValidateTokenResponse> testAuthToken()

Test if an access token can be used for authentication with Ripple APIs and how much time remains on it.

### Example

```typescript
import {
    AuthenticationApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new AuthenticationApi(configuration);

const { status, data } = await apiInstance.testAuthToken();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**Array<ValidateTokenResponse>**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | If a valid bearer token is supplied, the time remaining before the token expires is returned. |  -  |
|**400** | Bad Request |  -  |
|**401** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

