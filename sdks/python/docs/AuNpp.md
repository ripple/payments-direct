# AuNpp

Rails: NPP (New Payments Platform), Direct Entry (DE/BECS)  Rail Definitions:  NPP: - Availability: 24/7/365 - Limit: AUD 20,000 per transaction (higher with arrangement) - Settlement: Real-time (within 15 minutes) - Cut-off time: None - Banking holidays: Not applicable  Direct Entry (BECS): - Availability: Business days only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: Bank-dependent - Banking holidays: Australian banking holidays apply  Routing Evaluation Order:   1. NPP      - Conditions: beneficiary account is NPP-addressable AND amount ≤ AUD 20,000   2. Direct Entry      - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bsb_code** | **str** | The 6-digit Bank-State-Branch (BSB) routing code | 
**account_number** | **str** | The identity&#39;s bank account number | 

## Example

```python
from ripple_payments_direct.models.au_npp import AuNpp

# TODO update the JSON string below
json = "{}"
# create an instance of AuNpp from a JSON string
au_npp_instance = AuNpp.from_json(json)
# print the JSON string representation of the object
print(AuNpp.to_json())

# convert the object into a dict
au_npp_dict = au_npp_instance.to_dict()
# create an instance of AuNpp from a dict
au_npp_from_dict = AuNpp.from_dict(au_npp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


