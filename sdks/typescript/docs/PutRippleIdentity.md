# PutRippleIdentity

Request to update an existing identity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**internalId** | **string** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] [default to undefined]
**business** | [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] [default to undefined]
**individual** | [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] [default to undefined]

## Example

```typescript
import { PutRippleIdentity } from '@ripple/payments-direct-client';

const instance: PutRippleIdentity = {
    internalId,
    business,
    individual,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
