# PaymentRequestV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | **string** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. | [default to undefined]
**originatorIdentityId** | **string** | The identity ID of the payment originator. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] [default to undefined]
**beneficiaryIdentityId** | **string** | The identity ID of the payment beneficiary. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [default to undefined]
**internalId** | **string** | Customer defined value, such as an invoice number. | [optional] [default to undefined]
**purposeCode** | **string** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] [default to undefined]
**sourceOfCash** | **string** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] [default to undefined]
**paymentLabels** | **Array&lt;string&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] [default to undefined]
**beneficiaryFinancialInstrumentId** | **string** | The financial instrument ID associated with a payment beneficiary’s identity. This value must reference a financial instrument created for the same beneficiary identity using Identity Management v3. Use the &#x60;financialInstrumentId&#x60; returned when you create or fetch the beneficiary’s payout instrument.  | [default to undefined]
**receiverRelationship** | **string** | The relationship to the debtor. | [optional] [default to undefined]
**paymentMemo** | **string** | Optional, transaction-specific memo carried with the payment for beneficiary reconciliation. Must be UPPERCASE and may include only letters (A-Z), digits (0-9), spaces, and the following punctuation characters: comma (,), period (.), parentheses (()), forward slash (/), and hyphen (-). Not stored in PII; persisted on the payment object and forwarded to compliance and payout partners. Where possible, the memo will also be delivered to the final beneficiary\&#39;s credit record, but delivery cannot be guaranteed in all cases due to payout partner or downstream constraints. If omitted, Ripple may generate a memo automatically.  | [optional] [default to undefined]

## Example

```typescript
import { PaymentRequestV2 } from '@ripple/payments-direct-client';

const instance: PaymentRequestV2 = {
    quoteId,
    originatorIdentityId,
    beneficiaryIdentityId,
    internalId,
    purposeCode,
    sourceOfCash,
    paymentLabels,
    beneficiaryFinancialInstrumentId,
    receiverRelationship,
    paymentMemo,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
