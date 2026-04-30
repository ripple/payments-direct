# BusinessIdentityAddress

Holds general information about the business

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**streetAddress** | **Array&lt;string&gt;** | Allows the street address of the business to be held | [default to undefined]
**country** | **string** | Allows the country of the business to be held. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. | [default to undefined]
**city** | **string** | City | [default to undefined]
**stateOrProvince** | **string** | Information that locates and identifies the state / county for the individual, as defined by postal services. | [default to undefined]
**postalCode** | **string** | Postal code for the business | [default to undefined]

## Example

```typescript
import { BusinessIdentityAddress } from '@ripple/payments-direct-client';

const instance: BusinessIdentityAddress = {
    streetAddress,
    country,
    city,
    stateOrProvince,
    postalCode,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
