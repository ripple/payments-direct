# PaymentError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | A unique identifier for  the error | [default to undefined]
**type** | **string** | A high-level categorization of the error, indicating the type of issue that occurred | [default to undefined]
**title** | **string** | A brief, user-friendly description of the error | [default to undefined]
**description** | **string** | A more detailed explanation of the error, potentially including information about what caused the error and the next steps | [default to undefined]
**timestamp** | **string** |  | [default to undefined]

## Example

```typescript
import { PaymentError } from '@ripple/payments-direct-client';

const instance: PaymentError = {
    code,
    type,
    title,
    description,
    timestamp,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
