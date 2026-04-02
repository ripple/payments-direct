# PutIdentityRequestV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nick_name** | **str** | The new nickname for the identity | [optional] 
**validate_payout_rails** | **List[str]** | The payout rails to validate the identity against | [optional] 
**tags** | **List[str]** | Tags are used to categorize the identity.  | [optional] 
**internal_id** | **str** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] 
**business** | [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**individual** | [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.put_identity_request_v3 import PutIdentityRequestV3

# TODO update the JSON string below
json = "{}"
# create an instance of PutIdentityRequestV3 from a JSON string
put_identity_request_v3_instance = PutIdentityRequestV3.from_json(json)
# print the JSON string representation of the object
print(PutIdentityRequestV3.to_json())

# convert the object into a dict
put_identity_request_v3_dict = put_identity_request_v3_instance.to_dict()
# create an instance of PutIdentityRequestV3 from a dict
put_identity_request_v3_from_dict = PutIdentityRequestV3.from_dict(put_identity_request_v3_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


