# StateTransitionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state_transitions** | [**List[StateTransition]**](StateTransition.md) |  | 

## Example

```python
from ripple_payments_direct.models.state_transitions_response import StateTransitionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of StateTransitionsResponse from a JSON string
state_transitions_response_instance = StateTransitionsResponse.from_json(json)
# print the JSON string representation of the object
print(StateTransitionsResponse.to_json())

# convert the object into a dict
state_transitions_response_dict = state_transitions_response_instance.to_dict()
# create an instance of StateTransitionsResponse from a dict
state_transitions_response_from_dict = StateTransitionsResponse.from_dict(state_transitions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


