# Sort

Specify sorting direction and the filtering criterion to sort by.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_field** | [**PaymentSortField**](PaymentSortField.md) |  | [optional] [default to PaymentSortField.NUMBER_INITIATED_AT]
**sort_direction** | **str** | Sort results in ascending or descending order. | [optional] [default to 'DESC']

## Example

```python
from ripple_payments_direct.models.sort import Sort

# TODO update the JSON string below
json = "{}"
# create an instance of Sort from a JSON string
sort_instance = Sort.from_json(json)
# print the JSON string representation of the object
print(Sort.to_json())

# convert the object into a dict
sort_dict = sort_instance.to_dict()
# create an instance of Sort from a dict
sort_from_dict = Sort.from_dict(sort_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


