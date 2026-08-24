# IndividualIdentity

Data for an individual 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_name** | **str** | First name of the individual | 
**last_name** | **str** | Last name of the individual | 
**address** | [**IndividualIdentityAddress**](IndividualIdentityAddress.md) |  | 
**email** | **str** | Address for electronic mail (e-mail). | [optional] 
**phone** | **str** | Phone Number | [optional] 
**identity_documents** | [**List[IndividualIdentityIdentityDocumentsInner]**](IndividualIdentityIdentityDocumentsInner.md) | Gathers identifying documentation | [optional] 
**date_of_birth** | **date** | Date of Birth. | [optional] 
**country_of_birth** | **str** | Country of Birth. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. | [optional] 
**citizenship** | **str** | Alpha-2 country code for the nationality of the individual in ISO 3166-1 format. | [optional] 
**gender** | **str** | Gender of the identity. | [optional] 

## Example

```python
from ripple_payments_direct.models.individual_identity import IndividualIdentity

# TODO update the JSON string below
json = "{}"
# create an instance of IndividualIdentity from a JSON string
individual_identity_instance = IndividualIdentity.from_json(json)
# print the JSON string representation of the object
print(IndividualIdentity.to_json())

# convert the object into a dict
individual_identity_dict = individual_identity_instance.to_dict()
# create an instance of IndividualIdentity from a dict
individual_identity_from_dict = IndividualIdentity.from_dict(individual_identity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


