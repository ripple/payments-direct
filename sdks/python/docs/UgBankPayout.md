# UgBankPayout

Rails: Bank Payout  Rail Definitions:   Bank Payout:     - Availability: 24/7/365     - Limit: UGX 20,000     - Settlement: Real time to 48 hours     - Cut-off time: Real time     - Banking holidays: Applicable  Routing Evaluation Order:   1. Bank Payout – Conditions: Account addressability, amount ≤ UGX 20,000 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The bank code of the identity&#39;s bank | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 

## Example

```python
from ripple_payments_direct.models.ug_bank_payout import UgBankPayout

# TODO update the JSON string below
json = "{}"
# create an instance of UgBankPayout from a JSON string
ug_bank_payout_instance = UgBankPayout.from_json(json)
# print the JSON string representation of the object
print(UgBankPayout.to_json())

# convert the object into a dict
ug_bank_payout_dict = ug_bank_payout_instance.to_dict()
# create an instance of UgBankPayout from a dict
ug_bank_payout_from_dict = UgBankPayout.from_dict(ug_bank_payout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


