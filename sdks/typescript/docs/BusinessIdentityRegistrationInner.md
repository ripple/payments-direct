# BusinessIdentityRegistrationInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **string** | The unique identifier of the organization | [default to undefined]
**type** | **string** | Type of business identification document. Accepted values may vary by corridor and payment role. Some corridors accept only a subset of this list. See Ripple Docs for corridor-specific requirements. | [default to undefined]

## Example

```typescript
import { BusinessIdentityRegistrationInner } from '@ripple/payments-direct-client';

const instance: BusinessIdentityRegistrationInner = {
    number,
    type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
