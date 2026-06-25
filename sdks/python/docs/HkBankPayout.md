# HkBankPayout

Rails: Bank Payout  Rail Definitions:  Bank Payout: - Availability: Business days only - Limit: None - Settlement: Same-day to T+1 - Cut-off time: Bank-dependent - Banking holidays: Hong Kong banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the beneficiary&#39;s bank | 
**account_number** | **str** | Bank account number (BBAN) | 
**account_holder_name** | **str** | Name of the account holder | 
**swift_code** | **str** | SWIFT/BIC code of the bank | 
**currency** | **str** | Currency code. Only HKD is supported for Hong Kong Bank Payout. | [optional] 

## Example

```python
from ripple_payments_direct.models.hk_bank_payout import HkBankPayout

# TODO update the JSON string below
json = "{}"
# create an instance of HkBankPayout from a JSON string
hk_bank_payout_instance = HkBankPayout.from_json(json)
# print the JSON string representation of the object
print(HkBankPayout.to_json())

# convert the object into a dict
hk_bank_payout_dict = hk_bank_payout_instance.to_dict()
# create an instance of HkBankPayout from a dict
hk_bank_payout_from_dict = HkBankPayout.from_dict(hk_bank_payout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


