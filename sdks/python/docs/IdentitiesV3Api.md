# ripple_payments_direct.IdentitiesV3Api

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_financial_instrument**](IdentitiesV3Api.md#create_financial_instrument) | **POST** /v3/identities/{identity-id}/financial-instruments | Add a financial instrument (v3)
[**create_identity**](IdentitiesV3Api.md#create_identity) | **POST** /v3/identities | Create an identity (v3)
[**deactivate_financial_instrument_v3**](IdentitiesV3Api.md#deactivate_financial_instrument_v3) | **DELETE** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Deactivate a Financial Instrument (v3)
[**deactivate_identity_v3**](IdentitiesV3Api.md#deactivate_identity_v3) | **DELETE** /v3/identities/{identity-id} | Deactivate an identity (v3)
[**get_financial_instrument_by_id**](IdentitiesV3Api.md#get_financial_instrument_by_id) | **GET** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Get a financial instrument by ID (v3)
[**get_financial_instruments**](IdentitiesV3Api.md#get_financial_instruments) | **GET** /v3/identities/{identity-id}/financial-instruments | Get a list of financial instruments of the identity (v3)
[**get_identities**](IdentitiesV3Api.md#get_identities) | **GET** /v3/identities | Get a list of identities (v3)
[**get_identity_by_id**](IdentitiesV3Api.md#get_identity_by_id) | **GET** /v3/identities/{identity-id} | Get an identity by ID (v3)
[**put_financial_instrument**](IdentitiesV3Api.md#put_financial_instrument) | **PUT** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Update a financial instrument (v3)
[**put_identity**](IdentitiesV3Api.md#put_identity) | **PUT** /v3/identities/{identity-id} | Update an identity (v3)


# **create_financial_instrument**
> CreateFinancialInstrumentResponse create_financial_instrument(identity_id, ripple_financial_instrument)

Add a financial instrument (v3)

Create a financial instrument for the specified identity. The request body must include the payment rail (financialInstrumentType), currency or asset code, and the rail-specific details (for example, US ACH account numbers or a wallet address).
In the current release, each identity can have **one** financial instrument.
Future releases will support multiple instruments per identity.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.create_financial_instrument_response import CreateFinancialInstrumentResponse
from ripple_payments_direct.models.ripple_financial_instrument import RippleFinancialInstrument
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    identity_id = '2f4ac57f-c5ba-4051-b51f-b3565778717b' # str | Unique identifier of the identity that will own the financial instrument.
    ripple_financial_instrument = {"financialInstrumentType":"US_ACH","currency":"USD","label":"US bank account","usAch":{"bankName":"Bank of Example","bankRoutingNumber":"266231608","accountNumber":"60480","accountType":"CHECKING"}} # RippleFinancialInstrument | 

    try:
        # Add a financial instrument (v3)
        api_response = api_instance.create_financial_instrument(identity_id, ripple_financial_instrument)
        print("The response of IdentitiesV3Api->create_financial_instrument:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->create_financial_instrument: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| Unique identifier of the identity that will own the financial instrument. | 
 **ripple_financial_instrument** | [**RippleFinancialInstrument**](RippleFinancialInstrument.md)|  | 

### Return type

[**CreateFinancialInstrumentResponse**](CreateFinancialInstrumentResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Financial instrument created. |  -  |
**400** | Invalid request. |  -  |
**404** | Identity not found. |  -  |
**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_identity**
> CreateIdentityResponseV3 create_identity(create_identity_request_v3)

Create an identity (v3)

Create a new payment identity as an ORIGINATOR or BENEFICIARY for either an INDIVIDUAL or BUSINESS.
The request body must follow the v3 identity schema and will be validated against corridor rules where applicable.
On success, the API returns the new identityId and its initial version.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.create_identity_request_v3 import CreateIdentityRequestV3
from ripple_payments_direct.models.create_identity_response_v3 import CreateIdentityResponseV3
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    create_identity_request_v3 = {"identityType":"INDIVIDUAL","paymentRole":"ORIGINATOR","nickName":"Alice Sender USD","tags":["sender","priority"],"individual":{"firstName":"Alice","lastName":"Chen","dateOfBirth":"1990-05-14","citizenship":"US","address":{"streetAddress":["123 Main Street"],"city":"San Francisco","stateOrProvince":"CA","postalCode":"94105","country":"US"}}} # CreateIdentityRequestV3 | 

    try:
        # Create an identity (v3)
        api_response = api_instance.create_identity(create_identity_request_v3)
        print("The response of IdentitiesV3Api->create_identity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->create_identity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_identity_request_v3** | [**CreateIdentityRequestV3**](CreateIdentityRequestV3.md)|  | 

### Return type

[**CreateIdentityResponseV3**](CreateIdentityResponseV3.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Identity created. |  -  |
**400** | Invalid request. |  -  |
**409** | Conflict - An identity with the provided internalId already exists. |  -  |
**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_financial_instrument_v3**
> deactivate_financial_instrument_v3(identity_id, financial_instrument_id)

Deactivate a Financial Instrument (v3)

Deactivate a financial instrument of an Identity.
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    identity_id = '2f4ac57f-c5ba-4051-b51f-b3565778717b' # str | The unique ID of the identity.
    financial_instrument_id = 'c7e2f5b4-d1a2-4c3a-9e1b-4d5c6f7e8a9d' # str | The ID of the financial instrument to deactivate.

    try:
        # Deactivate a Financial Instrument (v3)
        api_instance.deactivate_financial_instrument_v3(identity_id, financial_instrument_id)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->deactivate_financial_instrument_v3: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| The unique ID of the identity. | 
 **financial_instrument_id** | **str**| The ID of the financial instrument to deactivate. | 

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
**204** | Financial Instrument deactivated. |  -  |
**400** | Invalid request. |  -  |
**404** | Financial Instrument not found for the identity. |  -  |
**405** | Method not allowed. |  -  |
**409** | Conflicting resource state. Identity/Financial Instrument already deactivated or cannot be deactivated. |  -  |
**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_identity_v3**
> deactivate_identity_v3(identity_id)

Deactivate an identity (v3)

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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    identity_id = '146f3c51-c313-47ce-b6f2-691c5a238b3e' # str | ID of the identity to deactivate.

    try:
        # Deactivate an identity (v3)
        api_instance.deactivate_identity_v3(identity_id)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->deactivate_identity_v3: %s\n" % e)
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
**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financial_instrument_by_id**
> GetFinancialInstrumentResponse get_financial_instrument_by_id(identity_id, financial_instrument_id, version=version, expand_identity=expand_identity)

Get a financial instrument by ID (v3)

Retrieves one financial instrument associated with the specified identity.
In the current release, one instrument is retrieved at most because only a single instrument is allowed per identity.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.get_financial_instrument_response import GetFinancialInstrumentResponse
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    identity_id = '2f4ac57f-c5ba-4051-b51f-b3565778717b' # str | Unique identifier of the identity whose instruments you want to list.
    financial_instrument_id = '2f4ac57f-c5ba-4051-b51f-b3565778717b' # str | The ID of the financial instrument of the identity.
    version = '2' # str | Version of the identity (optional)
    expand_identity = true # bool | Optional parameter to expand the financial instrument details. If set to true, the details about the identity will be included in the response.  (optional)

    try:
        # Get a financial instrument by ID (v3)
        api_response = api_instance.get_financial_instrument_by_id(identity_id, financial_instrument_id, version=version, expand_identity=expand_identity)
        print("The response of IdentitiesV3Api->get_financial_instrument_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->get_financial_instrument_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| Unique identifier of the identity whose instruments you want to list. | 
 **financial_instrument_id** | **str**| The ID of the financial instrument of the identity. | 
 **version** | **str**| Version of the identity | [optional] 
 **expand_identity** | **bool**| Optional parameter to expand the financial instrument details. If set to true, the details about the identity will be included in the response.  | [optional] 

### Return type

[**GetFinancialInstrumentResponse**](GetFinancialInstrumentResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of financial instruments for the identity. |  -  |
**400** | Identity ID or financial instrument ID is not valid |  -  |
**404** | The specified identity-id does not exist. |  -  |
**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financial_instruments**
> ListFinancialInstrumentsResponse get_financial_instruments(identity_id, version=version, next_token=next_token, limit=limit)

Get a list of financial instruments of the identity (v3)

List financial instruments for an identity.

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.list_financial_instruments_response import ListFinancialInstrumentsResponse
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    identity_id = '2f4ac57f-c5ba-4051-b51f-b3565778717b' # str | Unique UUID string that maps to an identity
    version = '2' # str | Version of the identity (optional)
    next_token = 'eyJrZXkxIjoidmFsdWVfMSIsImtleTIiOiJ2YWx1ZTIifQ==' # str | The token to use for the next page of results. If provided, the API will return financial instruments after this token. (optional)
    limit = 10 # int | The maximum number of financial instruments to return. Default is 10, maximum is 100. (optional) (default to 10)

    try:
        # Get a list of financial instruments of the identity (v3)
        api_response = api_instance.get_financial_instruments(identity_id, version=version, next_token=next_token, limit=limit)
        print("The response of IdentitiesV3Api->get_financial_instruments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->get_financial_instruments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| Unique UUID string that maps to an identity | 
 **version** | **str**| Version of the identity | [optional] 
 **next_token** | **str**| The token to use for the next page of results. If provided, the API will return financial instruments after this token. | [optional] 
 **limit** | **int**| The maximum number of financial instruments to return. Default is 10, maximum is 100. | [optional] [default to 10]

### Return type

[**ListFinancialInstrumentsResponse**](ListFinancialInstrumentsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Requested financial instruments of the identity in JSON format |  -  |
**400** | Invalid request |  -  |
**404** | No identity or financial instruments found |  -  |
**500** | Internal Processing Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_identities**
> ListIdentitiesResponseV3 get_identities(payment_role=payment_role, nick_name=nick_name, limit=limit, next_token=next_token)

Get a list of identities (v3)

Retrieve identities for your tenant with optional filters.
Use `limit` and `next-token` for pagination. The response includes a `data` array and an optional `nextToken`.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.list_identities_response_v3 import ListIdentitiesResponseV3
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    payment_role = 'BENEFICIARY' # str | Filter by payment role. (optional)
    nick_name = 'Alice' # str | Filter by nickname. (optional)
    limit = 10 # int | Maximum number of identities to return. Default value is 10, maximum is 100. (optional) (default to 10)
    next_token = 'eyJrZXkxIjoidmFsdWVfMSIsImtleTIiOiJ2YWx1ZTIifQ==' # str | Opaque token to fetch the next page of results. (optional)

    try:
        # Get a list of identities (v3)
        api_response = api_instance.get_identities(payment_role=payment_role, nick_name=nick_name, limit=limit, next_token=next_token)
        print("The response of IdentitiesV3Api->get_identities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->get_identities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payment_role** | **str**| Filter by payment role. | [optional] 
 **nick_name** | **str**| Filter by nickname. | [optional] 
 **limit** | **int**| Maximum number of identities to return. Default value is 10, maximum is 100. | [optional] [default to 10]
 **next_token** | **str**| Opaque token to fetch the next page of results. | [optional] 

### Return type

[**ListIdentitiesResponseV3**](ListIdentitiesResponseV3.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A page of identities. |  -  |
**400** | Invalid request. |  -  |
**404** | No identities found. |  -  |
**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_identity_by_id**
> GetIdentityResponseV3 get_identity_by_id(identity_id, version=version)

Get an identity by ID (v3)

Retrieve a specific identity by ID.
If `version` is not provided, the latest version is returned.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.get_identity_response_v3 import GetIdentityResponseV3
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    identity_id = '2f4ac57f-c5ba-4051-b51f-b3565778717b' # str | The ID of the identity to retrieve.
    version = '2' # str | Specific version to retrieve. If omitted, returns the latest version. (optional)

    try:
        # Get an identity by ID (v3)
        api_response = api_instance.get_identity_by_id(identity_id, version=version)
        print("The response of IdentitiesV3Api->get_identity_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->get_identity_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| The ID of the identity to retrieve. | 
 **version** | **str**| Specific version to retrieve. If omitted, returns the latest version. | [optional] 

### Return type

[**GetIdentityResponseV3**](GetIdentityResponseV3.md)

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

# **put_financial_instrument**
> UpdateFinancialInstrumentResponse put_financial_instrument(identity_id, financial_instrument_id, put_ripple_financial_instrument)

Update a financial instrument (v3)

Update editable fields of a financial instrument including rail-specific details and labels.
The financialInstrumentType is immutable after creation.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.put_ripple_financial_instrument import PutRippleFinancialInstrument
from ripple_payments_direct.models.update_financial_instrument_response import UpdateFinancialInstrumentResponse
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    identity_id = '2f4ac57f-c5ba-4051-b51f-b3565778717b' # str | The unique ID of the identity.
    financial_instrument_id = 'c7e2f5b4-d1a2-4c3a-9e1b-4d5c6f7e8a9d' # str | The ID of the financial instrument to update.
    put_ripple_financial_instrument = {"label":"Operating account"} # PutRippleFinancialInstrument | 

    try:
        # Update a financial instrument (v3)
        api_response = api_instance.put_financial_instrument(identity_id, financial_instrument_id, put_ripple_financial_instrument)
        print("The response of IdentitiesV3Api->put_financial_instrument:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->put_financial_instrument: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| The unique ID of the identity. | 
 **financial_instrument_id** | **str**| The ID of the financial instrument to update. | 
 **put_ripple_financial_instrument** | [**PutRippleFinancialInstrument**](PutRippleFinancialInstrument.md)|  | 

### Return type

[**UpdateFinancialInstrumentResponse**](UpdateFinancialInstrumentResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Financial instrument updated. |  -  |
**400** | Invalid request. |  -  |
**404** | Identity or financial instrument not found. |  -  |
**409** | Conflicting resource state. |  -  |
**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_identity**
> GetIdentityResponseV3 put_identity(identity_id, put_identity_request_v3)

Update an identity (v3)

Update all fields of an existing identity. Supports updates to PII fields and metadata.
Each successful PUT creates a new version and preserves prior versions for audit.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.get_identity_response_v3 import GetIdentityResponseV3
from ripple_payments_direct.models.put_identity_request_v3 import PutIdentityRequestV3
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
    api_instance = ripple_payments_direct.IdentitiesV3Api(api_client)
    identity_id = '2f4ac57f-c5ba-4051-b51f-b3565778717b' # str | The ID of the identity to update.
    put_identity_request_v3 = {"nickName":"Alice Sender USD - Updated","tags":["usd","high-value"]} # PutIdentityRequestV3 | 

    try:
        # Update an identity (v3)
        api_response = api_instance.put_identity(identity_id, put_identity_request_v3)
        print("The response of IdentitiesV3Api->put_identity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IdentitiesV3Api->put_identity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identity_id** | **str**| The ID of the identity to update. | 
 **put_identity_request_v3** | [**PutIdentityRequestV3**](PutIdentityRequestV3.md)|  | 

### Return type

[**GetIdentityResponseV3**](GetIdentityResponseV3.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Identity updated. Latest version returned. |  -  |
**400** | Invalid request. |  -  |
**404** | Identity not found. |  -  |
**409** | Conflict - The provided internalId already exists on a different identity. |  -  |
**500** | Internal processing error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

