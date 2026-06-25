# PaymentFilterV2

Filter criteria to return desired payment search results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payment_ids** | **List[str]** | Specify a list of uuids to search for payment with payment ids equals one from the list | [optional] 
**payment_states** | **List[str]** | Array of payment states like &#x60;EXECUTING&#x60; or &#x60;COMPLETED&#x60;. | [optional] 
**filter_range_type** | **str** | The type of timestamp to use when filtering payments by a date and time range.  Supported values include:  - &#x60;PAYMENT_CREATION&#x60;  - &#x60;PAYMENT_EXPIRY&#x60;  - &#x60;PAYMENT_STATUS_LAST_UPDATED&#x60;  If another value is provided, the filter is rejected with a validation error.  | [optional] 
**before_timestamp** | **datetime** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or before the specified time. | [optional] 
**after_timestamp** | **datetime** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or after the specified time. | [optional] 
**beneficiary_identity_ids** | **List[str]** | To get all payments made to one or more beneficiaries, specify the identity ID(s) of those beneficiaries in this field. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] 
**internal_id** | **str** | Specify an &#x60;internalId&#x60; to get payments associated with them. A prefix match will be executed. | [optional] 
**beneficiary_identity_nickname** | **str** | To get all payments made to a beneficiary, specify the nickname of that beneficiary in this field. You can find the nickname using the &#x60;GET /identities&#x60; operation. | [optional] 
**destination_currencies** | **List[str]** | Specify one or more currency codes to get payments where the beneficiary received funds in these currencies. | [optional] 
**payment_labels** | **List[str]** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment&#39;s lifetime. | [optional] 

## Example

```python
from ripple_payments_direct.models.payment_filter_v2 import PaymentFilterV2

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentFilterV2 from a JSON string
payment_filter_v2_instance = PaymentFilterV2.from_json(json)
# print the JSON string representation of the object
print(PaymentFilterV2.to_json())

# convert the object into a dict
payment_filter_v2_dict = payment_filter_v2_instance.to_dict()
# create an instance of PaymentFilterV2 from a dict
payment_filter_v2_from_dict = PaymentFilterV2.from_dict(payment_filter_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


