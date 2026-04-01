# \LedgerPublicAPI

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBalances**](LedgerPublicAPI.md#GetBalances) | **Get** /v2/balances | Get available balances
[**GetStatementsTransactionsForCustomer**](LedgerPublicAPI.md#GetStatementsTransactionsForCustomer) | **Get** /v2/ledger-transactions | Get ledger transactions



## GetBalances

> GetBalances200Response GetBalances(ctx).Currency(currency).Execute()

Get available balances

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID/paymentsdirect"
)

func main() {
	currency := "currency_example" // string | The currency for which you want to get the balance. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LedgerPublicAPI.GetBalances(context.Background()).Currency(currency).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LedgerPublicAPI.GetBalances``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBalances`: GetBalances200Response
	fmt.Fprintf(os.Stdout, "Response from `LedgerPublicAPI.GetBalances`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBalancesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string** | The currency for which you want to get the balance. | 

### Return type

[**GetBalances200Response**](GetBalances200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetStatementsTransactionsForCustomer

> []GetStatementsTransactionsForCustomer200ResponseInner GetStatementsTransactionsForCustomer(ctx).Currency(currency).StartDttm(startDttm).EndDttm(endDttm).PageSize(pageSize).Status(status).TxnReference(txnReference).Offset(offset).SortKey(sortKey).SortDirection(sortDirection).Execute()

Get ledger transactions



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID/paymentsdirect"
)

func main() {
	currency := "USD" // string | Three-letter ISO 4217 currency code for the transactions to return (for example, USD). 
	startDttm := time.Now() // time.Time | Start of the date and time range (inclusive), in UTC, for which you want to retrieve ledger transactions. 
	endDttm := time.Now() // time.Time | End of the date and time range (exclusive), in UTC, for which you want to retrieve ledger transactions. 
	pageSize := int32(56) // int32 | Number of records to return in the response page. Use page-size together with offset for offset-based pagination  (default to 25)
	status := "status_example" // string | Filter results by transaction status. Allowed values: - SUCCESS: the ledger transaction completed successfully. - PENDING: reserved for future use to represent an in-flight ledger transaction.  (optional)
	txnReference := "txnReference_example" // string | Filter results by an exact transaction reference. Use this to locate all ledger transactions associated with a specific external reference.  (optional)
	offset := int32(56) // int32 | Number of records to skip before starting to return results. Use this with page-size to implement offset-based pagination. For example, `offset=25&page-size=25` returns the second page of results.  (optional)
	sortKey := "sortKey_example" // string | Field to use for sorting the results. Allowed values include: - CREATED_AT: sort by transaction creation timestamp. - STATEMENT_OPERATION: sort by the operation type (for example, CREDIT, DEBIT). - STATEMENT_SOURCE: sort by the transaction source (for example, PAYMENTS, BANK). - STATEMENT_STATUS: sort by the ledger transaction status. - STATEMENT_TXN_REFERENCE: sort by the transaction reference. - STATEMENT_UPDATED_AT: sort by the last update timestamp.  (optional)
	sortDirection := "sortDirection_example" // string | Sort direction. Allowed values: - ASC: ascending order. - DESC: descending order.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LedgerPublicAPI.GetStatementsTransactionsForCustomer(context.Background()).Currency(currency).StartDttm(startDttm).EndDttm(endDttm).PageSize(pageSize).Status(status).TxnReference(txnReference).Offset(offset).SortKey(sortKey).SortDirection(sortDirection).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LedgerPublicAPI.GetStatementsTransactionsForCustomer``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetStatementsTransactionsForCustomer`: []GetStatementsTransactionsForCustomer200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `LedgerPublicAPI.GetStatementsTransactionsForCustomer`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetStatementsTransactionsForCustomerRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string** | Three-letter ISO 4217 currency code for the transactions to return (for example, USD).  | 
 **startDttm** | **time.Time** | Start of the date and time range (inclusive), in UTC, for which you want to retrieve ledger transactions.  | 
 **endDttm** | **time.Time** | End of the date and time range (exclusive), in UTC, for which you want to retrieve ledger transactions.  | 
 **pageSize** | **int32** | Number of records to return in the response page. Use page-size together with offset for offset-based pagination  | [default to 25]
 **status** | **string** | Filter results by transaction status. Allowed values: - SUCCESS: the ledger transaction completed successfully. - PENDING: reserved for future use to represent an in-flight ledger transaction.  | 
 **txnReference** | **string** | Filter results by an exact transaction reference. Use this to locate all ledger transactions associated with a specific external reference.  | 
 **offset** | **int32** | Number of records to skip before starting to return results. Use this with page-size to implement offset-based pagination. For example, &#x60;offset&#x3D;25&amp;page-size&#x3D;25&#x60; returns the second page of results.  | 
 **sortKey** | **string** | Field to use for sorting the results. Allowed values include: - CREATED_AT: sort by transaction creation timestamp. - STATEMENT_OPERATION: sort by the operation type (for example, CREDIT, DEBIT). - STATEMENT_SOURCE: sort by the transaction source (for example, PAYMENTS, BANK). - STATEMENT_STATUS: sort by the ledger transaction status. - STATEMENT_TXN_REFERENCE: sort by the transaction reference. - STATEMENT_UPDATED_AT: sort by the last update timestamp.  | 
 **sortDirection** | **string** | Sort direction. Allowed values: - ASC: ascending order. - DESC: descending order.  | 

### Return type

[**[]GetStatementsTransactionsForCustomer200ResponseInner**](GetStatementsTransactionsForCustomer200ResponseInner.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

