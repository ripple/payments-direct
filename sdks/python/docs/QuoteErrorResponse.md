# QuoteErrorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[QuoteError]**](QuoteError.md) | List of quote errors | 
**status** | **int** | Response status code | 

## Example

```python
from ripple_payments_direct.models.quote_error_response import QuoteErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteErrorResponse from a JSON string
quote_error_response_instance = QuoteErrorResponse.from_json(json)
# print the JSON string representation of the object
print(QuoteErrorResponse.to_json())

# convert the object into a dict
quote_error_response_dict = quote_error_response_instance.to_dict()
# create an instance of QuoteErrorResponse from a dict
quote_error_response_from_dict = QuoteErrorResponse.from_dict(quote_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


