# IdentityResponseV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identityId** | **string** | The unique ID of the identity | [default to undefined]
**identityType** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | [default to undefined]
**createdAt** | **string** | The time at which the identity was created | [default to undefined]
**identityState** | [**StateType**](StateType.md) |  | [default to undefined]
**nickName** | **string** | The nickname for the identity provided at the time of identity creation | [optional] [default to undefined]
**piiData** | **{ [key: string]: any; }** | PII data in JSON format | [default to undefined]
**version** | **number** | The version number of the identity | [default to undefined]
**useCaseType** | [**UseCaseType**](UseCaseType.md) |  | [default to undefined]

## Example

```typescript
import { IdentityResponseV2 } from '@ripple/payments-direct-client';

const instance: IdentityResponseV2 = {
    identityId,
    identityType,
    createdAt,
    identityState,
    nickName,
    piiData,
    version,
    useCaseType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
