

# IndividualIdentityDTO

Data for an individual 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | First name of the individual |  |
|**lastName** | **String** | Last name of the individual |  |
|**address** | [**IndividualIdentityAddressDTO**](IndividualIdentityAddressDTO.md) |  |  |
|**email** | **String** | Address for electronic mail (e-mail). |  [optional] |
|**phone** | **String** | Phone Number |  [optional] |
|**identityDocuments** | [**List&lt;IndividualIdentityIdentityDocumentsInnerDTO&gt;**](IndividualIdentityIdentityDocumentsInnerDTO.md) | Gathers identifying documentation |  [optional] |
|**dateOfBirth** | **LocalDate** | Date of Birth. |  [optional] |
|**countryOfBirth** | **String** | Country of Birth. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. |  [optional] |
|**citizenship** | **String** | Alpha-2 country code for the nationality of the individual in ISO 3166-1 format. |  [optional] |
|**gender** | **String** | Gender of the identity.  - &#x60;MALE&#x60; — Male identity   - &#x60;FEMALE&#x60; — Female identity   - &#x60;OTHER&#x60; — Other identity  |  [optional] |



