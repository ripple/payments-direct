# ModelError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | Unique identifier of an error | [default to undefined]
**title** | **string** | Error message providing a brief summary of the error | [default to undefined]
**type** | **string** | Identifies the problem type | [default to undefined]
**description** | **string** | Provides more technical information | [default to undefined]
**timestamp** | **string** | The time when this error occurred, specified in UTC. | [default to undefined]

## Example

```typescript
import { ModelError } from '@ripple/payments-direct-client';

const instance: ModelError = {
    code,
    title,
    type,
    description,
    timestamp,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
