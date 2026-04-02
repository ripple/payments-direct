# IdentityResponseV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identityId** | **string** | The unique ID of the identity | [default to undefined]
**identityType** | **string** | The type of the identity | [default to undefined]
**paymentRole** | **string** | The payment role of the identity | [default to undefined]
**createdAt** | **string** | The time at which the identity was created | [default to undefined]
**updatedAt** | **string** | The time at which the identity was last updated | [default to undefined]
**identityState** | **string** | The state of the identity   * ACTIVE   * DEACTIVATED  | [default to undefined]
**nickName** | **string** | The nickname for the identity provided at the time of identity creation | [optional] [default to undefined]
**internalId** | **string** | The internal ID of the identity used for internal processing | [optional] [default to undefined]
**tags** | **Array&lt;string&gt;** | Tags are used to categorize the identity.  | [optional] [default to undefined]
**version** | **number** | The version number of the identity | [default to undefined]
**schemaVersion** | **string** | The version of the schema | [default to undefined]

## Example

```typescript
import { IdentityResponseV3 } from '@ripple/payments-direct-client';

const instance: IdentityResponseV3 = {
    identityId,
    identityType,
    paymentRole,
    createdAt,
    updatedAt,
    identityState,
    nickName,
    internalId,
    tags,
    version,
    schemaVersion,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
