# BusinessIdentityAddress

Holds general information about the business

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**street_address** | **List[str]** | Allows the street address of the business to be held | 
**country** | **str** | Allows the country of the business to be held. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. | 
**city** | **str** | City | 
**state_or_province** | **str** | Information that locates and identifies the state / county for the individual, as defined by postal services. | 
**postal_code** | **str** | Postal code for the business | 

## Example

```python
from ripple_payments_direct.models.business_identity_address import BusinessIdentityAddress

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessIdentityAddress from a JSON string
business_identity_address_instance = BusinessIdentityAddress.from_json(json)
# print the JSON string representation of the object
print(BusinessIdentityAddress.to_json())

# convert the object into a dict
business_identity_address_dict = business_identity_address_instance.to_dict()
# create an instance of BusinessIdentityAddress from a dict
business_identity_address_from_dict = BusinessIdentityAddress.from_dict(business_identity_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


