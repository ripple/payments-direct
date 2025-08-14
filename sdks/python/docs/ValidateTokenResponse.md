# ValidateTokenResponse

The response object indicating a token's validity and the time remaining on it

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**seconds_to_expiry** | **int** | Remaining time in seconds before the tested token expires. | [optional] 

## Example

```python
from ripple_payments_direct.models.validate_token_response import ValidateTokenResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ValidateTokenResponse from a JSON string
validate_token_response_instance = ValidateTokenResponse.from_json(json)
# print the JSON string representation of the object
print(ValidateTokenResponse.to_json())

# convert the object into a dict
validate_token_response_dict = validate_token_response_instance.to_dict()
# create an instance of ValidateTokenResponse from a dict
validate_token_response_from_dict = ValidateTokenResponse.from_dict(validate_token_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


