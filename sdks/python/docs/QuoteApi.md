# ripple_payments_direct.QuoteApi

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_quote_collection_v2**](QuoteApi.md#create_quote_collection_v2) | **POST** /v3/quotes/quote-collection | Create quote collection
[**get_quote_collection_v2**](QuoteApi.md#get_quote_collection_v2) | **GET** /v3/quotes/quote-collection/{quote-collection-id} | Get quote collection
[**get_quote_v2**](QuoteApi.md#get_quote_v2) | **GET** /v3/quotes/{quote-id} | Get a quote


# **create_quote_collection_v2**
> QuoteCollectionV2 create_quote_collection_v2(quote_collection_request_v2)

Create quote collection

Create a quote collection to preview the cost and terms of a proposed payment before initiating it.

**What's new in v3:**
- `payoutCategory` and `destinationBlockchainNetwork` are no longer accepted in requests.
- `paymentRail` is added as an optional field in the request to allow filtering quotes by a specific payment rail. When paymentRail is not passed, quotes will be returned for all supported payment rails.

 **Tutorials**
- `paymentRail` is added as an optional field in the request to allow filtering quotes by a specific payment rail. When paymentRail is not passed, quotes will be returned for all supported payment rails. For a list of supported values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference).


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.quote_collection_request_v2 import QuoteCollectionRequestV2
from ripple_payments_direct.models.quote_collection_v2 import QuoteCollectionV2
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
    quote_collection_request_v2 = ripple_payments_direct.QuoteCollectionRequestV2() # QuoteCollectionRequestV2 | Create quote collection request

    try:
        # Create quote collection
        api_response = api_instance.create_quote_collection_v2(quote_collection_request_v2)
        print("The response of QuoteApi->create_quote_collection_v2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QuoteApi->create_quote_collection_v2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_collection_request_v2** | [**QuoteCollectionRequestV2**](QuoteCollectionRequestV2.md)| Create quote collection request | 

### Return type

[**QuoteCollectionV2**](QuoteCollectionV2.md)

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

# **get_quote_collection_v2**
> QuoteCollectionV2 get_quote_collection_v2(quote_collection_id)

Get quote collection

Retrieve a previously created quote collection by its unique identifier.

Use this endpoint to check the status of quotes (ACTIVE or EXPIRED) and retrieve quote details needed for payment creation.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.quote_collection_v2 import QuoteCollectionV2
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
        api_response = api_instance.get_quote_collection_v2(quote_collection_id)
        print("The response of QuoteApi->get_quote_collection_v2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QuoteApi->get_quote_collection_v2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_collection_id** | **str**| The unique identifier of the quote collection you want to retrieve | 

### Return type

[**QuoteCollectionV2**](QuoteCollectionV2.md)

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

# **get_quote_v2**
> QuoteV2 get_quote_v2(quote_id)

Get a quote

Retrieve a specific quote by its unique identifier.

Use this endpoint to:
- Verify quote details before creating a payment
- Check if a quote is still active (not expired)
- Retrieve the `quoteId` needed for payment creation

**Note:** Quotes expire after a defined period. Check the `quoteStatus` field to confirm the quote is `ACTIVE` before using it to create a payment.


### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.quote_v2 import QuoteV2
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
        # Get a quote
        api_response = api_instance.get_quote_v2(quote_id)
        print("The response of QuoteApi->get_quote_v2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QuoteApi->get_quote_v2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_id** | **str**| The unique identifier of the quote to retrieve | 

### Return type

[**QuoteV2**](QuoteV2.md)

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

