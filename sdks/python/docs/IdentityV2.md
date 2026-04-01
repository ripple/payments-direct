# IdentityV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_id** | **str** | The unique ID of the identity | 
**nick_name** | **str** | The nickname of the identity provided at the time of identity creation. | 
**created_at** | **datetime** | The time at which the identity was created | 
**identity_type** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | 
**use_case_type** | [**UseCaseType**](UseCaseType.md) |  | 

## Example

```python
from ripple_payments_direct.models.identity_v2 import IdentityV2

# TODO update the JSON string below
json = "{}"
# create an instance of IdentityV2 from a JSON string
identity_v2_instance = IdentityV2.from_json(json)
# print the JSON string representation of the object
print(IdentityV2.to_json())

# convert the object into a dict
identity_v2_dict = identity_v2_instance.to_dict()
# create an instance of IdentityV2 from a dict
identity_v2_from_dict = IdentityV2.from_dict(identity_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


