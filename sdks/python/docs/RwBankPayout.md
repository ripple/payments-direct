# RwBankPayout

Rails: RSwitch  Rail Definitions:   RSwitch:     - Availability: 24/7/365     - Limit: RWF 10,000,000     - Settlement: Real time to 48 hours     - Cut-off time: Real time     - Banking holidays: Applicable  Routing Evaluation Order:   1. RSwitch – Conditions: Account addressability, amount ≤ RWF 10,000,000 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The bank code of the identity&#39;s bank | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 

## Example

```python
from ripple_payments_direct.models.rw_bank_payout import RwBankPayout

# TODO update the JSON string below
json = "{}"
# create an instance of RwBankPayout from a JSON string
rw_bank_payout_instance = RwBankPayout.from_json(json)
# print the JSON string representation of the object
print(RwBankPayout.to_json())

# convert the object into a dict
rw_bank_payout_dict = rw_bank_payout_instance.to_dict()
# create an instance of RwBankPayout from a dict
rw_bank_payout_from_dict = RwBankPayout.from_dict(rw_bank_payout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


