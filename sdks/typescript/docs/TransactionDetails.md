# TransactionDetails

A summary of the payment category.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentProduct** | **string** | The Ripple payments product used to make this payment. | [optional] [default to undefined]
**flowType** | **string** | Specifies the type of payment you\&#39;re making as categorized by the identity type of the payment originator and beneficiary. | [optional] [default to undefined]
**thirdPartyPayment** | **boolean** | Flag to indicate if this payment is initiated on behalf of a third-party originator. | [optional] [default to undefined]
**businessUseCase** | **string** | Indicates the type of payment you\&#39;re making. | [optional] [default to undefined]

## Example

```typescript
import { TransactionDetails } from '@ripple/payments-direct-client';

const instance: TransactionDetails = {
    paymentProduct,
    flowType,
    thirdPartyPayment,
    businessUseCase,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
