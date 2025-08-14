# TotalFeeBreakdown

A breakdown of the total fees included in this quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculated_fee** | **float** | Value of the fee when the configured fee unit is applied against the &#x60;value&#x60;. | [optional] 
**fee_name** | **str** | The name of the fee. | [optional] 
**fee_description** | **str** | Description of the fee. | [optional] 

## Example

```python
from ripple_payments_direct.models.total_fee_breakdown import TotalFeeBreakdown

# TODO update the JSON string below
json = "{}"
# create an instance of TotalFeeBreakdown from a JSON string
total_fee_breakdown_instance = TotalFeeBreakdown.from_json(json)
# print the JSON string representation of the object
print(TotalFeeBreakdown.to_json())

# convert the object into a dict
total_fee_breakdown_dict = total_fee_breakdown_instance.to_dict()
# create an instance of TotalFeeBreakdown from a dict
total_fee_breakdown_from_dict = TotalFeeBreakdown.from_dict(total_fee_breakdown_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


