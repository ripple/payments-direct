# PaymentsResponseV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[PaymentV2]**](PaymentV2.md) | Array of Payment objects | [optional] 
**filter** | [**PaymentFilterV2**](PaymentFilterV2.md) |  | [optional] 
**sort** | [**SortV2**](SortV2.md) |  | [optional] 
**page** | [**Page**](Page.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.payments_response_v2 import PaymentsResponseV2

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentsResponseV2 from a JSON string
payments_response_v2_instance = PaymentsResponseV2.from_json(json)
# print the JSON string representation of the object
print(PaymentsResponseV2.to_json())

# convert the object into a dict
payments_response_v2_dict = payments_response_v2_instance.to_dict()
# create an instance of PaymentsResponseV2 from a dict
payments_response_v2_from_dict = PaymentsResponseV2.from_dict(payments_response_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


