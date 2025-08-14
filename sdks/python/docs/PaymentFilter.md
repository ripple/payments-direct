# PaymentFilter

Filter criteria to return desired payment search results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payment_ids** | **List[str]** | Specify a list of uuids to search for payment with payment ids equals one from the list | [optional] 
**payment_states** | [**List[PaymentState]**](PaymentState.md) | Array of payment states like &#x60;EXECUTING&#x60; or &#x60;COMPLETED&#x60;. | [optional] 
**filter_range_type** | [**PaymentFilterRangeType**](PaymentFilterRangeType.md) |  | [optional] 
**before_timestamp** | **datetime** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or before the specified time. | [optional] 
**after_timestamp** | **datetime** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or after the specified time. | [optional] 
**beneficiary_identity_ids** | **List[str]** | To get all payments made to one or more beneficiaries, specify the identity ID(s) of those beneficiaries in this field. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] 
**internal_id** | **str** | Specify an &#x60;internalId&#x60; to get payments associated with them. A prefix match will be executed. | [optional] 
**beneficiary_identity_nickname** | **str** | To get all payments made to a beneficiary, specify the nickname of that beneficiary in this field. You can find the nickname using the &#x60;GET /identities&#x60; operation. | [optional] 
**destination_currencies** | **List[str]** | Specify one or more currency codes to get payments where the beneficiary received funds in these currencies. | [optional] 
**payment_labels** | **List[str]** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] 

## Example

```python
from ripple_payments_direct.models.payment_filter import PaymentFilter

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentFilter from a JSON string
payment_filter_instance = PaymentFilter.from_json(json)
# print the JSON string representation of the object
print(PaymentFilter.to_json())

# convert the object into a dict
payment_filter_dict = payment_filter_instance.to_dict()
# create an instance of PaymentFilter from a dict
payment_filter_from_dict = PaymentFilter.from_dict(payment_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


