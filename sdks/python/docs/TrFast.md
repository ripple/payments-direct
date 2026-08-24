# TrFast

Rails: FAST (Fast Electronic Fund Transfer), EFT (Elektronik Fon Transferi)  Rail Definitions:  FAST: - Availability: 24/7/365 - Limit: No limit - Settlement: Real-time (within minutes) - Cut-off time: None - Banking holidays: Not applicable  EFT: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: 5:30 PM TRT - Banking holidays: Turkey banking holidays apply  Routing Evaluation Order:   1. FAST      - Conditions: beneficiary account is FAST-addressable   2. EFT      - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**iban** | **str** | Turkey IBAN (26 characters, starting with TR) | 
**bank_code** | **str** | SWIFT/BIC code of the identity&#39;s bank. Named bankCode for v2 ADR compatibility; maps to BICFI in ISO 20022. | 

## Example

```python
from ripple_payments_direct.models.tr_fast import TrFast

# TODO update the JSON string below
json = "{}"
# create an instance of TrFast from a JSON string
tr_fast_instance = TrFast.from_json(json)
# print the JSON string representation of the object
print(TrFast.to_json())

# convert the object into a dict
tr_fast_dict = tr_fast_instance.to_dict()
# create an instance of TrFast from a dict
tr_fast_from_dict = TrFast.from_dict(tr_fast_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


