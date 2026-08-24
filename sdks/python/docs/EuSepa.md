# EuSepa

Rails: SCT Inst, SCT  Rail Definitions:  SCT Inst: - Availability: 24/7/365 - Limit: €100,000 (bank-dependent) - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  SCT: - Availability: Business days only - Limit: No limit - Settlement: T+2 to T+5  - Cut-off time: 3:00PM GMT/BST - Banking holidays: TARGET2 holidays apply  Routing Evaluation Order:    1. SCT Inst        - Conditions: beneficiary account is SCT Inst-addressable AND amount ≤ €100,000   2. SCT        - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**iban** | **str** | The International Bank Account Number (IBAN) of the identity&#39;s account | 

## Example

```python
from ripple_payments_direct.models.eu_sepa import EuSepa

# TODO update the JSON string below
json = "{}"
# create an instance of EuSepa from a JSON string
eu_sepa_instance = EuSepa.from_json(json)
# print the JSON string representation of the object
print(EuSepa.to_json())

# convert the object into a dict
eu_sepa_dict = eu_sepa_instance.to_dict()
# create an instance of EuSepa from a dict
eu_sepa_from_dict = EuSepa.from_dict(eu_sepa_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


