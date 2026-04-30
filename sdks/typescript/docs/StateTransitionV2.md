# StateTransitionV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updatedFrom** | **string** | Current state of a payment. The payment lifecycle currently uses the following values: - &#x60;QUOTED&#x60; - &#x60;INITIATED&#x60; - &#x60;VALIDATING&#x60; - &#x60;TRANSFERRING&#x60; - &#x60;COMPLETED&#x60; - &#x60;FAILED&#x60; - &#x60;RETURNED&#x60; - &#x60;DECLINED&#x60; - &#x60;AWAITING_FUNDING&#x60; Additional states may be introduced in the future without breaking existing integrations.  | [default to undefined]
**updatedTo** | **string** | Current state of a payment. The payment lifecycle currently uses the following values: - &#x60;QUOTED&#x60; - &#x60;INITIATED&#x60; - &#x60;VALIDATING&#x60; - &#x60;TRANSFERRING&#x60; - &#x60;COMPLETED&#x60; - &#x60;FAILED&#x60; - &#x60;RETURNED&#x60; - &#x60;DECLINED&#x60; - &#x60;AWAITING_FUNDING&#x60; Additional states may be introduced in the future without breaking existing integrations.  | [default to undefined]
**updatedAt** | **string** | The timestamp when the payment state was updated. | [default to undefined]

## Example

```typescript
import { StateTransitionV2 } from '@ripple/payments-direct-client';

const instance: StateTransitionV2 = {
    updatedFrom,
    updatedTo,
    updatedAt,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
