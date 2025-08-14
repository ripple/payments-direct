# AdjustedExchangeRate

Foreign Exchange (FX) rate used to calculate the quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adjusted_rate** | **float** | Value of the Foreign Exchange (FX) rate. | [optional] 

## Example

```python
from ripple_payments_direct.models.adjusted_exchange_rate import AdjustedExchangeRate

# TODO update the JSON string below
json = "{}"
# create an instance of AdjustedExchangeRate from a JSON string
adjusted_exchange_rate_instance = AdjustedExchangeRate.from_json(json)
# print the JSON string representation of the object
print(AdjustedExchangeRate.to_json())

# convert the object into a dict
adjusted_exchange_rate_dict = adjusted_exchange_rate_instance.to_dict()
# create an instance of AdjustedExchangeRate from a dict
adjusted_exchange_rate_from_dict = AdjustedExchangeRate.from_dict(adjusted_exchange_rate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


