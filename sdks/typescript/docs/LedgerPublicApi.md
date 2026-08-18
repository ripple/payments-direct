# LedgerPublicApi

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getBalances**](#getbalances) | **GET** /v2/balances | Get available balances|
|[**getStatementsTransactionsForCustomer**](#getstatementstransactionsforcustomer) | **GET** /v2/ledger-transactions | Get ledger transactions|

# **getBalances**
> GetBalances200Response getBalances()


### Example

```typescript
import {
    LedgerPublicApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new LedgerPublicApi(configuration);

let currency: string; //The currency for which you want to get the balance. (optional) (default to undefined)

const { status, data } = await apiInstance.getBalances(
    currency
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **currency** | [**string**] | The currency for which you want to get the balance. | (optional) defaults to undefined|


### Return type

**GetBalances200Response**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successful response containing balance details. |  -  |
|**400** | Bad request |  -  |
|**401** | Unauthorized access |  -  |
|**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStatementsTransactionsForCustomer**
> GetStatementsTransactionsForCustomer200Response getStatementsTransactionsForCustomer()

Retrieve a paginated list of ledger transactions for your tenant within a specified date and time range. This endpoint returns detailed transaction data, including amounts, references, operations, and running balances, so you can reconcile balance changes over time for a given currency. 

### Example

```typescript
import {
    LedgerPublicApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new LedgerPublicApi(configuration);

let currency: string; //Three-letter ISO 4217 currency code for the transactions to return (for example, USD).  (default to undefined)
let startDttm: string; //Start of the date and time range (inclusive), in UTC, for which you want to retrieve ledger transactions.  (default to undefined)
let endDttm: string; //End of the date and time range (exclusive), in UTC, for which you want to retrieve ledger transactions.  (default to undefined)
let pageSize: number; //Number of records to return in the response page. Use page-size together with offset for offset-based pagination  (default to 25)
let status: string; //Filter results by transaction status. Allowed values: - SUCCESS: the ledger transaction completed successfully. - PENDING: reserved for future use to represent an in-flight ledger transaction.  (optional) (default to undefined)
let txnReference: string; //Filter results by an exact transaction reference. Use this to locate all ledger transactions associated with a specific external reference.  (optional) (default to undefined)
let offset: number; //Number of records to skip before starting to return results. Use this with page-size to implement offset-based pagination. For example, `offset=25&page-size=25` returns the second page of results.  (optional) (default to undefined)
let sortKey: string; //Field to use for sorting the results. Allowed values include: - CREATED_AT: sort by transaction creation timestamp. - STATEMENT_OPERATION: sort by the operation type (for example, CREDIT, DEBIT). - STATEMENT_SOURCE: sort by the transaction source (for example, PAYMENTS, BANK). - STATEMENT_STATUS: sort by the ledger transaction status. - STATEMENT_TXN_REFERENCE: sort by the transaction reference. - STATEMENT_UPDATED_AT: sort by the last update timestamp.  (optional) (default to undefined)
let sortDirection: string; //Sort direction. Allowed values: - ASC: ascending order. - DESC: descending order.  (optional) (default to undefined)

const { status, data } = await apiInstance.getStatementsTransactionsForCustomer(
    currency,
    startDttm,
    endDttm,
    pageSize,
    status,
    txnReference,
    offset,
    sortKey,
    sortDirection
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **currency** | [**string**] | Three-letter ISO 4217 currency code for the transactions to return (for example, USD).  | defaults to undefined|
| **startDttm** | [**string**] | Start of the date and time range (inclusive), in UTC, for which you want to retrieve ledger transactions.  | defaults to undefined|
| **endDttm** | [**string**] | End of the date and time range (exclusive), in UTC, for which you want to retrieve ledger transactions.  | defaults to undefined|
| **pageSize** | [**number**] | Number of records to return in the response page. Use page-size together with offset for offset-based pagination  | defaults to 25|
| **status** | [**string**] | Filter results by transaction status. Allowed values: - SUCCESS: the ledger transaction completed successfully. - PENDING: reserved for future use to represent an in-flight ledger transaction.  | (optional) defaults to undefined|
| **txnReference** | [**string**] | Filter results by an exact transaction reference. Use this to locate all ledger transactions associated with a specific external reference.  | (optional) defaults to undefined|
| **offset** | [**number**] | Number of records to skip before starting to return results. Use this with page-size to implement offset-based pagination. For example, &#x60;offset&#x3D;25&amp;page-size&#x3D;25&#x60; returns the second page of results.  | (optional) defaults to undefined|
| **sortKey** | [**string**] | Field to use for sorting the results. Allowed values include: - CREATED_AT: sort by transaction creation timestamp. - STATEMENT_OPERATION: sort by the operation type (for example, CREDIT, DEBIT). - STATEMENT_SOURCE: sort by the transaction source (for example, PAYMENTS, BANK). - STATEMENT_STATUS: sort by the ledger transaction status. - STATEMENT_TXN_REFERENCE: sort by the transaction reference. - STATEMENT_UPDATED_AT: sort by the last update timestamp.  | (optional) defaults to undefined|
| **sortDirection** | [**string**] | Sort direction. Allowed values: - ASC: ascending order. - DESC: descending order.  | (optional) defaults to undefined|


### Return type

**GetStatementsTransactionsForCustomer200Response**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | A page of ledger statement transactions for the customer that match the specified query parameters. |  -  |
|**400** | Bad request |  -  |
|**401** | Unauthorized |  -  |
|**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

