# PaymentError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | A unique identifier for  the error | 
**type** | **str** | A high-level categorization of the error, indicating the type of issue that occurred | 
**title** | **str** | A brief, user-friendly description of the error | 
**description** | **str** | A more detailed explanation of the error, potentially including information about what caused the error and the next steps | 
**timestamp** | **datetime** |  | 

## Example

```python
from ripple_payments_direct.models.payment_error import PaymentError

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentError from a JSON string
payment_error_instance = PaymentError.from_json(json)
# print the JSON string representation of the object
print(PaymentError.to_json())

# convert the object into a dict
payment_error_dict = payment_error_instance.to_dict()
# create an instance of PaymentError from a dict
payment_error_from_dict = PaymentError.from_dict(payment_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


