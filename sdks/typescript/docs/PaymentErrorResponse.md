# PaymentErrorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**Array&lt;PaymentError&gt;**](PaymentError.md) | List of payment errors | [default to undefined]
**status** | **number** | Error Response Status | [default to undefined]

## Example

```typescript
import { PaymentErrorResponse } from '@ripple/payments-direct-client';

const instance: PaymentErrorResponse = {
    errors,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
