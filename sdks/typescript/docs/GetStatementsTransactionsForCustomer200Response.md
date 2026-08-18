# GetStatementsTransactionsForCustomer200Response

A page of ledger statement transactions and pagination metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offset** | **number** | Offset used in the request to skip a specific number of records.  | [optional] [default to undefined]
**pageSize** | **number** | Number of records requested per page | [optional] [default to undefined]
**pageElements** | **number** | Number of records returned in requested page | [optional] [default to undefined]
**total** | **number** | Total number of records available for the given filters. | [optional] [default to undefined]
**statementTransactions** | [**Array&lt;GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner&gt;**](GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner.md) | Statement transaction details for the customer. | [optional] [default to undefined]

## Example

```typescript
import { GetStatementsTransactionsForCustomer200Response } from '@ripple/payments-direct-client';

const instance: GetStatementsTransactionsForCustomer200Response = {
    offset,
    pageSize,
    pageElements,
    total,
    statementTransactions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
