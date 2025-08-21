# GetBalances200Response

Customer available prefund balance details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **datetime** | Timestamp of the balance response. | 
**balances** | [**List[GetBalances200ResponseBalancesInner]**](GetBalances200ResponseBalancesInner.md) | List of available prefund balances. | 

## Example

```python
from ripple_payments_direct.models.get_balances200_response import GetBalances200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetBalances200Response from a JSON string
get_balances200_response_instance = GetBalances200Response.from_json(json)
# print the JSON string representation of the object
print(GetBalances200Response.to_json())

# convert the object into a dict
get_balances200_response_dict = get_balances200_response_instance.to_dict()
# create an instance of GetBalances200Response from a dict
get_balances200_response_from_dict = GetBalances200Response.from_dict(get_balances200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


