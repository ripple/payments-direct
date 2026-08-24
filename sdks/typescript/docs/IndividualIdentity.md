# IndividualIdentity

Data for an individual 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **string** | First name of the individual | [default to undefined]
**lastName** | **string** | Last name of the individual | [default to undefined]
**address** | [**IndividualIdentityAddress**](IndividualIdentityAddress.md) |  | [default to undefined]
**email** | **string** | Address for electronic mail (e-mail). | [optional] [default to undefined]
**phone** | **string** | Phone Number | [optional] [default to undefined]
**identityDocuments** | [**Array&lt;IndividualIdentityIdentityDocumentsInner&gt;**](IndividualIdentityIdentityDocumentsInner.md) | Gathers identifying documentation | [optional] [default to undefined]
**dateOfBirth** | **string** | Date of Birth. | [optional] [default to undefined]
**countryOfBirth** | **string** | Country of Birth. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. | [optional] [default to undefined]
**citizenship** | **string** | Alpha-2 country code for the nationality of the individual in ISO 3166-1 format. | [optional] [default to undefined]
**gender** | **string** | Gender of the identity. | [optional] [default to undefined]

## Example

```typescript
import { IndividualIdentity } from '@ripple/payments-direct-client';

const instance: IndividualIdentity = {
    firstName,
    lastName,
    address,
    email,
    phone,
    identityDocuments,
    dateOfBirth,
    countryOfBirth,
    citizenship,
    gender,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
