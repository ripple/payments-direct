# GetStatementsTransactionsForCustomer200ResponseInner

A page of ledger statement transactions and pagination metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offset** | **int** | Offset used in the request to skip a specific number of records.  | [optional] 
**page_size** | **int** | Number of records requested per page | [optional] 
**page_elements** | **int** | Number of records returned in requested page | [optional] 
**total** | **int** | Total number of records available for the given filters. | [optional] 
**statement_transactions** | [**List[GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner]**](GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner.md) | Statement transaction details for the tenant. | [optional] 

## Example

```python
from ripple_payments_direct.models.get_statements_transactions_for_customer200_response_inner import GetStatementsTransactionsForCustomer200ResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetStatementsTransactionsForCustomer200ResponseInner from a JSON string
get_statements_transactions_for_customer200_response_inner_instance = GetStatementsTransactionsForCustomer200ResponseInner.from_json(json)
# print the JSON string representation of the object
print(GetStatementsTransactionsForCustomer200ResponseInner.to_json())

# convert the object into a dict
get_statements_transactions_for_customer200_response_inner_dict = get_statements_transactions_for_customer200_response_inner_instance.to_dict()
# create an instance of GetStatementsTransactionsForCustomer200ResponseInner from a dict
get_statements_transactions_for_customer200_response_inner_from_dict = GetStatementsTransactionsForCustomer200ResponseInner.from_dict(get_statements_transactions_for_customer200_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


