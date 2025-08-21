# PaymentErrorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**PaymentError**](PaymentError.md) |  | 
**status** | **str** | Error Response Status | 

## Example

```python
from ripple_payments_direct.models.payment_error_response import PaymentErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentErrorResponse from a JSON string
payment_error_response_instance = PaymentErrorResponse.from_json(json)
# print the JSON string representation of the object
print(PaymentErrorResponse.to_json())

# convert the object into a dict
payment_error_response_dict = payment_error_response_instance.to_dict()
# create an instance of PaymentErrorResponse from a dict
payment_error_response_from_dict = PaymentErrorResponse.from_dict(payment_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


