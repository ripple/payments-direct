# PaymentWithDetails


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
**sourceOfCash** | **string** | Indicates the source of funds | [optional] [default to undefined]
**purposeCode** | **string** | purposeCode for RPD payments | [optional] [default to undefined]
**transactionDetails** | [**TransactionDetails**](TransactionDetails.md) |  | [optional] [default to undefined]
**errors** | [**Array&lt;PaymentError&gt;**](PaymentError.md) |  | [optional] [default to undefined]
**paymentLabels** | **Array&lt;string&gt;** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] [default to undefined]

## Example

```typescript
import { PaymentWithDetails } from '@ripple/payments-direct-client';

const instance: PaymentWithDetails = {
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
    errors,
    paymentLabels,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
