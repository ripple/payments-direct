

# GetStatementsTransactionsForCustomer200ResponseDTO

A page of ledger statement transactions and pagination metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offset** | **String** | Offset used in the request to skip a specific number of records. |  [optional] |
|**pageSize** | **String** | Number of records requested per page |  [optional] |
|**pageElements** | **String** | Number of records returned in requested page |  [optional] |
|**total** | **String** | Total number of records available for the given filters. |  [optional] |
|**statementTransactions** | [**List&lt;GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInnerDTO&gt;**](GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInnerDTO.md) | Statement transaction details for the customer. |  [optional] |



