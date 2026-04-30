# UpdatePaymentLabelsRequest

Request body containing the list of labels you want to add to or remove from the payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labelsToAdd** | **Array&lt;string&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] [default to undefined]
**labelsToRemove** | **Array&lt;string&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] [default to undefined]

## Example

```typescript
import { UpdatePaymentLabelsRequest } from '@ripple/payments-direct-client';

const instance: UpdatePaymentLabelsRequest = {
    labelsToAdd,
    labelsToRemove,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
