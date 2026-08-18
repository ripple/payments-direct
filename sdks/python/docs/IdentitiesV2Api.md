# ripple_payments_direct.IdentitiesV2Api

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_identity_v2**](IdentitiesV2Api.md#create_identity_v2) | **POST** /v2/identities | Create a new identity (v2) - Legacy
[**deactivate_identity_v2**](IdentitiesV2Api.md#deactivate_identity_v2) | **DELETE** /v2/identities/{identity-id} | Delete an identity (v2) - Legacy
[**get_identities_v2**](IdentitiesV2Api.md#get_identities_v2) | **GET** /v2/identities | Get a list of identities (v2) - Legacy
[**get_identity_by_id_v2**](IdentitiesV2Api.md#get_identity_by_id_v2) | **GET** /v2/identities/{identity-id} | Get an identity by ID (v2) - Legacy


# **create_identity_v2**
> CreateIdentityResponse create_identity_v2(create_identity_request_v2)

Create a new identity (v2) - Legacy

Create a new identity.

<!-- **Tutorials**

* Learn how to [Create an identity](../../tutorials/create-an-identity/). -->


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.create_identity_request_v2 import CreateIdentityRequestV2
from ripple_payments_direct.models.create_identity_response import CreateIdentityResponse
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
    api_instance = ripple_payments_direct.IdentitiesV2Api(api_client)
    create_identity_request_v2 = ripple_payments_direct.CreateIdentityRequestV2() # CreateIdentityRequestV2 | 

    try:
        # Create a new identity (v2) - Legacy
        api_response = api_instance.create_identity_v2(create_identity_request_v2)
        print("The response of IdentitiesV2Api->create_identity_v2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV2Api->create_identity_v2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_identity_request_v2** | [**CreateIdentityRequestV2**](CreateIdentityRequestV2.md)|  | 

### Return type

[**CreateIdentityResponse**](CreateIdentityResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | successful operation |  -  |
**400** | Invalid Request |  -  |
**500** | Internal Processing Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_identity_v2**
> deactivate_identity_v2(identity_id)

Delete an identity (v2) - Legacy

Deactivate an identity and its financial instruments.
Deactivation is permanent and prevents further use in payments.
Historical versions remain available for audit.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
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
    api_instance = ripple_payments_direct.IdentitiesV2Api(api_client)
    identity_id = '146f3c51-c313-47ce-b6f2-691c5a238b3e' # str | ID of the identity to deactivate.

    try:
        # Delete an identity (v2) - Legacy
        api_instance.deactivate_identity_v2(identity_id)
    except Exception as e:
        print("Exception when calling IdentitiesV2Api->deactivate_identity_v2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| ID of the identity to deactivate. | 

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
**204** | Identity deactivated. |  -  |
**400** | Invalid request. |  -  |
**404** | Identity not found. |  -  |
**422** | Identity already deactivated or cannot be deactivated. |  -  |
**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_identities_v2**
> ListIdentitiesResponseV2 get_identities_v2(identity_type=identity_type, nick_name=nick_name)

Get a list of identities (v2) - Legacy

Get a list of identities that match the query parameters.

**Note**: Depending on the number of identities in your account, not all of them may be returned even if they match your query parameters.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.identity_type_v2 import IdentityTypeV2
from ripple_payments_direct.models.list_identities_response_v2 import ListIdentitiesResponseV2
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
    api_instance = ripple_payments_direct.IdentitiesV2Api(api_client)
    identity_type = ripple_payments_direct.IdentityTypeV2() # IdentityTypeV2 | The type of identities you want to retrieve (optional)
    nick_name = 'Successful Beneficiary' # str | The nickname for the identity provided at the time of identity creation (optional)

    try:
        # Get a list of identities (v2) - Legacy
        api_response = api_instance.get_identities_v2(identity_type=identity_type, nick_name=nick_name)
        print("The response of IdentitiesV2Api->get_identities_v2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV2Api->get_identities_v2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_type** | [**IdentityTypeV2**](.md)| The type of identities you want to retrieve | [optional] 
 **nick_name** | **str**| The nickname for the identity provided at the time of identity creation | [optional] 

### Return type

[**ListIdentitiesResponseV2**](ListIdentitiesResponseV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Requested identity info in JSON format |  -  |
**400** | Invalid request |  -  |
**404** | No identities found |  -  |
**500** | Internal Processing Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_identity_by_id_v2**
> IdentityResponseV2 get_identity_by_id_v2(identity_id, version=version)

Get an identity by ID (v2) - Legacy

Retrieve a specific identity by ID.
If `version` is not provided, the latest version is returned.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.identity_response_v2 import IdentityResponseV2
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
    api_instance = ripple_payments_direct.IdentitiesV2Api(api_client)
    identity_id = '146f3c51-c313-47ce-b6f2-691c5a238b3e' # str | The ID of the identity to retrieve.
    version = 2 # int | Specific version to retrieve. If omitted, returns the latest version. (optional)

    try:
        # Get an identity by ID (v2) - Legacy
        api_response = api_instance.get_identity_by_id_v2(identity_id, version=version)
        print("The response of IdentitiesV2Api->get_identity_by_id_v2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV2Api->get_identity_by_id_v2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| The ID of the identity to retrieve. | 
 **version** | **int**| Specific version to retrieve. If omitted, returns the latest version. | [optional] 

### Return type

[**IdentityResponseV2**](IdentityResponseV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Identity details. |  -  |
**400** | Invalid identity ID. |  -  |
**404** | Identity not found. |  -  |
**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

