# UpdatePaymentLabelsResponse

Response body for modifying payment labels

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | **List[str]** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | 

## Example

```python
from ripple_payments_direct.models.update_payment_labels_response import UpdatePaymentLabelsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePaymentLabelsResponse from a JSON string
update_payment_labels_response_instance = UpdatePaymentLabelsResponse.from_json(json)
# print the JSON string representation of the object
print(UpdatePaymentLabelsResponse.to_json())

# convert the object into a dict
update_payment_labels_response_dict = update_payment_labels_response_instance.to_dict()
# create an instance of UpdatePaymentLabelsResponse from a dict
update_payment_labels_response_from_dict = UpdatePaymentLabelsResponse.from_dict(update_payment_labels_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


