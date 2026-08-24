# InNeft

Rails: NEFT (National Electronic Funds Transfer)  Rail Definitions:  NEFT: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day (by end of business day) - Cut-off time: 7:00 PM IST (varies by bank) - Banking holidays: India banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**ifsc_code** | **str** | The 11-character IFSC code of the identity&#39;s bank branch | 
**account_number** | **str** | The identity&#39;s bank account number | 

## Example

```python
from ripple_payments_direct.models.in_neft import InNeft

# TODO update the JSON string below
json = "{}"
# create an instance of InNeft from a JSON string
in_neft_instance = InNeft.from_json(json)
# print the JSON string representation of the object
print(InNeft.to_json())

# convert the object into a dict
in_neft_dict = in_neft_instance.to_dict()
# create an instance of InNeft from a dict
in_neft_from_dict = InNeft.from_dict(in_neft_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


