# JpZengin

Rails: Zengin, Zengin Prompt Service  Rail Definitions:  Zengin: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: 9:00 PM JST (varies by bank) - Banking holidays: Japan banking holidays apply  Zengin Prompt Service: - Availability: 24/7/365 - Limit: JPY 1,000,000 (typically) - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order:   1. Zengin Prompt Service      - Conditions: beneficiary account is ZPS-addressable AND amount ≤ JPY 1,000,000   2. Zengin      - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**account_holder_name** | **str** | Name of the account holder in Japanese Katakana characters | 
**bank_code** | **str** | Zengin-Net/BOJ-assigned 4-digit Japanese bank code (e.g. 0001 Mizuho Bank, 0005 MUFG Bank). See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**branch_code** | **str** | Bank-assigned branch code identifying the specific branch | 
**account_number** | **str** | The identity&#39;s bank account number | 
**account_type** | **str** | The identity&#39;s account type | 

## Example

```python
from ripple_payments_direct.models.jp_zengin import JpZengin

# TODO update the JSON string below
json = "{}"
# create an instance of JpZengin from a JSON string
jp_zengin_instance = JpZengin.from_json(json)
# print the JSON string representation of the object
print(JpZengin.to_json())

# convert the object into a dict
jp_zengin_dict = jp_zengin_instance.to_dict()
# create an instance of JpZengin from a dict
jp_zengin_from_dict = JpZengin.from_dict(jp_zengin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


