# IndividualIdentityIdentityDocumentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNumber** | **string** | Identification Number. | [default to undefined]
**idType** | **string** | The type of identification document used to identify the identity. Accepted values may vary by corridor and payment role. Some corridors accept only a subset of this list. See Ripple Docs for corridor-specific requirements. | [default to undefined]
**expiryDate** | **string** | Expiration date of the identification document. | [optional] [default to undefined]

## Example

```typescript
import { IndividualIdentityIdentityDocumentsInner } from '@ripple/payments-direct-client';

const instance: IndividualIdentityIdentityDocumentsInner = {
    idNumber,
    idType,
    expiryDate,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
