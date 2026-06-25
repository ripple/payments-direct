# CnIndividualTrade

Rails: CUP (China UnionPay)  Rail Definitions:  CUP (China UnionPay): - Availability: 24/7/365 - Limit: Varies by bank and account type - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable (24/7 service)  Routing: CUP routes using the card/account number directly. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | Beneficiary Bank Name. | 
**account_number** | **str** | Beneficiary Account Number. | 
**account_holder_name** | **str** | Beneficiary Account Holder Name (Hanzi). Account name in Chinese Hanzi characters. For sole proprietors, bank account may be registered under business name. | 

## Example

```python
from ripple_payments_direct.models.cn_individual_trade import CnIndividualTrade

# TODO update the JSON string below
json = "{}"
# create an instance of CnIndividualTrade from a JSON string
cn_individual_trade_instance = CnIndividualTrade.from_json(json)
# print the JSON string representation of the object
print(CnIndividualTrade.to_json())

# convert the object into a dict
cn_individual_trade_dict = cn_individual_trade_instance.to_dict()
# create an instance of CnIndividualTrade from a dict
cn_individual_trade_from_dict = CnIndividualTrade.from_dict(cn_individual_trade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


