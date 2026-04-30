# SortV2

Defines the sorting parameters for listing payments, including the field and sort direction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort_field** | **str** | The field to use when sorting payments in the requested sort order. Currently supported values include: - &#x60;internalId&#x60; - &#x60;paymentState&#x60; - &#x60;sourceCurrency&#x60; - &#x60;sourceAmount&#x60; - &#x60;destinationCurrency&#x60; - &#x60;destinationCountry&#x60; - &#x60;destinationAmount&#x60; - &#x60;initiatedAt&#x60; - &#x60;expiresAt&#x60; - &#x60;lastStateUpdatedAt&#x60; - &#x60;paymentLabel&#x60; If an unsupported value is provided, the request fails with a validation error.  | [optional] [default to 'initiatedAt']
**sort_direction** | **str** | Indicates whether results are sorted in ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. | [optional] [default to 'DESC']

## Example

```python
from ripple_payments_direct.models.sort_v2 import SortV2

# TODO update the JSON string below
json = "{}"
# create an instance of SortV2 from a JSON string
sort_v2_instance = SortV2.from_json(json)
# print the JSON string representation of the object
print(SortV2.to_json())

# convert the object into a dict
sort_v2_dict = sort_v2_instance.to_dict()
# create an instance of SortV2 from a dict
sort_v2_from_dict = SortV2.from_dict(sort_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


