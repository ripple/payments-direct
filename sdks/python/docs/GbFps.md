# GbFps

Rails: FPS, CHAPS  Rail Definitions:  FPS: - Availability: 24/7/365 - Limit: £1,000,000 - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  CHAPS: - Availability: Business days only - Limit: No limit - Settlement: Same-day - Cut-off time: Typically 5:00 PM GMT/BST (bank-dependent) - Banking holidays: UK banking holidays apply  Routing Evaluation Order:   1. FPS        - Conditions: beneficiary account is FPS-addressable AND amount ≤ £1,000,000   2. CHAPS        - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**sort_code** | **str** | The sort code of the identity&#39;s bank account | 
**account_number** | **str** | The account number of the identity&#39;s bank account | 

## Example

```python
from ripple_payments_direct.models.gb_fps import GbFps

# TODO update the JSON string below
json = "{}"
# create an instance of GbFps from a JSON string
gb_fps_instance = GbFps.from_json(json)
# print the JSON string representation of the object
print(GbFps.to_json())

# convert the object into a dict
gb_fps_dict = gb_fps_instance.to_dict()
# create an instance of GbFps from a dict
gb_fps_from_dict = GbFps.from_dict(gb_fps_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


