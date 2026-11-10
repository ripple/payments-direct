# TotalFeeBreakdownV2

A breakdown of the total fees included in this quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculated_fee** | **float** | Value of the fee when the configured fee unit is applied against the &#x60;value&#x60;. | [optional] 
**fee_name** | **str** | The name of the fee. | [optional] 
**fee_description** | **str** | Description of the fee. | [optional] 
**payment_rail** | **str** | The payment rail associated with this fee line item. | [optional] 

## Example

```python
from ripple_payments_direct.models.total_fee_breakdown_v2 import TotalFeeBreakdownV2

# TODO update the JSON string below
json = "{}"
# create an instance of TotalFeeBreakdownV2 from a JSON string
total_fee_breakdown_v2_instance = TotalFeeBreakdownV2.from_json(json)
# print the JSON string representation of the object
print(TotalFeeBreakdownV2.to_json())

# convert the object into a dict
total_fee_breakdown_v2_dict = total_fee_breakdown_v2_instance.to_dict()
# create an instance of TotalFeeBreakdownV2 from a dict
total_fee_breakdown_v2_from_dict = TotalFeeBreakdownV2.from_dict(total_fee_breakdown_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


