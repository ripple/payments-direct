# PaymentRequest

Information required to initiate a payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | **string** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. | [default to undefined]
**originatorIdentityId** | **string** | The identity ID of the payment originator in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] [default to undefined]
**beneficiaryIdentityId** | **string** | The identity ID of the payment beneficiary in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [default to undefined]
**internalId** | **string** | Customer defined value, such as an invoice number. | [optional] [default to undefined]
**purposeCode** | **string** | Indicates the purpose of the payment  For more information about the &#x60;purposeCode&#x60; options, see [purposeCode](../../building-payment-request-body/#purposecode).  | [optional] [default to undefined]
**sourceOfCash** | **string** | Source of cash for payout. | [optional] [default to undefined]
**paymentLabels** | **Array&lt;string&gt;** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] [default to undefined]

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
