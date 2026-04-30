# BusinessIdentityRegistrationInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **str** | The unique identifier of the organization | 
**type** | **str** | Type of business identification document. | 

## Example

```python
from ripple_payments_direct.models.business_identity_registration_inner import BusinessIdentityRegistrationInner

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessIdentityRegistrationInner from a JSON string
business_identity_registration_inner_instance = BusinessIdentityRegistrationInner.from_json(json)
# print the JSON string representation of the object
print(BusinessIdentityRegistrationInner.to_json())

# convert the object into a dict
business_identity_registration_inner_dict = business_identity_registration_inner_instance.to_dict()
# create an instance of BusinessIdentityRegistrationInner from a dict
business_identity_registration_inner_from_dict = BusinessIdentityRegistrationInner.from_dict(business_identity_registration_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


