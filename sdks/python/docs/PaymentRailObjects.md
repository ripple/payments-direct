# PaymentRailObjects


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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
**id_bifast** | [**IdBifast**](IdBifast.md) |  | [optional] 
**kr_kftc** | [**KrKftc**](KrKftc.md) |  | [optional] 
**in_neft** | [**InNeft**](InNeft.md) |  | [optional] 
**pe_lbtr** | [**PeLbtr**](PeLbtr.md) |  | [optional] 
**cn_trade** | [**CnTrade**](CnTrade.md) |  | [optional] 
**cn_individual** | [**CnIndividual**](CnIndividual.md) |  | [optional] 
**cn_individual_trade** | [**CnIndividualTrade**](CnIndividualTrade.md) |  | [optional] 
**cn_cfxps** | [**CnCfxps**](CnCfxps.md) |  | [optional] 
**cl_tef** | [**ClTef**](ClTef.md) |  | [optional] 
**ae_ipi** | [**AeIpi**](AeIpi.md) |  | [optional] 
**tr_fast** | [**TrFast**](TrFast.md) |  | [optional] 
**ph_nrps** | [**PhNrps**](PhNrps.md) |  | [optional] 
**th_promptpay** | [**ThPromptpay**](ThPromptpay.md) |  | [optional] 
**ar_interbanking** | [**ArInterbanking**](ArInterbanking.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.payment_rail_objects import PaymentRailObjects

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentRailObjects from a JSON string
payment_rail_objects_instance = PaymentRailObjects.from_json(json)
# print the JSON string representation of the object
print(PaymentRailObjects.to_json())

# convert the object into a dict
payment_rail_objects_dict = payment_rail_objects_instance.to_dict()
# create an instance of PaymentRailObjects from a dict
payment_rail_objects_from_dict = PaymentRailObjects.from_dict(payment_rail_objects_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


