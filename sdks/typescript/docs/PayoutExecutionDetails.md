# PayoutExecutionDetails

Metadata about the payout execution, including the payment rail used, timing, and tracking references.  `payoutExecutionDetails` is an optional field that should be treated as informational only. Do not build required workflows that depend on its presence, as availability varies by corridor and partner.  When present, `trackingReferences` provides network-specific identifiers useful for audit, reconciliation, or customer inquiry resolution. Use the `referenceType` field on each tracking reference to identify what a value represents rather than relying on its position in the array.  Coverage will expand as additional corridors and partners are onboarded. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentRailUsed** | **string** | The payment rail or network used to execute the payout (e.g., FEDWIRE, ACH, RTP, SEPA).  | [optional] [default to undefined]
**payoutStartTime** | **string** | The time at which the payout execution started, specified in UTC.  | [optional] [default to undefined]
**payoutEndTime** | **string** | The timestamp when the payout execution completed or was last updated, as reported by the payout partner. Specified in UTC using ISO 8601 format. For in-progress payouts, this may represent the last status update time.  | [optional] [default to undefined]
**trackingReferences** | [**Array&lt;TrackingReference&gt;**](TrackingReference.md) | A list of tracking references for this transaction, such as transaction IDs and confirmation numbers.  | [optional] [default to undefined]

## Example

```typescript
import { PayoutExecutionDetails } from '@ripple/payments-direct-client';

const instance: PayoutExecutionDetails = {
    paymentRailUsed,
    payoutStartTime,
    payoutEndTime,
    trackingReferences,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
