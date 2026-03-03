# SearchPaymentsRequestV2

Request body containing search criteria for payments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**PaymentFilterV2**](PaymentFilterV2.md) |  | [optional] 
**sort** | [**SortV2**](SortV2.md) |  | [optional] 
**page** | [**Page**](Page.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.search_payments_request_v2 import SearchPaymentsRequestV2

# TODO update the JSON string below
json = "{}"
# create an instance of SearchPaymentsRequestV2 from a JSON string
search_payments_request_v2_instance = SearchPaymentsRequestV2.from_json(json)
# print the JSON string representation of the object
print(SearchPaymentsRequestV2.to_json())

# convert the object into a dict
search_payments_request_v2_dict = search_payments_request_v2_instance.to_dict()
# create an instance of SearchPaymentsRequestV2 from a dict
search_payments_request_v2_from_dict = SearchPaymentsRequestV2.from_dict(search_payments_request_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


