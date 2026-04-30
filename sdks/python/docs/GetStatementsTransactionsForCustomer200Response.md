# GetStatementsTransactionsForCustomer200Response

A page of ledger statement transactions and pagination metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offset** | **int** | Offset used in the request to skip a specific number of records. | [optional] 
**page_size** | **int** | Number of records requested per page | [optional] 
**page_elements** | **int** | Number of records returned in requested page | [optional] 
**total** | **int** | Total number of records available for the given filters. | [optional] 
**statement_transactions** | [**List[GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner]**](GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner.md) | Statement transaction details for the customer. | [optional] 

## Example

```python
from ripple_payments_direct.models.get_statements_transactions_for_customer200_response import GetStatementsTransactionsForCustomer200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetStatementsTransactionsForCustomer200Response from a JSON string
get_statements_transactions_for_customer200_response_instance = GetStatementsTransactionsForCustomer200Response.from_json(json)
# print the JSON string representation of the object
print(GetStatementsTransactionsForCustomer200Response.to_json())

# convert the object into a dict
get_statements_transactions_for_customer200_response_dict = get_statements_transactions_for_customer200_response_instance.to_dict()
# create an instance of GetStatementsTransactionsForCustomer200Response from a dict
get_statements_transactions_for_customer200_response_from_dict = GetStatementsTransactionsForCustomer200Response.from_dict(get_statements_transactions_for_customer200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


