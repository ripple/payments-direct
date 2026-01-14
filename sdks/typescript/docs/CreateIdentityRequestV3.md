# CreateIdentityRequestV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nickName** | **string** | The nickname for the identity | [optional] [default to undefined]
**validatePayoutRails** | **Array&lt;string&gt;** | The payout rails to validate the identity against | [optional] [default to undefined]
**tags** | **Array&lt;string&gt;** | Tags are used to categorize the identity.  | [optional] [default to undefined]
**identityType** | **string** | The type of the identity | [default to undefined]
**paymentRole** | **string** | The payment role of the identity | [default to undefined]
**internalId** | **string** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] [default to undefined]
**business** | [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] [default to undefined]
**individual** | [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateIdentityRequestV3 } from '@ripple/payments-direct-client';

const instance: CreateIdentityRequestV3 = {
    nickName,
    validatePayoutRails,
    tags,
    identityType,
    paymentRole,
    internalId,
    business,
    individual,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
