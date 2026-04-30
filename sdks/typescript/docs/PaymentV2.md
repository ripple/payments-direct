# PaymentV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentId** | **string** | The unique ID that identifies this payment. This value is the same as the quote ID. | [default to undefined]
**cryptoTransactionHash** | **string** | Transaction hash of the crypto payment on the destination blockchain network | [optional] [default to undefined]
**initiatedAt** | **string** | The time at which the payment was initiated, specified in UTC. | [optional] [default to undefined]
**expiresAt** | **string** | The time at which this payment expires, specified in UTC. | [optional] [default to undefined]
**jitFundingExpiresAt** | **string** | The time at which JIT funding for this payment expires, specified in UTC. | [optional] [default to undefined]
**lastStateUpdatedAt** | **string** | The time at which the payment state was last updated for this payment, specified in UTC. | [optional] [default to undefined]
**paymentState** | **string** | Current state of a payment.  The payment lifecycle currently uses the following values:  - &#x60;QUOTED&#x60;  - &#x60;INITIATED&#x60;  - &#x60;VALIDATING&#x60;  - &#x60;TRANSFERRING&#x60;  - &#x60;COMPLETED&#x60;  - &#x60;FAILED&#x60;  - &#x60;RETURNED&#x60;  - &#x60;DECLINED&#x60;  - &#x60;AWAITING_FUNDING&#x60;  Additional states may be introduced in the future without breaking existing integrations.  | [default to undefined]
**originator** | [**OriginatorV2**](OriginatorV2.md) |  | [optional] [default to undefined]
**destination** | [**DestinationV2**](DestinationV2.md) |  | [optional] [default to undefined]
**adjustedExchangeRate** | [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] [default to undefined]
**fees** | [**Array&lt;FeeSummary&gt;**](FeeSummary.md) | A summary of fees included in the payment quote. | [optional] [default to undefined]
**taxes** | [**Array&lt;TaxSummary&gt;**](TaxSummary.md) | A summary of taxes included in the payment quote. | [optional] [default to undefined]
**sourceOfCash** | **string** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] [default to undefined]
**purposeCode** | **string** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] [default to undefined]
**transactionDetails** | [**TransactionDetailsV2**](TransactionDetailsV2.md) |  | [optional] [default to undefined]
**paymentLabels** | **Array&lt;string&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment\&#39;s lifetime. | [optional] [default to undefined]
**receiverRelationship** | **string** | The relationship to the debtor. | [optional] [default to undefined]
**paymentMemo** | **string** | Optional, transaction-specific memo carried with the payment for beneficiary reconciliation. Validation rules (required, allowed characters, max length) vary by corridor. Consult the data requirements for your corridor. Not stored in PII; persisted on the payment object and forwarded to compliance and payout partners. Where possible, the memo will also be delivered to the final beneficiary\&#39;s credit record, but delivery cannot be guaranteed in all cases due to payout partner or downstream constraints. If omitted, Ripple may generate a memo automatically.  | [optional] [default to undefined]

## Example

```typescript
import { PaymentV2 } from '@ripple/payments-direct-client';

const instance: PaymentV2 = {
    paymentId,
    cryptoTransactionHash,
    initiatedAt,
    expiresAt,
    jitFundingExpiresAt,
    lastStateUpdatedAt,
    paymentState,
    originator,
    destination,
    adjustedExchangeRate,
    fees,
    taxes,
    sourceOfCash,
    purposeCode,
    transactionDetails,
    paymentLabels,
    receiverRelationship,
    paymentMemo,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
