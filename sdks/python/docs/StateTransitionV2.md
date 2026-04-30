# StateTransitionV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updated_from** | **str** | Current state of a payment.  The payment lifecycle currently uses the following values:  - &#x60;QUOTED&#x60;  - &#x60;INITIATED&#x60;  - &#x60;VALIDATING&#x60;  - &#x60;TRANSFERRING&#x60;  - &#x60;COMPLETED&#x60;  - &#x60;FAILED&#x60;  - &#x60;RETURNED&#x60;  - &#x60;DECLINED&#x60;  - &#x60;AWAITING_FUNDING&#x60;  Additional states may be introduced in the future without breaking existing integrations.  | 
**updated_to** | **str** | Current state of a payment.  The payment lifecycle currently uses the following values:  - &#x60;QUOTED&#x60;  - &#x60;INITIATED&#x60;  - &#x60;VALIDATING&#x60;  - &#x60;TRANSFERRING&#x60;  - &#x60;COMPLETED&#x60;  - &#x60;FAILED&#x60;  - &#x60;RETURNED&#x60;  - &#x60;DECLINED&#x60;  - &#x60;AWAITING_FUNDING&#x60;  Additional states may be introduced in the future without breaking existing integrations.  | 
**updated_at** | **datetime** | The timestamp when the payment state was updated. | 

## Example

```python
from ripple_payments_direct.models.state_transition_v2 import StateTransitionV2

# TODO update the JSON string below
json = "{}"
# create an instance of StateTransitionV2 from a JSON string
state_transition_v2_instance = StateTransitionV2.from_json(json)
# print the JSON string representation of the object
print(StateTransitionV2.to_json())

# convert the object into a dict
state_transition_v2_dict = state_transition_v2_instance.to_dict()
# create an instance of StateTransitionV2 from a dict
state_transition_v2_from_dict = StateTransitionV2.from_dict(state_transition_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


