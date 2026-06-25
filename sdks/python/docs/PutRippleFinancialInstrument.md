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
**gh_bank_payout** | [**GhBankPayout**](GhBankPayout.md) |  | [optional] 
**rw_bank_payout** | [**RwBankPayout**](RwBankPayout.md) |  | [optional] 
**za_bank_payout** | [**ZaBankPayout**](ZaBankPayout.md) |  | [optional] 
**ug_bank_payout** | [**UgBankPayout**](UgBankPayout.md) |  | [optional] 
**zm_bank_payout** | [**ZmBankPayout**](ZmBankPayout.md) |  | [optional] 
**eth_wallet** | [**EthWallet**](EthWallet.md) |  | [optional] 
**tron_wallet** | [**TronWallet**](TronWallet.md) |  | [optional] 
**sol_wallet** | [**SolWallet**](SolWallet.md) |  | [optional] 
**br_pix** | [**BrPix**](BrPix.md) |  | [optional] 
**co_pse** | [**CoPse**](CoPse.md) |  | [optional] 
**br_ted** | [**BrTed**](BrTed.md) |  | [optional] 
**ca_eft** | [**CaEft**](CaEft.md) |  | [optional] 
**hk_bank_payout** | [**HkBankPayout**](HkBankPayout.md) |  | [optional] 
**cn_trade** | [**CnTrade**](CnTrade.md) |  | [optional] 
**cn_individual** | [**CnIndividual**](CnIndividual.md) |  | [optional] 
**cn_individual_trade** | [**CnIndividualTrade**](CnIndividualTrade.md) |  | [optional] 
**cn_cfxps** | [**CnCfxps**](CnCfxps.md) |  | [optional] 

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


