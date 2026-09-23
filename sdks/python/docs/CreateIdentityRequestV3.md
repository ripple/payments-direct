# CreateIdentityRequestV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nick_name** | **str** | The nickname for the identity | [optional] 
**validate_payout_rails** | **List[str]** | The payment rails to validate the identity against | [optional] 
**tags** | **List[str]** | Tags are used to categorize the identity.  | [optional] 
**identity_type** | **str** | The type of the identity | 
**payment_role** | **str** | The payment role of the identity | 
**internal_id** | **str** | Client-provided unique identifier for idempotency and deduplication. Required for ORIGINATOR identities; optional for BENEFICIARY identities. Must be unique across all active identities in your organization. Duplicate values will result in a 409 Conflict error.  This is your own reference key, not the originator&#39;s account number. Use &#x60;originatorAccountNumber&#x60; for that.  | [optional] 
**originator_account_number** | **str** | The originator&#39;s account number, or your customer identifier for the originator. Optional on every currently available corridor. Only sent to payout partners for ORIGINATOR identities.  Must be unique across all active identities in your organization, including BENEFICIARY identities. Duplicate values return a 409 Conflict error.  Payout partners apply their own length and character limits to this value, but they are not enforced on this field.  | [optional] 
**business** | [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**individual** | [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.create_identity_request_v3 import CreateIdentityRequestV3

# TODO update the JSON string below
json = "{}"
# create an instance of CreateIdentityRequestV3 from a JSON string
create_identity_request_v3_instance = CreateIdentityRequestV3.from_json(json)
# print the JSON string representation of the object
print(CreateIdentityRequestV3.to_json())

# convert the object into a dict
create_identity_request_v3_dict = create_identity_request_v3_instance.to_dict()
# create an instance of CreateIdentityRequestV3 from a dict
create_identity_request_v3_from_dict = CreateIdentityRequestV3.from_dict(create_identity_request_v3_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


