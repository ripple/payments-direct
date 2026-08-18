# SearchPaymentsRequest

Request body containing search criteria for payments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**PaymentFilter**](PaymentFilter.md) |  | [optional] 
**sort** | [**Sort**](Sort.md) |  | [optional] 
**page** | [**Page**](Page.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.search_payments_request import SearchPaymentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SearchPaymentsRequest from a JSON string
search_payments_request_instance = SearchPaymentsRequest.from_json(json)
# print the JSON string representation of the object
print(SearchPaymentsRequest.to_json())

# convert the object into a dict
search_payments_request_dict = search_payments_request_instance.to_dict()
# create an instance of SearchPaymentsRequest from a dict
search_payments_request_from_dict = SearchPaymentsRequest.from_dict(search_payments_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


