# GetBalances401Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **number** | The HTTP status code representing the error response | [default to undefined]
**errors** | [**Array&lt;GetBalances400ResponseErrorsInner&gt;**](GetBalances400ResponseErrorsInner.md) | An array containing details about the errors encountered | [default to undefined]

## Example

```typescript
import { GetBalances401Response } from '@ripple/payments-direct-client';

const instance: GetBalances401Response = {
    status,
    errors,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
