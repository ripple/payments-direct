# RippleIdentity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_type** | **str** | The type of the identity | 
**payment_role** | **str** | The payment role of the identity | 
**internal_id** | **str** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] 
**business** | [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**individual** | [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.ripple_identity import RippleIdentity

# TODO update the JSON string below
json = "{}"
# create an instance of RippleIdentity from a JSON string
ripple_identity_instance = RippleIdentity.from_json(json)
# print the JSON string representation of the object
print(RippleIdentity.to_json())

# convert the object into a dict
ripple_identity_dict = ripple_identity_instance.to_dict()
# create an instance of RippleIdentity from a dict
ripple_identity_from_dict = RippleIdentity.from_dict(ripple_identity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


