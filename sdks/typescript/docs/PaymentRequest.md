# PaymentRequest

Information required to initiate a payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | **string** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. | [default to undefined]
**originatorIdentityId** | **string** | The identity ID of the payment originator in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] [default to undefined]
**beneficiaryIdentityId** | **string** | The identity ID of the payment beneficiary in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [default to undefined]
**internalId** | **string** | Customer defined value, such as an invoice number. | [optional] [default to undefined]
**purposeCode** | **string** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] [default to undefined]
**sourceOfCash** | **string** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] [default to undefined]
**paymentLabels** | **Array&lt;string&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] [default to undefined]

## Example

```typescript
import { PaymentRequest } from '@ripple/payments-direct-client';

const instance: PaymentRequest = {
    quoteId,
    originatorIdentityId,
    beneficiaryIdentityId,
    internalId,
    purposeCode,
    sourceOfCash,
    paymentLabels,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
