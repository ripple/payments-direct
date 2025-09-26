# Payment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentId** | **string** | The unique ID that identifies this payment. This value is the same as the quote ID. | [default to undefined]
**cryptoTransactionHash** | **string** | Transaction hash of the crypto payment on the destination blockchain network | [optional] [default to undefined]
**initiatedAt** | **string** | The time at which the payment was initiated, specified in UTC. | [optional] [default to undefined]
**expiresAt** | **string** | The time at which this payment expires, specified in UTC. | [optional] [default to undefined]
**lastStateUpdatedAt** | **string** | The time at which the payment state was last updated for this payment, specified in UTC. | [optional] [default to undefined]
**paymentState** | [**PaymentState**](PaymentState.md) |  | [default to undefined]
**originator** | [**Originator**](Originator.md) |  | [optional] [default to undefined]
**destination** | [**Destination**](Destination.md) |  | [optional] [default to undefined]
**adjustedExchangeRate** | [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] [default to undefined]
**fees** | [**Array&lt;FeeSummary&gt;**](FeeSummary.md) | A summary of fees included in payment quote. | [optional] [default to undefined]
**sourceOfCash** | **string** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] [default to undefined]
**purposeCode** | **string** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] [default to undefined]
**transactionDetails** | [**TransactionDetails**](TransactionDetails.md) |  | [optional] [default to undefined]
**paymentLabels** | **Array&lt;string&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] [default to undefined]

## Example

```typescript
import { Payment } from '@ripple/payments-direct-client';

const instance: Payment = {
    paymentId,
    cryptoTransactionHash,
    initiatedAt,
    expiresAt,
    lastStateUpdatedAt,
    paymentState,
    originator,
    destination,
    adjustedExchangeRate,
    fees,
    sourceOfCash,
    purposeCode,
    transactionDetails,
    paymentLabels,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
