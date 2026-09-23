# BusinessIdentityLocalized

Identity fields supplied in a non-Latin script, in addition to the Latin-script values elsewhere on the identity. Populate the script block that the destination corridor requires. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hanzi** | [**BusinessIdentityLocalizedHanzi**](BusinessIdentityLocalizedHanzi.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.business_identity_localized import BusinessIdentityLocalized

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessIdentityLocalized from a JSON string
business_identity_localized_instance = BusinessIdentityLocalized.from_json(json)
# print the JSON string representation of the object
print(BusinessIdentityLocalized.to_json())

# convert the object into a dict
business_identity_localized_dict = business_identity_localized_instance.to_dict()
# create an instance of BusinessIdentityLocalized from a dict
business_identity_localized_from_dict = BusinessIdentityLocalized.from_dict(business_identity_localized_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


