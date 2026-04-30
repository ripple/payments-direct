# CreateFinancialInstrumentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**financial_instrument_id** | **str** | The unique ID of the financial instrument | 

## Example

```python
from ripple_payments_direct.models.create_financial_instrument_response import CreateFinancialInstrumentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFinancialInstrumentResponse from a JSON string
create_financial_instrument_response_instance = CreateFinancialInstrumentResponse.from_json(json)
# print the JSON string representation of the object
print(CreateFinancialInstrumentResponse.to_json())

# convert the object into a dict
create_financial_instrument_response_dict = create_financial_instrument_response_instance.to_dict()
# create an instance of CreateFinancialInstrumentResponse from a dict
create_financial_instrument_response_from_dict = CreateFinancialInstrumentResponse.from_dict(create_financial_instrument_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


