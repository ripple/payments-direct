# UpdatePaymentLabelsResponse

Response body for modifying payment labels

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | **Array&lt;string&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [default to undefined]

## Example

```typescript
import { UpdatePaymentLabelsResponse } from '@ripple/payments-direct-client';

const instance: UpdatePaymentLabelsResponse = {
    labels,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
