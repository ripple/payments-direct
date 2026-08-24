# IndividualIdentityAddress

Holds general information about the individual

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**streetAddress** | **Array&lt;string&gt;** | Allows the street address of the individual to be held | [default to undefined]
**country** | **string** | Allows the Country of the individual to be held. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. | [default to undefined]
**city** | **string** | City | [default to undefined]
**stateOrProvince** | **string** | Information that locates and identifies the state / county for the party, as defined by postal services | [default to undefined]
**postalCode** | **string** | Postal code for the individual\&#39;s address | [default to undefined]

## Example

```typescript
import { IndividualIdentityAddress } from '@ripple/payments-direct-client';

const instance: IndividualIdentityAddress = {
    streetAddress,
    country,
    city,
    stateOrProvince,
    postalCode,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
