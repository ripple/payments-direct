# GetBalances200ResponseBalancesInner

Customer available prefund balance for specific currency

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**funding_type** | **str** | The funding method associated with your account. | 
**currency** | **str** | Currency code. | 
**available_balance** | **float** | Available funded balance that you can use to initiate payments. | 
**reserved_balance** | **float** | Amount reserved to complete in-progress transactions. You can&#39;t use this amount to initiate new payments. | 

## Example

```python
from ripple_payments_direct.models.get_balances200_response_balances_inner import GetBalances200ResponseBalancesInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetBalances200ResponseBalancesInner from a JSON string
get_balances200_response_balances_inner_instance = GetBalances200ResponseBalancesInner.from_json(json)
# print the JSON string representation of the object
print(GetBalances200ResponseBalancesInner.to_json())

# convert the object into a dict
get_balances200_response_balances_inner_dict = get_balances200_response_balances_inner_instance.to_dict()
# create an instance of GetBalances200ResponseBalancesInner from a dict
get_balances200_response_balances_inner_from_dict = GetBalances200ResponseBalancesInner.from_dict(get_balances200_response_balances_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


