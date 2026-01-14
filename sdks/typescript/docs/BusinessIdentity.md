# BusinessIdentity

PII data to support business and institutional identities 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessName** | **string** | Business Legal Name | [default to undefined]
**address** | [**BusinessIdentityAddress**](BusinessIdentityAddress.md) |  | [default to undefined]
**email** | **string** | Address for electronic mail (e-mail). | [optional] [default to undefined]
**phone** | **string** | Phone Number | [optional] [default to undefined]
**registration** | [**Array&lt;BusinessIdentityRegistrationInner&gt;**](BusinessIdentityRegistrationInner.md) | Unique and unambiguous way to identify a business or organization. An array of objects, each containing unique identification of an organization, as assigned by an institution, using an identification scheme. | [optional] [default to undefined]
**incorporationCountry** | **string** | Information that locates and identifies the country, as defined by postal services where the organization was incorporated. Use Alpha-2 Code as defined in the ISO CountryCode ISO 3166-1 list. | [optional] [default to undefined]

## Example

```typescript
import { BusinessIdentity } from '@ripple/payments-direct-client';

const instance: BusinessIdentity = {
    businessName,
    address,
    email,
    phone,
    registration,
    incorporationCountry,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
