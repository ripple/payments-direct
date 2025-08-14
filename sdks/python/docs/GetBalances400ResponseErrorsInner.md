# GetBalances400ResponseErrorsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | A unique error code that identifies the specific error | 
**type** | **str** | A high-level categorization of the error, indicating the type of issue that occurred | 
**title** | **str** | A brief, user-friendly description of the error | 
**description** | **str** | A more detailed explanation of the error, including potential causes and next steps | 
**timestamp** | **datetime** | The timestamp of the error occurrence | 

## Example

```python
from ripple_payments_direct.models.get_balances400_response_errors_inner import GetBalances400ResponseErrorsInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetBalances400ResponseErrorsInner from a JSON string
get_balances400_response_errors_inner_instance = GetBalances400ResponseErrorsInner.from_json(json)
# print the JSON string representation of the object
print(GetBalances400ResponseErrorsInner.to_json())

# convert the object into a dict
get_balances400_response_errors_inner_dict = get_balances400_response_errors_inner_instance.to_dict()
# create an instance of GetBalances400ResponseErrorsInner from a dict
get_balances400_response_errors_inner_from_dict = GetBalances400ResponseErrorsInner.from_dict(get_balances400_response_errors_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


