# FinancialInstrumentMetadata

Metadata information for a financial instrument without the payment rail specific details. Used in list operations to provide summary information. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**financial_instrument_id** | **str** | The unique identifier of the financial instrument. | 
**financial_instrument_type** | **str** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | 
**currency** | **str** | The 3-letter ISO currency code of the financial instrument. | 
**label** | **str** | A user-defined label for the financial instrument. | [optional] 
**country** | **str** | The 2-letter ISO 3166-1 alpha-2 country code of the financial instrument. | [optional] 
**created_at** | **datetime** | The time at which the financial instrument was created | [optional] 
**updated_at** | **datetime** | The time at which the financial instrument was last updated | [optional] 

## Example

```python
from ripple_payments_direct.models.financial_instrument_metadata import FinancialInstrumentMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of FinancialInstrumentMetadata from a JSON string
financial_instrument_metadata_instance = FinancialInstrumentMetadata.from_json(json)
# print the JSON string representation of the object
print(FinancialInstrumentMetadata.to_json())

# convert the object into a dict
financial_instrument_metadata_dict = financial_instrument_metadata_instance.to_dict()
# create an instance of FinancialInstrumentMetadata from a dict
financial_instrument_metadata_from_dict = FinancialInstrumentMetadata.from_dict(financial_instrument_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


