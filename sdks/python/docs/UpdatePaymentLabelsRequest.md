# UpdatePaymentLabelsRequest

Request body containing the list of labels you want to add to or remove from the payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels_to_add** | **List[str]** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] 
**labels_to_remove** | **List[str]** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] 

## Example

```python
from ripple_payments_direct.models.update_payment_labels_request import UpdatePaymentLabelsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePaymentLabelsRequest from a JSON string
update_payment_labels_request_instance = UpdatePaymentLabelsRequest.from_json(json)
# print the JSON string representation of the object
print(UpdatePaymentLabelsRequest.to_json())

# convert the object into a dict
update_payment_labels_request_dict = update_payment_labels_request_instance.to_dict()
# create an instance of UpdatePaymentLabelsRequest from a dict
update_payment_labels_request_from_dict = UpdatePaymentLabelsRequest.from_dict(update_payment_labels_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


