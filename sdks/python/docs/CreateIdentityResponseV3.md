# CreateIdentityResponseV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_id** | **str** | The unique ID of the identity | 
**version** | **str** | The version number of the identity | 

## Example

```python
from ripple_payments_direct.models.create_identity_response_v3 import CreateIdentityResponseV3

# TODO update the JSON string below
json = "{}"
# create an instance of CreateIdentityResponseV3 from a JSON string
create_identity_response_v3_instance = CreateIdentityResponseV3.from_json(json)
# print the JSON string representation of the object
print(CreateIdentityResponseV3.to_json())

# convert the object into a dict
create_identity_response_v3_dict = create_identity_response_v3_instance.to_dict()
# create an instance of CreateIdentityResponseV3 from a dict
create_identity_response_v3_from_dict = CreateIdentityResponseV3.from_dict(create_identity_response_v3_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


