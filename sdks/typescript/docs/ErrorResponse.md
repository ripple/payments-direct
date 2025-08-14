# ErrorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **number** | The HTTP status code of the error | [default to undefined]
**errors** | [**Array&lt;ModelError&gt;**](ModelError.md) |  | [default to undefined]
**timestamp** | **string** | The timestamp of the error | [optional] [default to undefined]

## Example

```typescript
import { ErrorResponse } from '@ripple/payments-direct-client';

const instance: ErrorResponse = {
    status,
    errors,
    timestamp,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
