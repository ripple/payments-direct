# NgBankPayout

Rails: Bank Payout  Rail Definitions:  Bank Payout: - Availability: Country-dependant - Limit: - Nigeria: ₦5,000,000 - Settlement: Real time to 48 hours - Cut-off time: Real time - Banking holidays: Nigeria banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The bank code of the identity&#39;s bank | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 
**country** | **str** | The country of the identity’s bank, using the Alpha-2 code as defined in ISO 3166-1. | 

## Example

```python
from ripple_payments_direct.models.ng_bank_payout import NgBankPayout

# TODO update the JSON string below
json = "{}"
# create an instance of NgBankPayout from a JSON string
ng_bank_payout_instance = NgBankPayout.from_json(json)
# print the JSON string representation of the object
print(NgBankPayout.to_json())

# convert the object into a dict
ng_bank_payout_dict = ng_bank_payout_instance.to_dict()
# create an instance of NgBankPayout from a dict
ng_bank_payout_from_dict = NgBankPayout.from_dict(ng_bank_payout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


