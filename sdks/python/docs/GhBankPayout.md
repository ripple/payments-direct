# GhBankPayout

Rails: GIP  Rail Definitions:   GIP:     - Availability: 24/7/365     - Limit: ₵100,000     - Settlement: Real time to 48 hours     - Cut-off time: Real time     - Banking holidays: Applicable  Routing Evaluation Order:   1. GIP – Conditions: Account addressability, amount ≤ ₵100,000 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The bank code of the identity&#39;s bank | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 

## Example

```python
from ripple_payments_direct.models.gh_bank_payout import GhBankPayout

# TODO update the JSON string below
json = "{}"
# create an instance of GhBankPayout from a JSON string
gh_bank_payout_instance = GhBankPayout.from_json(json)
# print the JSON string representation of the object
print(GhBankPayout.to_json())

# convert the object into a dict
gh_bank_payout_dict = gh_bank_payout_instance.to_dict()
# create an instance of GhBankPayout from a dict
gh_bank_payout_from_dict = GhBankPayout.from_dict(gh_bank_payout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


