# GetBalances400Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **int** | The HTTP status code representing the error response | 
**errors** | [**List[GetBalances400ResponseErrorsInner]**](GetBalances400ResponseErrorsInner.md) | An array containing details about the errors encountered | 

## Example

```python
from ripple_payments_direct.models.get_balances400_response import GetBalances400Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetBalances400Response from a JSON string
get_balances400_response_instance = GetBalances400Response.from_json(json)
# print the JSON string representation of the object
print(GetBalances400Response.to_json())

# convert the object into a dict
get_balances400_response_dict = get_balances400_response_instance.to_dict()
# create an instance of GetBalances400Response from a dict
get_balances400_response_from_dict = GetBalances400Response.from_dict(get_balances400_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


