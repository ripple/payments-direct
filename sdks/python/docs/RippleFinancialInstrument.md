# RippleFinancialInstrument

Request to create a new financial instrument for an identity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**us_ach** | [**UsAch**](UsAch.md) |  | [optional] 
**us_fedwire** | [**UsFedwire**](UsFedwire.md) |  | [optional] 
**mx_spei** | [**MxSpei**](MxSpei.md) |  | [optional] 
**eu_sepa** | [**EuSepa**](EuSepa.md) |  | [optional] 
**gb_fps** | [**GbFps**](GbFps.md) |  | [optional] 
**africa_bank_payout** | [**AfricaBankPayout**](AfricaBankPayout.md) |  | [optional] 
**br_pix** | [**BrPix**](BrPix.md) |  | [optional] 
**co_pse** | [**CoPse**](CoPse.md) |  | [optional] 
**br_ted** | [**BrTed**](BrTed.md) |  | [optional] 
**ca_eft** | [**CaEft**](CaEft.md) |  | [optional] 
**currency** | **str** | The 3-letter ISO currency code of the financial instrument. | 
**label** | **str** | A user-defined label for the financial instrument. | [optional] 
**financial_instrument_type** | **str** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | 

## Example

```python
from ripple_payments_direct.models.ripple_financial_instrument import RippleFinancialInstrument

# TODO update the JSON string below
json = "{}"
# create an instance of RippleFinancialInstrument from a JSON string
ripple_financial_instrument_instance = RippleFinancialInstrument.from_json(json)
# print the JSON string representation of the object
print(RippleFinancialInstrument.to_json())

# convert the object into a dict
ripple_financial_instrument_dict = ripple_financial_instrument_instance.to_dict()
# create an instance of RippleFinancialInstrument from a dict
ripple_financial_instrument_from_dict = RippleFinancialInstrument.from_dict(ripple_financial_instrument_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


