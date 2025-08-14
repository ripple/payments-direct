# ripple_payments_direct.QuoteApi

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_quote_collection**](QuoteApi.md#create_quote_collection) | **POST** /v2/quotes/quote-collection | Create quote collection
[**get_quote**](QuoteApi.md#get_quote) | **GET** /v2/quotes/{quote-id} | Get quote
[**get_quote_collection**](QuoteApi.md#get_quote_collection) | **GET** /v2/quotes/quote-collection/{quote-collection-id} | Get quote collection


# **create_quote_collection**
> QuoteCollection create_quote_collection(quote_collection_request)

Create quote collection

Creates a collection of quotes for a proposed payment.

**Tutorials**

* Learn how to [Create a quote](../../tutorials/create-a-payment/#create-a-quote-collection).


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.quote_collection import QuoteCollection
from ripple_payments_direct.models.quote_collection_request import QuoteCollectionRequest
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
    api_instance = ripple_payments_direct.QuoteApi(api_client)
    quote_collection_request = ripple_payments_direct.QuoteCollectionRequest() # QuoteCollectionRequest | Create quote collection request

    try:
        # Create quote collection
        api_response = api_instance.create_quote_collection(quote_collection_request)
        print("The response of QuoteApi->create_quote_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QuoteApi->create_quote_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_collection_request** | [**QuoteCollectionRequest**](QuoteCollectionRequest.md)| Create quote collection request | 

### Return type

[**QuoteCollection**](QuoteCollection.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Creates a collection of quotes |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized request |  -  |
**403** | The principal identified by the authorization header doesn&#39;t have enough scopes to perform this operation |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_quote**
> Quote get_quote(quote_id)

Get quote

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.quote import Quote
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
    api_instance = ripple_payments_direct.QuoteApi(api_client)
    quote_id = '22222222-aaaa-2222-bbbb-222222222222' # str | The unique identifier of the quote to retrieve

    try:
        # Get quote
        api_response = api_instance.get_quote(quote_id)
        print("The response of QuoteApi->get_quote:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QuoteApi->get_quote: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_id** | **str**| The unique identifier of the quote to retrieve | 

### Return type

[**Quote**](Quote.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Valid quote found |  -  |
**401** | Unauthorized request |  -  |
**403** | The principal identified by the authorization header doesn&#39;t have enough scopes to perform this operation |  -  |
**404** | Quote not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_quote_collection**
> QuoteCollection get_quote_collection(quote_collection_id)

Get quote collection

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.quote_collection import QuoteCollection
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
    api_instance = ripple_payments_direct.QuoteApi(api_client)
    quote_collection_id = '11111111-aaaa-2222-bbbb-222222222222' # str | The unique identifier of the quote collection you want to retrieve

    try:
        # Get quote collection
        api_response = api_instance.get_quote_collection(quote_collection_id)
        print("The response of QuoteApi->get_quote_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QuoteApi->get_quote_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_collection_id** | **str**| The unique identifier of the quote collection you want to retrieve | 

### Return type

[**QuoteCollection**](QuoteCollection.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Valid quote collection found |  -  |
**401** | Unauthorized request |  -  |
**403** | The principal identified by the authorization header doesn&#39;t have enough scopes to perform this operation |  -  |
**404** | Quote collection not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

