# ripple_payments_direct.PaymentsApi

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_payment**](PaymentsApi.md#create_payment) | **POST** /v2/payments | Create payment
[**get_payment_by_id**](PaymentsApi.md#get_payment_by_id) | **GET** /v2/payments/{paymentId} | Get a payment by ID
[**get_payment_state_transitions_by_id**](PaymentsApi.md#get_payment_state_transitions_by_id) | **GET** /v2/payments/{paymentId}/states | Get state transitions by payment ID
[**search_payments**](PaymentsApi.md#search_payments) | **POST** /v2/payments/filter | Search payments
[**update_payment_labels**](PaymentsApi.md#update_payment_labels) | **PATCH** /v2/payments/{paymentId}/labels | Update payment labels


# **create_payment**
> Payment create_payment(payment_request)

Create payment

Create a payment

**Tutorials**

* Learn how to [Create a payment](../../tutorials/create-a-payment/).
* Learn how to [Create a third-party payment](../../tutorials/create-a-third-party-payment/).


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.payment import Payment
from ripple_payments_direct.models.payment_request import PaymentRequest
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
    api_instance = ripple_payments_direct.PaymentsApi(api_client)
    payment_request = ripple_payments_direct.PaymentRequest() # PaymentRequest | create payment request

    try:
        # Create payment
        api_response = api_instance.create_payment(payment_request)
        print("The response of PaymentsApi->create_payment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentsApi->create_payment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payment_request** | [**PaymentRequest**](PaymentRequest.md)| create payment request | 

### Return type

[**Payment**](Payment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Valid payment |  -  |
**400** | Invalid input variables for the payment. |  -  |
**402** | Problems related to payment limits. |  -  |
**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_payment_by_id**
> PaymentWithDetails get_payment_by_id(payment_id)

Get a payment by ID

Gets a payment by ID.

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.payment_with_details import PaymentWithDetails
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
    api_instance = ripple_payments_direct.PaymentsApi(api_client)
    payment_id = '7ea3399c-1234-5678-8d8f-d320ea406630' # str | Unique identifier of the payment to get.

    try:
        # Get a payment by ID
        api_response = api_instance.get_payment_by_id(payment_id)
        print("The response of PaymentsApi->get_payment_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentsApi->get_payment_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payment_id** | **str**| Unique identifier of the payment to get. | 

### Return type

[**PaymentWithDetails**](PaymentWithDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully fetched payment details. |  -  |
**400** | Invalid input variables for the payment. |  -  |
**404** | Payment not found. |  -  |
**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_payment_state_transitions_by_id**
> StateTransitionsResponse get_payment_state_transitions_by_id(payment_id)

Get state transitions by payment ID

Gets the state transitions for a payment by ID.

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.state_transitions_response import StateTransitionsResponse
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
    api_instance = ripple_payments_direct.PaymentsApi(api_client)
    payment_id = '7ea3399c-1234-5678-8d8f-d320ea406630' # str | Unique identifier of the payment for which you want to get state transition information.

    try:
        # Get state transitions by payment ID
        api_response = api_instance.get_payment_state_transitions_by_id(payment_id)
        print("The response of PaymentsApi->get_payment_state_transitions_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentsApi->get_payment_state_transitions_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payment_id** | **str**| Unique identifier of the payment for which you want to get state transition information. | 

### Return type

[**StateTransitionsResponse**](StateTransitionsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully fetched payment state transitions. |  -  |
**400** | Invalid input variables for the payment. |  -  |
**404** | Payment not found. |  -  |
**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_payments**
> PaymentsResponse search_payments(search_payments_request)

Search payments

Search for payments based on filtering criteria.

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.payments_response import PaymentsResponse
from ripple_payments_direct.models.search_payments_request import SearchPaymentsRequest
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
    api_instance = ripple_payments_direct.PaymentsApi(api_client)
    search_payments_request = ripple_payments_direct.SearchPaymentsRequest() # SearchPaymentsRequest | Search payments request

    try:
        # Search payments
        api_response = api_instance.search_payments(search_payments_request)
        print("The response of PaymentsApi->search_payments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentsApi->search_payments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_payments_request** | [**SearchPaymentsRequest**](SearchPaymentsRequest.md)| Search payments request | 

### Return type

[**PaymentsResponse**](PaymentsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Payments matching the specified filtering criteria. |  -  |
**400** | Invalid input variables for the request. |  -  |
**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_payment_labels**
> UpdatePaymentLabelsResponse update_payment_labels(payment_id, update_payment_labels_request)

Update payment labels

Add or remove labels for a payment.

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.update_payment_labels_request import UpdatePaymentLabelsRequest
from ripple_payments_direct.models.update_payment_labels_response import UpdatePaymentLabelsResponse
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
    api_instance = ripple_payments_direct.PaymentsApi(api_client)
    payment_id = '7ea3399c-1234-5678-8d8f-d320ea406630' # str | The unique ID that identifies the payment for which you want to update labels.
    update_payment_labels_request = ripple_payments_direct.UpdatePaymentLabelsRequest() # UpdatePaymentLabelsRequest | Labels to add to or remove from the payment.

    try:
        # Update payment labels
        api_response = api_instance.update_payment_labels(payment_id, update_payment_labels_request)
        print("The response of PaymentsApi->update_payment_labels:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentsApi->update_payment_labels: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payment_id** | **str**| The unique ID that identifies the payment for which you want to update labels. | 
 **update_payment_labels_request** | [**UpdatePaymentLabelsRequest**](UpdatePaymentLabelsRequest.md)| Labels to add to or remove from the payment. | 

### Return type

[**UpdatePaymentLabelsResponse**](UpdatePaymentLabelsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated the payment labels. |  -  |
**400** | Invalid input variables for the request. |  -  |
**404** | Payment not found. |  -  |
**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

