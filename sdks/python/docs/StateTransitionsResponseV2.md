# StateTransitionsResponseV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state_transitions** | [**List[StateTransitionV2]**](StateTransitionV2.md) |  | 

## Example

```python
from ripple_payments_direct.models.state_transitions_response_v2 import StateTransitionsResponseV2

# TODO update the JSON string below
json = "{}"
# create an instance of StateTransitionsResponseV2 from a JSON string
state_transitions_response_v2_instance = StateTransitionsResponseV2.from_json(json)
# print the JSON string representation of the object
print(StateTransitionsResponseV2.to_json())

# convert the object into a dict
state_transitions_response_v2_dict = state_transitions_response_v2_instance.to_dict()
# create an instance of StateTransitionsResponseV2 from a dict
state_transitions_response_v2_from_dict = StateTransitionsResponseV2.from_dict(state_transitions_response_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


