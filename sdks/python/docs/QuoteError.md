# QuoteError


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
from ripple_payments_direct.models.quote_error import QuoteError

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteError from a JSON string
quote_error_instance = QuoteError.from_json(json)
# print the JSON string representation of the object
print(QuoteError.to_json())

# convert the object into a dict
quote_error_dict = quote_error_instance.to_dict()
# create an instance of QuoteError from a dict
quote_error_from_dict = QuoteError.from_dict(quote_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


