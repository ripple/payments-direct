# CreateIdentityRequestV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**piiData** | **{ [key: string]: any; }** | PII data in JSON format.  You must use the correct &#x60;piiData&#x60; schema for the type of identity you want to create.  **Note**: Reach out to your Ripple liaison to get this schema.  | [default to undefined]
**identityType** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | [default to undefined]
**nickName** | **string** | The nickname for the identity provided at the time of identity creation | [optional] [default to undefined]
**useCaseType** | [**UseCaseType**](UseCaseType.md) |  | [default to undefined]

## Example

```typescript
import { CreateIdentityRequestV2 } from '@ripple/payments-direct-client';

const instance: CreateIdentityRequestV2 = {
    piiData,
    identityType,
    nickName,
    useCaseType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
