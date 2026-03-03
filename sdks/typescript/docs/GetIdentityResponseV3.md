# GetIdentityResponseV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identityId** | **string** | Server-generated unique identifier of the identity. | [optional] [default to undefined]
**identityState** | **string** | The state of the identity. | [optional] [default to undefined]
**nickName** | **string** | Optional human-readable alias set by the client. | [optional] [default to undefined]
**tags** | **Array&lt;string&gt;** | Optional labels used to categorize or filter identities. | [optional] [default to undefined]
**validatePayoutRails** | **Array&lt;string&gt;** | List of payout methods where this identity is considered valid. Use this to indicate which payout methods (for example, US_ACH, EU_SEPA) the identity can be used with in payments. | [optional] [default to undefined]
**version** | **string** | Sequential version number. Each successful PUT creates a higher version. | [optional] [default to undefined]
**schemaVersion** | **string** | Schema version used to validate this identity, for example 1.0.0. | [optional] [default to undefined]
**createdAt** | **string** | RFC 3339 timestamp when the identity was created. | [optional] [default to undefined]
**updatedAt** | **string** | RFC 3339 timestamp when the identity was last updated. | [optional] [default to undefined]
**identityType** | **string** | The type of the identity | [default to undefined]
**paymentRole** | **string** | The payment role of the identity | [default to undefined]
**internalId** | **string** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] [default to undefined]
**business** | [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] [default to undefined]
**individual** | [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] [default to undefined]

## Example

```typescript
import { GetIdentityResponseV3 } from '@ripple/payments-direct-client';

const instance: GetIdentityResponseV3 = {
    identityId,
    identityState,
    nickName,
    tags,
    validatePayoutRails,
    version,
    schemaVersion,
    createdAt,
    updatedAt,
    identityType,
    paymentRole,
    internalId,
    business,
    individual,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
