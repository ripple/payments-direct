# Error


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Unique identifier of an error | 
**title** | **str** | Error message providing a brief summary of the error | 
**type** | **str** | Identifies the problem type | 
**description** | **str** | Provides more technical information | 
**timestamp** | **datetime** | The time when this error occurred, specified in UTC. | 

## Example

```python
from ripple_payments_direct.models.error import Error

# TODO update the JSON string below
json = "{}"
# create an instance of Error from a JSON string
error_instance = Error.from_json(json)
# print the JSON string representation of the object
print(Error.to_json())

# convert the object into a dict
error_dict = error_instance.to_dict()
# create an instance of Error from a dict
error_from_dict = Error.from_dict(error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


