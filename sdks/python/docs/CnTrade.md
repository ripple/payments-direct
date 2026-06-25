# CnTrade

Rails: CNAPS, SIB (IBPS), CUP, NUCC  Rail Definitions:  CNAPS: - Availability: Business days and banking hours only (HVPS); batch throughout day (BEPS) - Limit: No limit (HVPS); CNY 50,000 (BEPS) - Settlement: Same-day (HVPS real-time gross; BEPS batched) - Cut-off time: 5:00 PM CST (varies by bank) - Banking holidays: China banking holidays apply  SIB / IBPS (Super Internet Banking / Internet Banking Payment System): - Availability: 24/7/365 - Limit: Varies by bank - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable  CUP (China UnionPay): - Availability: 24/7/365 - Limit: Varies by bank and account type - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable  NUCC (NetsUnion Clearing Corporation): - Availability: 24/7/365 - Limit: Varies - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Determined at runtime based on transaction type, amount, and operational conditions. All rails use the same CNAPS bank codes for routing.  Purpose codes: GDDS (Goods), SCVE (Services) — trade-only. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | Beneficiary Bank Name. Looked up from bankCode. | 
**bank_code** | **str** | Ripple Bank Code for the destination bank. Use the Ripple Bank Codes lookup at docs.ripple.com to find the correct code. | 
**branch_name** | **str** | Beneficiary Branch Name (Hanzi). Branch name in Chinese Hanzi characters. | 
**branch_province** | **str** | Beneficiary Bank Branch Province. Province/region codes — 34 values published on Docs (e.g., 110000&#x3D;北京, 310000&#x3D;上海). | 
**branch_city** | **str** | Beneficiary Bank Branch City. City codes — 700+ values published on Docs (e.g., 110000&#x3D;北京, 130100&#x3D;石家庄). | 
**account_number** | **str** | Beneficiary Account Number. | 
**account_holder_name** | **str** | Beneficiary Account Holder Name (Hanzi). Account name in Chinese Hanzi characters. | 

## Example

```python
from ripple_payments_direct.models.cn_trade import CnTrade

# TODO update the JSON string below
json = "{}"
# create an instance of CnTrade from a JSON string
cn_trade_instance = CnTrade.from_json(json)
# print the JSON string representation of the object
print(CnTrade.to_json())

# convert the object into a dict
cn_trade_dict = cn_trade_instance.to_dict()
# create an instance of CnTrade from a dict
cn_trade_from_dict = CnTrade.from_dict(cn_trade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


