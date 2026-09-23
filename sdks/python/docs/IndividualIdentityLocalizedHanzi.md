# IndividualIdentityLocalizedHanzi

Localized identity fields in Chinese Hanzi characters (汉字).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_name** | **str** | Individual given name in Chinese Hanzi characters. | [optional] 
**last_name** | **str** | Individual family name in Chinese Hanzi characters. | [optional] 
**business_name** | **str** | Business name associated with the individual in Chinese Hanzi characters, for trade payments.  | [optional] 

## Example

```python
from ripple_payments_direct.models.individual_identity_localized_hanzi import IndividualIdentityLocalizedHanzi

# TODO update the JSON string below
json = "{}"
# create an instance of IndividualIdentityLocalizedHanzi from a JSON string
individual_identity_localized_hanzi_instance = IndividualIdentityLocalizedHanzi.from_json(json)
# print the JSON string representation of the object
print(IndividualIdentityLocalizedHanzi.to_json())

# convert the object into a dict
individual_identity_localized_hanzi_dict = individual_identity_localized_hanzi_instance.to_dict()
# create an instance of IndividualIdentityLocalizedHanzi from a dict
individual_identity_localized_hanzi_from_dict = IndividualIdentityLocalizedHanzi.from_dict(individual_identity_localized_hanzi_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


