# GetIdentityResponseV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_id** | **str** | Server-generated unique identifier of the identity. | [optional] 
**identity_state** | **str** | The state of the identity. | [optional] 
**nick_name** | **str** | Optional human-readable alias set by the client. | [optional] 
**tags** | **List[str]** | Optional labels used to categorize or filter identities. | [optional] 
**validate_payout_rails** | **List[str]** | List of payout methods where this identity is considered valid. Use this to indicate which payout methods (for example, US_ACH, EU_SEPA) the identity can be used with in payments. | [optional] 
**version** | **str** | Sequential version number. Each successful PUT creates a higher version. | [optional] 
**schema_version** | **str** | Schema version used to validate this identity, for example 1.0.0. | [optional] 
**created_at** | **datetime** | RFC 3339 timestamp when the identity was created. | [optional] 
**updated_at** | **datetime** | RFC 3339 timestamp when the identity was last updated. | [optional] 
**identity_type** | **str** | The type of the identity | 
**payment_role** | **str** | The payment role of the identity | 
**internal_id** | **str** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] 
**business** | [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**individual** | [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.get_identity_response_v3 import GetIdentityResponseV3

# TODO update the JSON string below
json = "{}"
# create an instance of GetIdentityResponseV3 from a JSON string
get_identity_response_v3_instance = GetIdentityResponseV3.from_json(json)
# print the JSON string representation of the object
print(GetIdentityResponseV3.to_json())

# convert the object into a dict
get_identity_response_v3_dict = get_identity_response_v3_instance.to_dict()
# create an instance of GetIdentityResponseV3 from a dict
get_identity_response_v3_from_dict = GetIdentityResponseV3.from_dict(get_identity_response_v3_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


