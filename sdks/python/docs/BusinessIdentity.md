# BusinessIdentity

PII data to support business and institutional identities 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_name** | **str** | Business Legal Name | 
**address** | [**BusinessIdentityAddress**](BusinessIdentityAddress.md) |  | 
**email** | **str** | Address for electronic mail (e-mail). | [optional] 
**phone** | **str** | Phone Number | [optional] 
**registration** | [**List[BusinessIdentityRegistrationInner]**](BusinessIdentityRegistrationInner.md) | Unique and unambiguous way to identify a business or organization. An array of objects, each containing unique identification of an organization, as assigned by an institution, using an identification scheme. | [optional] 
**incorporation_country** | **str** | Information that locates and identifies the country, as defined by postal services where the organization was incorporated. Use Alpha-2 Code as defined in the ISO CountryCode ISO 3166-1 list. | [optional] 
**incorporation_date** | **date** | The date when the business was incorporated. | [optional] 
**legal_entity_type** | **str** | Type of legal entity to distinguish between Financial Institutions and Non-Financial Institutions.  This classification is used to determine regulatory treatment and compliance requirements for certain payment corridors.  | [optional] 

## Example

```python
from ripple_payments_direct.models.business_identity import BusinessIdentity

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessIdentity from a JSON string
business_identity_instance = BusinessIdentity.from_json(json)
# print the JSON string representation of the object
print(BusinessIdentity.to_json())

# convert the object into a dict
business_identity_dict = business_identity_instance.to_dict()
# create an instance of BusinessIdentity from a dict
business_identity_from_dict = BusinessIdentity.from_dict(business_identity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


