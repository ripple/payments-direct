# LedgerPublicApi

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalances**](LedgerPublicApi.md#getBalances) | **GET** /v2/balances | Get available balances |
| [**getStatementsTransactionsForCustomer**](LedgerPublicApi.md#getStatementsTransactionsForCustomer) | **GET** /v2/ledger-transactions | Get ledger transactions |



## getBalances

> GetBalances200ResponseDTO getBalances(currency)

Get available balances

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.LedgerPublicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        LedgerPublicApi apiInstance = new LedgerPublicApi(defaultClient);
        String currency = "currency_example"; // String | The currency for which you want to get the balance.
        try {
            GetBalances200ResponseDTO result = apiInstance.getBalances(currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerPublicApi#getBalances");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **currency** | **String**| The currency for which you want to get the balance. | [optional] |

### Return type

[**GetBalances200ResponseDTO**](GetBalances200ResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing balance details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized access |  -  |
| **500** | Internal server error |  -  |


## getStatementsTransactionsForCustomer

> List&lt;GetStatementsTransactionsForCustomer200ResponseInnerDTO&gt; getStatementsTransactionsForCustomer(currency, startDttm, endDttm, pageSize, status, txnReference, offset, sortKey, sortDirection)

Get ledger transactions

Retrieve a paginated list of ledger transactions for your tenant within a specified date and time range. This endpoint returns detailed transaction data, including amounts, references, operations, and running balances, so you can reconcile balance changes over time for a given currency. 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.LedgerPublicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        LedgerPublicApi apiInstance = new LedgerPublicApi(defaultClient);
        String currency = "USD"; // String | Three-letter ISO 4217 currency code for the transactions to return (for example, USD). 
        OffsetDateTime startDttm = OffsetDateTime.parse("2022-02-27T08:30:00Z"); // OffsetDateTime | Start of the date and time range (inclusive), in UTC, for which you want to retrieve ledger transactions. 
        OffsetDateTime endDttm = OffsetDateTime.parse("2022-02-27T08:30:00Z"); // OffsetDateTime | End of the date and time range (exclusive), in UTC, for which you want to retrieve ledger transactions. 
        Integer pageSize = 25; // Integer | Number of records to return in the response page. Use page-size together with offset for offset-based pagination 
        String status = "status_example"; // String | Filter results by transaction status. Allowed values: - SUCCESS: the ledger transaction completed successfully. - PENDING: reserved for future use to represent an in-flight ledger transaction. 
        String txnReference = "txnReference_example"; // String | Filter results by an exact transaction reference. Use this to locate all ledger transactions associated with a specific external reference. 
        Integer offset = 56; // Integer | Number of records to skip before starting to return results. Use this with page-size to implement offset-based pagination. For example, `offset=25&page-size=25` returns the second page of results. 
        String sortKey = "sortKey_example"; // String | Field to use for sorting the results. Allowed values include: - CREATED_AT: sort by transaction creation timestamp. - STATEMENT_OPERATION: sort by the operation type (for example, CREDIT, DEBIT). - STATEMENT_SOURCE: sort by the transaction source (for example, PAYMENTS, BANK). - STATEMENT_STATUS: sort by the ledger transaction status. - STATEMENT_TXN_REFERENCE: sort by the transaction reference. - STATEMENT_UPDATED_AT: sort by the last update timestamp. 
        String sortDirection = "sortDirection_example"; // String | Sort direction. Allowed values: - ASC: ascending order. - DESC: descending order. 
        try {
            List<GetStatementsTransactionsForCustomer200ResponseInnerDTO> result = apiInstance.getStatementsTransactionsForCustomer(currency, startDttm, endDttm, pageSize, status, txnReference, offset, sortKey, sortDirection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LedgerPublicApi#getStatementsTransactionsForCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **currency** | **String**| Three-letter ISO 4217 currency code for the transactions to return (for example, USD).  | |
| **startDttm** | **OffsetDateTime**| Start of the date and time range (inclusive), in UTC, for which you want to retrieve ledger transactions.  | |
| **endDttm** | **OffsetDateTime**| End of the date and time range (exclusive), in UTC, for which you want to retrieve ledger transactions.  | |
| **pageSize** | **Integer**| Number of records to return in the response page. Use page-size together with offset for offset-based pagination  | [default to 25] |
| **status** | **String**| Filter results by transaction status. Allowed values: - SUCCESS: the ledger transaction completed successfully. - PENDING: reserved for future use to represent an in-flight ledger transaction.  | [optional] |
| **txnReference** | **String**| Filter results by an exact transaction reference. Use this to locate all ledger transactions associated with a specific external reference.  | [optional] |
| **offset** | **Integer**| Number of records to skip before starting to return results. Use this with page-size to implement offset-based pagination. For example, &#x60;offset&#x3D;25&amp;page-size&#x3D;25&#x60; returns the second page of results.  | [optional] |
| **sortKey** | **String**| Field to use for sorting the results. Allowed values include: - CREATED_AT: sort by transaction creation timestamp. - STATEMENT_OPERATION: sort by the operation type (for example, CREDIT, DEBIT). - STATEMENT_SOURCE: sort by the transaction source (for example, PAYMENTS, BANK). - STATEMENT_STATUS: sort by the ledger transaction status. - STATEMENT_TXN_REFERENCE: sort by the transaction reference. - STATEMENT_UPDATED_AT: sort by the last update timestamp.  | [optional] |
| **sortDirection** | **String**| Sort direction. Allowed values: - ASC: ascending order. - DESC: descending order.  | [optional] |

### Return type

[**List&lt;GetStatementsTransactionsForCustomer200ResponseInnerDTO&gt;**](GetStatementsTransactionsForCustomer200ResponseInnerDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/csv


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A page of ledger statement transactions for the tenant that match the specified query parameters.  |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

