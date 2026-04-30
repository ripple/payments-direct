# ripple_payments_direct.LedgerPublicApi

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_balances**](LedgerPublicApi.md#get_balances) | **GET** /v2/balances | Get available balances
[**get_statements_transactions_for_customer**](LedgerPublicApi.md#get_statements_transactions_for_customer) | **GET** /v2/ledger-transactions | Get ledger transactions


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

# **get_statements_transactions_for_customer**
> GetStatementsTransactionsForCustomer200Response get_statements_transactions_for_customer(currency, start_dttm, end_dttm, page_size, status=status, txn_reference=txn_reference, offset=offset, sort_key=sort_key, sort_direction=sort_direction)

Get ledger transactions

Retrieve a paginated list of ledger transactions within a specified date and time range. This endpoint returns detailed transaction data, including amounts, references, operations, and running balances.

### Example

* Bearer (JWT) Authentication (Bearer):

```python
import ripple_payments_direct
from ripple_payments_direct.models.get_statements_transactions_for_customer200_response import GetStatementsTransactionsForCustomer200Response
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
    currency = 'USD' # str | Three-letter ISO 4217 currency code for the transactions to return (for example, USD).
    start_dttm = '2022-02-27T08:30:00Z' # datetime | Start of the date and time range (inclusive), in UTC, for which you want to retrieve ledger transactions.
    end_dttm = '2022-02-27T08:30:00Z' # datetime | End of the date and time range (exclusive), in UTC, for which you want to retrieve ledger transactions.
    page_size = 25 # int | Number of records to return in the response page. Use page-size together with offset for offset-based pagination (default to 25)
    status = 'status_example' # str | Filter results by transaction status. Allowed values: - SUCCESS: the ledger transaction completed successfully. - PENDING: reserved for future use to represent an in-flight ledger transaction.  (optional)
    txn_reference = 'txn_reference_example' # str | Filter results by an exact transaction reference. Use this to locate all ledger transactions associated with a specific external reference. (optional)
    offset = 56 # int | Number of records to skip before starting to return results. Use this with page-size to implement offset-based pagination.  For example, `offset=25&page-size=25` returns the second page of results.  (optional)
    sort_key = 'sort_key_example' # str | Field to use for sorting the results. Allowed values include: - CREATED_AT: sort by transaction creation timestamp. - STATEMENT_OPERATION: sort by the operation type (for example, CREDIT, DEBIT). - STATEMENT_SOURCE: sort by the transaction source (for example, PAYMENTS, BANK). - STATEMENT_STATUS: sort by the ledger transaction status. - STATEMENT_TXN_REFERENCE: sort by the transaction reference. - STATEMENT_UPDATED_AT: sort by the last update timestamp.  (optional)
    sort_direction = 'sort_direction_example' # str | Sort direction. Allowed values: - ASC: ascending order. - DESC: descending order.  (optional)

    try:
        # Get ledger transactions
        api_response = api_instance.get_statements_transactions_for_customer(currency, start_dttm, end_dttm, page_size, status=status, txn_reference=txn_reference, offset=offset, sort_key=sort_key, sort_direction=sort_direction)
        print("The response of LedgerPublicApi->get_statements_transactions_for_customer:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LedgerPublicApi->get_statements_transactions_for_customer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Three-letter ISO 4217 currency code for the transactions to return (for example, USD). | 
 **start_dttm** | **datetime**| Start of the date and time range (inclusive), in UTC, for which you want to retrieve ledger transactions. | 
 **end_dttm** | **datetime**| End of the date and time range (exclusive), in UTC, for which you want to retrieve ledger transactions. | 
 **page_size** | **int**| Number of records to return in the response page. Use page-size together with offset for offset-based pagination | [default to 25]
 **status** | **str**| Filter results by transaction status. Allowed values: - SUCCESS: the ledger transaction completed successfully. - PENDING: reserved for future use to represent an in-flight ledger transaction.  | [optional] 
 **txn_reference** | **str**| Filter results by an exact transaction reference. Use this to locate all ledger transactions associated with a specific external reference. | [optional] 
 **offset** | **int**| Number of records to skip before starting to return results. Use this with page-size to implement offset-based pagination.  For example, &#x60;offset&#x3D;25&amp;page-size&#x3D;25&#x60; returns the second page of results.  | [optional] 
 **sort_key** | **str**| Field to use for sorting the results. Allowed values include: - CREATED_AT: sort by transaction creation timestamp. - STATEMENT_OPERATION: sort by the operation type (for example, CREDIT, DEBIT). - STATEMENT_SOURCE: sort by the transaction source (for example, PAYMENTS, BANK). - STATEMENT_STATUS: sort by the ledger transaction status. - STATEMENT_TXN_REFERENCE: sort by the transaction reference. - STATEMENT_UPDATED_AT: sort by the last update timestamp.  | [optional] 
 **sort_direction** | **str**| Sort direction. Allowed values: - ASC: ascending order. - DESC: descending order.  | [optional] 

### Return type

[**GetStatementsTransactionsForCustomer200Response**](GetStatementsTransactionsForCustomer200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A page of ledger statement transactions for the customer that match the specified query parameters. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

