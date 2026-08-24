# ZaBankPayout

Rails: Bank Payout  Rail Definitions:   Bank Payout:     - Availability: 24/7/365     - Limit: R 300,000     - Settlement: Real time to 48 hours     - Cut-off time: Real time     - Banking holidays: Applicable  Routing Evaluation Order:   1. Bank Payout – Conditions: Account addressability, amount ≤ R 300,000 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The bank code of the identity&#39;s bank | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 

## Example

```python
from ripple_payments_direct.models.za_bank_payout import ZaBankPayout

# TODO update the JSON string below
json = "{}"
# create an instance of ZaBankPayout from a JSON string
za_bank_payout_instance = ZaBankPayout.from_json(json)
# print the JSON string representation of the object
print(ZaBankPayout.to_json())

# convert the object into a dict
za_bank_payout_dict = za_bank_payout_instance.to_dict()
# create an instance of ZaBankPayout from a dict
za_bank_payout_from_dict = ZaBankPayout.from_dict(za_bank_payout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


