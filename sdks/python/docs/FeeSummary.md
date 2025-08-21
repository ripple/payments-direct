# FeeSummary

A summary of fees included in this quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_fee** | **float** | The value of the total fee included in this quote. | [optional] 
**fee_currency** | **str** | The currency in which fees are charged. | [optional] 
**fee_breakdown** | [**List[TotalFeeBreakdown]**](TotalFeeBreakdown.md) | An array of fees that provides a breakdown of how the total fees is calculated for this quote. | [optional] 

## Example

```python
from ripple_payments_direct.models.fee_summary import FeeSummary

# TODO update the JSON string below
json = "{}"
# create an instance of FeeSummary from a JSON string
fee_summary_instance = FeeSummary.from_json(json)
# print the JSON string representation of the object
print(FeeSummary.to_json())

# convert the object into a dict
fee_summary_dict = fee_summary_instance.to_dict()
# create an instance of FeeSummary from a dict
fee_summary_from_dict = FeeSummary.from_dict(fee_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


