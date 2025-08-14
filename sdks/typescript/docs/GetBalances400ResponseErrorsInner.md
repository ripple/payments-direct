# GetBalances400ResponseErrorsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | A unique error code that identifies the specific error | [default to undefined]
**type** | **string** | A high-level categorization of the error, indicating the type of issue that occurred | [default to undefined]
**title** | **string** | A brief, user-friendly description of the error | [default to undefined]
**description** | **string** | A more detailed explanation of the error, including potential causes and next steps | [default to undefined]
**timestamp** | **string** | The timestamp of the error occurrence | [default to undefined]

## Example

```typescript
import { GetBalances400ResponseErrorsInner } from '@ripple/payments-direct-client';

const instance: GetBalances400ResponseErrorsInner = {
    code,
    type,
    title,
    description,
    timestamp,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
