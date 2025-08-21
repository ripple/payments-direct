# ripple_payments_direct.LedgerPublicApi

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_balances**](LedgerPublicApi.md#get_balances) | **GET** /v2/balances | Get available balances


# **get_balances**
> GetBalances200Response get_balances(currency=currency)

Get available balances

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.get_balances200_response import GetBalances200Response
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
    api_instance = ripple_payments_direct.LedgerPublicApi(api_client)
    currency = 'currency_example' # str | The currency for which you want to get the balance. (optional)

    try:
        # Get available balances
        api_response = api_instance.get_balances(currency=currency)
        print("The response of LedgerPublicApi->get_balances:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LedgerPublicApi->get_balances: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| The currency for which you want to get the balance. | [optional] 

### Return type

[**GetBalances200Response**](GetBalances200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response containing balance details. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

