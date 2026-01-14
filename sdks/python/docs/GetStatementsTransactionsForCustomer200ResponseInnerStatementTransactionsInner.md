# GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant** | **str** | Identifier of the tenant that owns this ledger transaction. | [optional] 
**amount** | **float** | Amount of the transaction applied to the tenant’s ledger account.  | [optional] 
**currency** | **str** | Three-letter ISO 4217 currency code of the transaction. | [optional] 
**operation** | **str** | Operation performed on the tenant’s prefunded ledger account.  | [optional] 
**txn_source** | **str** | Source of the ledger transaction (for example, which system or flow created it).  | [optional] 
**status** | **str** | State of the ledger transaction. | [optional] 
**created_dttm** | **datetime** | Timestamp (UTC) when the ledger transaction was created. | [optional] 
**updated_dttm** | **datetime** | Timestamp (UTC) when the ledger transaction was last updated. | [optional] 
**available_balance_before** | **float** | Available ledger account balance (in the transaction currency) immediately before this transaction was applied.  | [optional] 
**available_balance_after** | **float** | Available ledger account balance (in the transaction currency) immediately after this transaction was applied.  | [optional] 

## Example

```python
from ripple_payments_direct.models.get_statements_transactions_for_customer200_response_inner_statement_transactions_inner import GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner from a JSON string
get_statements_transactions_for_customer200_response_inner_statement_transactions_inner_instance = GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner.from_json(json)
# print the JSON string representation of the object
print(GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner.to_json())

# convert the object into a dict
get_statements_transactions_for_customer200_response_inner_statement_transactions_inner_dict = get_statements_transactions_for_customer200_response_inner_statement_transactions_inner_instance.to_dict()
# create an instance of GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner from a dict
get_statements_transactions_for_customer200_response_inner_statement_transactions_inner_from_dict = GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner.from_dict(get_statements_transactions_for_customer200_response_inner_statement_transactions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


