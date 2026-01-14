# TaxBreakdown

A breakdown of the individual taxes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax_amount** | **float** | tax amount for this tax line item. | [optional] 
**tax_name** | **str** | The name of the tax. | [optional] 
**tax_description** | **str** | GST service fee tax . | [optional] 
**tax_rate** | **float** | The tax rate applied to calculate the tax amount. | [optional] 

## Example

```python
from ripple_payments_direct.models.tax_breakdown import TaxBreakdown

# TODO update the JSON string below
json = "{}"
# create an instance of TaxBreakdown from a JSON string
tax_breakdown_instance = TaxBreakdown.from_json(json)
# print the JSON string representation of the object
print(TaxBreakdown.to_json())

# convert the object into a dict
tax_breakdown_dict = tax_breakdown_instance.to_dict()
# create an instance of TaxBreakdown from a dict
tax_breakdown_from_dict = TaxBreakdown.from_dict(tax_breakdown_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


