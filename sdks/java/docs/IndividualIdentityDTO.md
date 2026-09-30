

# IndividualIdentityDTO

Data for an individual 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | First name of the individual |  |
|**lastName** | **String** | Last name of the individual |  |
|**address** | [**IndividualIdentityAddressDTO**](IndividualIdentityAddressDTO.md) |  |  |
|**email** | **String** | Address for electronic mail (e-mail). |  [optional] |
|**phone** | **String** | Phone Number.  |  [optional] |
|**identityDocuments** | [**List&lt;IndividualIdentityIdentityDocumentsInnerDTO&gt;**](IndividualIdentityIdentityDocumentsInnerDTO.md) | Identification documents for the identity, such as a passport, national ID, or tax ID. Required for ORIGINATOR and BENEFICIARY identities on some corridors and optional on others; see the Payload schema utility for the corridors that require it. Also required for ORIGINATOR identities when your organization is configured for the Brazil (BR) jurisdiction, on every corridor, including corridors that do not otherwise require it. Jurisdiction comes from your organization&#39;s configuration, not from a value in the request. Where the field is required, omitting it fails identity create and update with 400 Bad Request (USR_111). For accepted document types per corridor and role, see Accepted document types by corridor.  |  [optional] |
|**dateOfBirth** | **LocalDate** | Date of Birth. |  [optional] |
|**countryOfBirth** | **String** | Country of Birth. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. |  [optional] |
|**citizenship** | **String** | Alpha-2 country code for the nationality of the individual in ISO 3166-1 format. |  [optional] |
|**gender** | **String** | Gender of the identity. |  [optional] |
|**localized** | [**IndividualIdentityLocalizedDTO**](IndividualIdentityLocalizedDTO.md) |  |  [optional] |



