# UpdatePaymentLabelsResponse

Response body for modifying payment labels

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | **Array&lt;string&gt;** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [default to undefined]

## Example

```typescript
import { UpdatePaymentLabelsResponse } from '@ripple/payments-direct-client';

const instance: UpdatePaymentLabelsResponse = {
    labels,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
