# PutRippleIdentity

Request to update an existing identity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**internal_id** | **str** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] 
**business** | [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**individual** | [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.put_ripple_identity import PutRippleIdentity

# TODO update the JSON string below
json = "{}"
# create an instance of PutRippleIdentity from a JSON string
put_ripple_identity_instance = PutRippleIdentity.from_json(json)
# print the JSON string representation of the object
print(PutRippleIdentity.to_json())

# convert the object into a dict
put_ripple_identity_dict = put_ripple_identity_instance.to_dict()
# create an instance of PutRippleIdentity from a dict
put_ripple_identity_from_dict = PutRippleIdentity.from_dict(put_ripple_identity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


