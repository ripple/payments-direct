# GetFinancialInstrumentResponse

This object contains the details of a financial instrument and optional identity if requested.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**financial_instrument** | [**RippleFinancialInstrumentEntry**](RippleFinancialInstrumentEntry.md) |  | 
**identity** | [**GetIdentityResponseV3**](GetIdentityResponseV3.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.get_financial_instrument_response import GetFinancialInstrumentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetFinancialInstrumentResponse from a JSON string
get_financial_instrument_response_instance = GetFinancialInstrumentResponse.from_json(json)
# print the JSON string representation of the object
print(GetFinancialInstrumentResponse.to_json())

# convert the object into a dict
get_financial_instrument_response_dict = get_financial_instrument_response_instance.to_dict()
# create an instance of GetFinancialInstrumentResponse from a dict
get_financial_instrument_response_from_dict = GetFinancialInstrumentResponse.from_dict(get_financial_instrument_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


