

# BusinessIdentityDTO

PII data to support business and institutional identities 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessName** | **String** | Business Legal Name |  |
|**address** | [**BusinessIdentityAddressDTO**](BusinessIdentityAddressDTO.md) |  |  |
|**email** | **String** | Address for electronic mail (e-mail). |  [optional] |
|**phone** | **String** | Phone Number |  [optional] |
|**registration** | [**List&lt;BusinessIdentityRegistrationInnerDTO&gt;**](BusinessIdentityRegistrationInnerDTO.md) | Unique and unambiguous way to identify a business or organization. An array of objects, each containing unique identification of an organization, as assigned by an institution, using an identification scheme. |  [optional] |
|**incorporationCountry** | **String** | Information that locates and identifies the country, as defined by postal services where the organization was incorporated. Use Alpha-2 Code as defined in the ISO CountryCode ISO 3166-1 list. |  [optional] |
|**incorporationDate** | **LocalDate** | The date when the business was incorporated. |  [optional] |
|**legalEntityType** | **String** | Type of legal entity to distinguish between Financial Institutions and Non-Financial Institutions.  This classification is used to determine regulatory treatment and compliance requirements for certain payment corridors.  |  [optional] |



