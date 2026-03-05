# ListFinancialInstrumentsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[FinancialInstrumentMetadata]**](FinancialInstrumentMetadata.md) | The list of the financial instruments that match the query parameters | [optional] 
**next_token** | **str** | The token to retrieve the next page of results | [optional] 

## Example

```python
from ripple_payments_direct.models.list_financial_instruments_response import ListFinancialInstrumentsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListFinancialInstrumentsResponse from a JSON string
list_financial_instruments_response_instance = ListFinancialInstrumentsResponse.from_json(json)
# print the JSON string representation of the object
print(ListFinancialInstrumentsResponse.to_json())

# convert the object into a dict
list_financial_instruments_response_dict = list_financial_instruments_response_instance.to_dict()
# create an instance of ListFinancialInstrumentsResponse from a dict
list_financial_instruments_response_from_dict = ListFinancialInstrumentsResponse.from_dict(list_financial_instruments_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


