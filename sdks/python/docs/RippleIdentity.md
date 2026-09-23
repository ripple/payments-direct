# RippleIdentity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_type** | **str** | The type of the identity | 
**payment_role** | **str** | The payment role of the identity | 
**internal_id** | **str** | Client-provided unique identifier for idempotency and deduplication. Required for ORIGINATOR identities; optional for BENEFICIARY identities. Must be unique across all active identities in your organization. Duplicate values will result in a 409 Conflict error.  This is your own reference key, not the originator&#39;s account number. Use &#x60;originatorAccountNumber&#x60; for that.  | [optional] 
**originator_account_number** | **str** | The originator&#39;s account number, or your customer identifier for the originator. Optional on every currently available corridor. Only sent to payout partners for ORIGINATOR identities.  Must be unique across all active identities in your organization, including BENEFICIARY identities. Duplicate values return a 409 Conflict error.  Payout partners apply their own length and character limits to this value, but they are not enforced on this field.  | [optional] 
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


