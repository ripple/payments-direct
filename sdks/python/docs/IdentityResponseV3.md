# IdentityResponseV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_id** | **str** | The unique ID of the identity | 
**identity_type** | **str** | The type of the identity | 
**payment_role** | **str** | The payment role of the identity | 
**created_at** | **datetime** | The time at which the identity was created | 
**updated_at** | **datetime** | The time at which the identity was last updated | 
**identity_state** | **str** | The state of the identity. | 
**nick_name** | **str** | The nickname for the identity provided at the time of identity creation | [optional] 
**internal_id** | **str** | The internal ID of the identity used for internal processing | [optional] 
**tags** | **List[str]** | Tags are used to categorize the identity.  | [optional] 
**version** | **int** | The version number of the identity | 
**schema_version** | **str** | The version of the schema | 

## Example

```python
from ripple_payments_direct.models.identity_response_v3 import IdentityResponseV3

# TODO update the JSON string below
json = "{}"
# create an instance of IdentityResponseV3 from a JSON string
identity_response_v3_instance = IdentityResponseV3.from_json(json)
# print the JSON string representation of the object
print(IdentityResponseV3.to_json())

# convert the object into a dict
identity_response_v3_dict = identity_response_v3_instance.to_dict()
# create an instance of IdentityResponseV3 from a dict
identity_response_v3_from_dict = IdentityResponseV3.from_dict(identity_response_v3_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


