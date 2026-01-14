# TaxSummary

A summary of taxes included in this quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_taxes** | **float** | The value of the total taxes included in this quote. | [optional] 
**tax_currency** | **str** | The currency in which taxes are charged. | [optional] 
**tax_breakdown** | [**List[TaxBreakdown]**](TaxBreakdown.md) | An array of taxes with details such as tax description, rate, name and tax amount. | [optional] 

## Example

```python
from ripple_payments_direct.models.tax_summary import TaxSummary

# TODO update the JSON string below
json = "{}"
# create an instance of TaxSummary from a JSON string
tax_summary_instance = TaxSummary.from_json(json)
# print the JSON string representation of the object
print(TaxSummary.to_json())

# convert the object into a dict
tax_summary_dict = tax_summary_instance.to_dict()
# create an instance of TaxSummary from a dict
tax_summary_from_dict = TaxSummary.from_dict(tax_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


