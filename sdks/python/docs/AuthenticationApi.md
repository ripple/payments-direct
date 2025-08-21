# ripple_payments_direct.AuthenticationApi

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticationApi.md#authenticate) | **POST** /v2/oauth/token | Request an access token
[**test_auth_token**](AuthenticationApi.md#test_auth_token) | **GET** /v2/oauth/token/test | Test access token


# **authenticate**
> AuthenticationResponse authenticate(authentication_request, authorization=authorization)

Request an access token

Request an access token for authentication with Ripple APIs.

You need to request a token for the environment you want to authenticate with.

**Note**: The length of the access token isn't fixed, hence it can vary. Avoid validating tokens based on character length.

**Tutorials**

* Learn how to [Request an access token](../../tutorials/request-an-access-token/).

#### Environments

| Environment | Domain | Description |
| --- | --- | --- |
| Test | `api.test.ripple.com` | Test environment with simulated currency. |
| Production | `api.ripple.com` | Production environment for Ripple Payments Direct |


### Example

* Basic Authentication (BasicAuth):

```python
import ripple_payments_direct
from ripple_payments_direct.models.authentication_request import AuthenticationRequest
from ripple_payments_direct.models.authentication_response import AuthenticationResponse
from ripple_payments_direct.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.test.ripple.com
# See configuration.py for a list of all supported configuration parameters.
configuration = ripple_payments_direct.Configuration(
    host = "https://api.test.ripple.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ripple_payments_direct.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with ripple_payments_direct.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ripple_payments_direct.AuthenticationApi(api_client)
    authentication_request = ripple_payments_direct.AuthenticationRequest() # AuthenticationRequest | 
    authorization = 'Basic ZGVtbzpwQDU1dzByZA==' # str |  (optional)

    try:
        # Request an access token
        api_response = api_instance.authenticate(authentication_request, authorization=authorization)
        print("The response of AuthenticationApi->authenticate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthenticationApi->authenticate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authentication_request** | [**AuthenticationRequest**](AuthenticationRequest.md)|  | 
 **authorization** | **str**|  | [optional] 

### Return type

[**AuthenticationResponse**](AuthenticationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the authentication response object that includes the token, type, scopes, and expiry. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **test_auth_token**
> List[ValidateTokenResponse] test_auth_token()

Test access token

Test if an access token can be used for authentication with Ripple APIs and how much time remains on it.

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.validate_token_response import ValidateTokenResponse
from ripple_payments_direct.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.test.ripple.com
# See configuration.py for a list of all supported configuration parameters.
configuration = ripple_payments_direct.Configuration(
    host = "https://api.test.ripple.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): Bearer
configuration = ripple_payments_direct.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with ripple_payments_direct.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ripple_payments_direct.AuthenticationApi(api_client)

    try:
        # Test access token
        api_response = api_instance.test_auth_token()
        print("The response of AuthenticationApi->test_auth_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthenticationApi->test_auth_token: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[ValidateTokenResponse]**](ValidateTokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | If a valid bearer token is supplied, the time remaining before the token expires is returned. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

