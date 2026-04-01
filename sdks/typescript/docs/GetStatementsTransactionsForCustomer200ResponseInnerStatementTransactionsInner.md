# GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant** | **string** | Identifier of the tenant that owns this ledger transaction. | [optional] [default to undefined]
**amount** | **number** | Amount of the transaction applied to the tenant’s ledger account.  | [optional] [default to undefined]
**currency** | **string** | Three-letter ISO 4217 currency code of the transaction. | [optional] [default to undefined]
**txnReference** | **string** | External reference that links this ledger transaction to a payment or other upstream operation. Present for RESERVE and DEBIT operations, where it matches the Payments Direct payment ID. Null for all other operation types.  | [optional] [default to undefined]
**operation** | **string** | Operation performed on the tenant’s prefunded ledger account.  | [optional] [default to undefined]
**txnSource** | **string** | Source of the ledger transaction (for example, which system or flow created it).  | [optional] [default to undefined]
**status** | **string** | State of the ledger transaction. | [optional] [default to undefined]
**createdDttm** | **string** | Timestamp (UTC) when the ledger transaction was created. | [optional] [default to undefined]
**updatedDttm** | **string** | Timestamp (UTC) when the ledger transaction was last updated. | [optional] [default to undefined]
**availableBalanceBefore** | **number** | Available ledger account balance (in the transaction currency) immediately before this transaction was applied.  | [optional] [default to undefined]
**availableBalanceAfter** | **number** | Available ledger account balance (in the transaction currency) immediately after this transaction was applied.  | [optional] [default to undefined]

## Example

```typescript
import { GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner } from '@ripple/payments-direct-client';

const instance: GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner = {
    tenant,
    amount,
    currency,
    txnReference,
    operation,
    txnSource,
    status,
    createdDttm,
    updatedDttm,
    availableBalanceBefore,
    availableBalanceAfter,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
