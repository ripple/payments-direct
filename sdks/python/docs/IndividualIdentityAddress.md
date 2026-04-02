# IndividualIdentityAddress

Holds general information about the individual

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**street_address** | **List[str]** | Allows the street address of the individual to be held | 
**country** | **str** | Allows the Country of the individual to be held. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. | 
**city** | **str** | City | 
**state_or_province** | **str** | Information that locates and identifies the state / county for the party, as defined by postal services | 
**postal_code** | **str** | Postal code for the individual&#39;s address | 

## Example

```python
from ripple_payments_direct.models.individual_identity_address import IndividualIdentityAddress

# TODO update the JSON string below
json = "{}"
# create an instance of IndividualIdentityAddress from a JSON string
individual_identity_address_instance = IndividualIdentityAddress.from_json(json)
# print the JSON string representation of the object
print(IndividualIdentityAddress.to_json())

# convert the object into a dict
individual_identity_address_dict = individual_identity_address_instance.to_dict()
# create an instance of IndividualIdentityAddress from a dict
individual_identity_address_from_dict = IndividualIdentityAddress.from_dict(individual_identity_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


