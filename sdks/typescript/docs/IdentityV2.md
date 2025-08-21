# IdentityV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identityId** | **string** | The unique ID of the identity | [default to undefined]
**nickName** | **string** | The nickname of the identity provided at the time of identity creation. | [default to undefined]
**createdAt** | **string** | The time at which the identity was created | [default to undefined]
**identityType** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | [default to undefined]
**useCaseType** | [**UseCaseType**](UseCaseType.md) |  | [default to undefined]

## Example

```typescript
import { IdentityV2 } from '@ripple/payments-direct-client';

const instance: IdentityV2 = {
    identityId,
    nickName,
    createdAt,
    identityType,
    useCaseType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
