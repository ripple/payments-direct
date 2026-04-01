# IdentityResponseV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_id** | **str** | The unique ID of the identity | 
**identity_type** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | 
**created_at** | **datetime** | The time at which the identity was created | 
**identity_state** | [**StateType**](StateType.md) |  | 
**nick_name** | **str** | The nickname for the identity provided at the time of identity creation | [optional] 
**pii_data** | **Dict[str, object]** | PII data in JSON format | 
**version** | **int** | The version number of the identity | 
**use_case_type** | [**UseCaseType**](UseCaseType.md) |  | 

## Example

```python
from ripple_payments_direct.models.identity_response_v2 import IdentityResponseV2

# TODO update the JSON string below
json = "{}"
# create an instance of IdentityResponseV2 from a JSON string
identity_response_v2_instance = IdentityResponseV2.from_json(json)
# print the JSON string representation of the object
print(IdentityResponseV2.to_json())

# convert the object into a dict
identity_response_v2_dict = identity_response_v2_instance.to_dict()
# create an instance of IdentityResponseV2 from a dict
identity_response_v2_from_dict = IdentityResponseV2.from_dict(identity_response_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


