# BusinessIdentityRegistrationInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **string** | The unique identifier of the organization | [default to undefined]
**type** | **string** | Type of business identification document. Accepted values are:  - &#x60;INCORPORATION_CERTIFICATE&#x60; — Certificate of Incorporation Number   - &#x60;TAX_ID&#x60; — Tax Identification Number  | [default to undefined]

## Example

```typescript
import { BusinessIdentityRegistrationInner } from '@ripple/payments-direct-client';

const instance: BusinessIdentityRegistrationInner = {
    number,
    type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
