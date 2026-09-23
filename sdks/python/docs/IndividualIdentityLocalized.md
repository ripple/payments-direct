# IndividualIdentityLocalized

Identity fields supplied in a non-Latin script, in addition to the Latin-script values elsewhere on the identity. Populate the script block that the destination corridor requires. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hanzi** | [**IndividualIdentityLocalizedHanzi**](IndividualIdentityLocalizedHanzi.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.individual_identity_localized import IndividualIdentityLocalized

# TODO update the JSON string below
json = "{}"
# create an instance of IndividualIdentityLocalized from a JSON string
individual_identity_localized_instance = IndividualIdentityLocalized.from_json(json)
# print the JSON string representation of the object
print(IndividualIdentityLocalized.to_json())

# convert the object into a dict
individual_identity_localized_dict = individual_identity_localized_instance.to_dict()
# create an instance of IndividualIdentityLocalized from a dict
individual_identity_localized_from_dict = IndividualIdentityLocalized.from_dict(individual_identity_localized_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


