# BusinessIdentityLocalizedHanzi

Localized identity fields in Chinese Hanzi characters (汉字).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_name** | **str** | Business legal name in Chinese Hanzi characters.  | [optional] 

## Example

```python
from ripple_payments_direct.models.business_identity_localized_hanzi import BusinessIdentityLocalizedHanzi

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessIdentityLocalizedHanzi from a JSON string
business_identity_localized_hanzi_instance = BusinessIdentityLocalizedHanzi.from_json(json)
# print the JSON string representation of the object
print(BusinessIdentityLocalizedHanzi.to_json())

# convert the object into a dict
business_identity_localized_hanzi_dict = business_identity_localized_hanzi_instance.to_dict()
# create an instance of BusinessIdentityLocalizedHanzi from a dict
business_identity_localized_hanzi_from_dict = BusinessIdentityLocalizedHanzi.from_dict(business_identity_localized_hanzi_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


