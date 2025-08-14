# UpdatePaymentLabelsRequest

Request body containing the list of labels you want to add to or remove from the payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labelsToAdd** | **Array&lt;string&gt;** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] [default to undefined]
**labelsToRemove** | **Array&lt;string&gt;** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] [default to undefined]

## Example

```typescript
import { UpdatePaymentLabelsRequest } from '@ripple/payments-direct-client';

const instance: UpdatePaymentLabelsRequest = {
    labelsToAdd,
    labelsToRemove,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
