# GetBalances401Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **int** | The HTTP status code representing the error response | 
**errors** | [**List[GetBalances400ResponseErrorsInner]**](GetBalances400ResponseErrorsInner.md) | An array containing details about the errors encountered | 

## Example

```python
from ripple_payments_direct.models.get_balances401_response import GetBalances401Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetBalances401Response from a JSON string
get_balances401_response_instance = GetBalances401Response.from_json(json)
# print the JSON string representation of the object
print(GetBalances401Response.to_json())

# convert the object into a dict
get_balances401_response_dict = get_balances401_response_instance.to_dict()
# create an instance of GetBalances401Response from a dict
get_balances401_response_from_dict = GetBalances401Response.from_dict(get_balances401_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


