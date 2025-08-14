# AuthenticationResponse

The authentication response object that includes the token, type, scopes, and expiry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **str** | The bearer token you use when authenticating with a Ripple API. | [optional] 
**scope** | **str** | List of scopes applied to your &#x60;access_token&#x60;. | [optional] 
**expires_in** | **int** | How long your &#x60;access_token&#x60; is valid. You need to request a new token when it expires. | [optional] 
**token_type** | **str** | The type of token. Ripple APIs use &#x60;Bearer&#x60; auth tokens. | [optional] 

## Example

```python
from ripple_payments_direct.models.authentication_response import AuthenticationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthenticationResponse from a JSON string
authentication_response_instance = AuthenticationResponse.from_json(json)
# print the JSON string representation of the object
print(AuthenticationResponse.to_json())

# convert the object into a dict
authentication_response_dict = authentication_response_instance.to_dict()
# create an instance of AuthenticationResponse from a dict
authentication_response_from_dict = AuthenticationResponse.from_dict(authentication_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


