# BrTed

Rails: TED  Rail Definitions:  TED: - Availability: Business days only - Limit: No limit - Settlement: Same-day - Cut-off time: ~5:00 PM BRT  - Banking holidays: Brazil banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The code of the identity&#39;s bank (BICFI code) | 
**branch_number** | **str** | The branch number of the identity&#39;s bank account | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 
**account_type** | **str** | The identity&#39;s account type (Savings, Checking etc.) | 

## Example

```python
from ripple_payments_direct.models.br_ted import BrTed

# TODO update the JSON string below
json = "{}"
# create an instance of BrTed from a JSON string
br_ted_instance = BrTed.from_json(json)
# print the JSON string representation of the object
print(BrTed.to_json())

# convert the object into a dict
br_ted_dict = br_ted_instance.to_dict()
# create an instance of BrTed from a dict
br_ted_from_dict = BrTed.from_dict(br_ted_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


