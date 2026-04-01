# StateTransition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updatedFrom** | [**PaymentState**](PaymentState.md) |  | [default to undefined]
**updatedTo** | [**PaymentState**](PaymentState.md) |  | [default to undefined]
**updatedAt** | **string** | The timestamp when the payment state was updated. | [default to undefined]

## Example

```typescript
import { StateTransition } from '@ripple/payments-direct-client';

const instance: StateTransition = {
    updatedFrom,
    updatedTo,
    updatedAt,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
