

# GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInnerDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenant** | **String** | Identifier of the customer that owns this ledger transaction. |  [optional] |
|**amount** | **BigDecimal** | Amount of the transaction applied to the customer&#39;s ledger account.  |  [optional] |
|**currency** | **String** | Three-letter ISO 4217 currency code of the transaction. |  [optional] |
|**txnReference** | **String** | External reference that links this ledger transaction to a payment or other upstream operation. Present for RESERVE and DEBIT operations, where it matches the Payments Direct payment ID. Null for all other operation types.  |  [optional] |
|**operation** | **String** | Operation performed on the customer&#39;s prefunded ledger account.  |  [optional] |
|**txnSource** | **String** | Source of the ledger transaction (for example, which system or flow created it).  |  [optional] |
|**status** | **String** | State of the ledger transaction. |  [optional] |
|**createdDttm** | **OffsetDateTime** | Timestamp (UTC) when the ledger transaction was created. |  [optional] |
|**updatedDttm** | **OffsetDateTime** | Timestamp (UTC) when the ledger transaction was last updated. |  [optional] |
|**availableBalanceBefore** | **BigDecimal** | Available ledger account balance (in the transaction currency) immediately before this transaction was applied.  |  [optional] |
|**availableBalanceAfter** | **BigDecimal** | Available ledger account balance (in the transaction currency) immediately after this transaction was applied.  |  [optional] |



