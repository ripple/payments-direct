# RippleFinancialInstrumentEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**us_ach** | [**UsAch**](UsAch.md) |  | [optional] 
**us_fedwire** | [**UsFedwire**](UsFedwire.md) |  | [optional] 
**mx_spei** | [**MxSpei**](MxSpei.md) |  | [optional] 
**eu_sepa** | [**EuSepa**](EuSepa.md) |  | [optional] 
**gb_fps** | [**GbFps**](GbFps.md) |  | [optional] 
**ng_bank_payout** | [**NgBankPayout**](NgBankPayout.md) |  | [optional] 
**br_pix** | [**BrPix**](BrPix.md) |  | [optional] 
**co_pse** | [**CoPse**](CoPse.md) |  | [optional] 
**br_ted** | [**BrTed**](BrTed.md) |  | [optional] 
**ca_eft** | [**CaEft**](CaEft.md) |  | [optional] 
**currency** | **str** | The 3-letter ISO currency code of the financial instrument. | 
**label** | **str** | A user-defined label for the financial instrument. | [optional] 
**financial_instrument_type** | **str** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | 
**country** | **str** | The country of the financial instrument. | [optional] 
**financial_instrument_id** | **str** | The unique identifier of the financial instrument. | [optional] 
**created_at** | **datetime** | The time at which the financial instrument was created | [optional] 
**updated_at** | **datetime** | The time at which the financial instrument was last updated | [optional] 

## Example

```python
from ripple_payments_direct.models.ripple_financial_instrument_entry import RippleFinancialInstrumentEntry

# TODO update the JSON string below
json = "{}"
# create an instance of RippleFinancialInstrumentEntry from a JSON string
ripple_financial_instrument_entry_instance = RippleFinancialInstrumentEntry.from_json(json)
# print the JSON string representation of the object
print(RippleFinancialInstrumentEntry.to_json())

# convert the object into a dict
ripple_financial_instrument_entry_dict = ripple_financial_instrument_entry_instance.to_dict()
# create an instance of RippleFinancialInstrumentEntry from a dict
ripple_financial_instrument_entry_from_dict = RippleFinancialInstrumentEntry.from_dict(ripple_financial_instrument_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


