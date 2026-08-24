# CreateIdentityRequestV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nickName** | **string** | The nickname for the identity | [optional] [default to undefined]
**validatePayoutRails** | **Array&lt;string&gt;** | The payout rails to validate the identity against | [optional] [default to undefined]
**tags** | **Array&lt;string&gt;** | Tags are used to categorize the identity.  | [optional] [default to undefined]
**identityType** | **string** | The type of the identity | [default to undefined]
**paymentRole** | **string** | The payment role of the identity | [default to undefined]
**internalId** | **string** | Client-provided unique identifier for idempotency and deduplication. Required for ORIGINATOR identities; optional for BENEFICIARY identities. Must be unique across all active identities in your organization. Duplicate values will result in a 409 Conflict error.  This is your own reference key, not the originator\&#39;s account number. Use &#x60;originatorAccountNumber&#x60; for that.  | [optional] [default to undefined]
**originatorAccountNumber** | **string** | The originator\&#39;s account number, or your customer identifier for the originator. Required for ORIGINATOR identities on USD payments to China (&#x60;CN_CFXPS&#x60;); optional elsewhere.  Must be unique across all active identities in your organization, including BENEFICIARY identities. Duplicate values return a 409 Conflict error.  Corridor length and character limits apply to this value but are not enforced on this field. See the corridor\&#39;s Integration resources page.  | [optional] [default to undefined]
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
    originatorAccountNumber,
    business,
    individual,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
