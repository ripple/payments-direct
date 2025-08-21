# PaymentsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[Payment]**](Payment.md) | Array of Payment objects | [optional] 
**filter** | [**PaymentFilter**](PaymentFilter.md) |  | [optional] 
**sort** | [**Sort**](Sort.md) |  | [optional] 
**page** | [**Page**](Page.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.payments_response import PaymentsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentsResponse from a JSON string
payments_response_instance = PaymentsResponse.from_json(json)
# print the JSON string representation of the object
print(PaymentsResponse.to_json())

# convert the object into a dict
payments_response_dict = payments_response_instance.to_dict()
# create an instance of PaymentsResponse from a dict
payments_response_from_dict = PaymentsResponse.from_dict(payments_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


