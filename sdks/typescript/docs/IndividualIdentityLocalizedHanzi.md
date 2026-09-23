# IndividualIdentityLocalizedHanzi

Localized identity fields in Chinese Hanzi characters (汉字).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **string** | Individual given name in Chinese Hanzi characters. | [optional] [default to undefined]
**lastName** | **string** | Individual family name in Chinese Hanzi characters. | [optional] [default to undefined]
**businessName** | **string** | Business name associated with the individual in Chinese Hanzi characters, for trade payments.  | [optional] [default to undefined]

## Example

```typescript
import { IndividualIdentityLocalizedHanzi } from '@ripple/payments-direct-client';

const instance: IndividualIdentityLocalizedHanzi = {
    firstName,
    lastName,
    businessName,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
