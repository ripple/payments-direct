# UsAch

Rails: RTP, ACH  Rail Definitions:  RTP:   - Availability: 24/7/365   - Limit: $5,000,000   - Settlement: <5 minutes   - Cut-off time: None   - Banking holidays: Not applicable  ACH:   - Availability: Business days only   - Limit: $1,000,000   - Settlement: Same-day   - Cut-off time: 3:00 PM EST   - Banking holidays: U.S. banking holidays apply  Routing Evaluation Order:    1. RTP      - Conditions: beneficiary account is RTP-addressable AND amount ≤ $5,000,000   2. ACH      - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_routing_number** | **str** | The identity&#39;s bank routing number | 
**account_number** | **str** | The identity&#39;s account number into which the funds must be credited | 
**account_type** | **str** | The identity’s account type. | 

## Example

```python
from ripple_payments_direct.models.us_ach import UsAch

# TODO update the JSON string below
json = "{}"
# create an instance of UsAch from a JSON string
us_ach_instance = UsAch.from_json(json)
# print the JSON string representation of the object
print(UsAch.to_json())

# convert the object into a dict
us_ach_dict = us_ach_instance.to_dict()
# create an instance of UsAch from a dict
us_ach_from_dict = UsAch.from_dict(us_ach_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


