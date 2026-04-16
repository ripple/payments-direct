# PutRippleFinancialInstrument

Request to update an existing financial instrument of an identity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str** | A user-defined label for the financial instrument. | [optional] 
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

## Example

```python
from ripple_payments_direct.models.put_ripple_financial_instrument import PutRippleFinancialInstrument

# TODO update the JSON string below
json = "{}"
# create an instance of PutRippleFinancialInstrument from a JSON string
put_ripple_financial_instrument_instance = PutRippleFinancialInstrument.from_json(json)
# print the JSON string representation of the object
print(PutRippleFinancialInstrument.to_json())

# convert the object into a dict
put_ripple_financial_instrument_dict = put_ripple_financial_instrument_instance.to_dict()
# create an instance of PutRippleFinancialInstrument from a dict
put_ripple_financial_instrument_from_dict = PutRippleFinancialInstrument.from_dict(put_ripple_financial_instrument_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


