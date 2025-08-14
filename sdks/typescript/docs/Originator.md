# Originator

Payment originator and source details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originatorIdentityId** | **string** | The unique ID associated with the payment originator\&#39;s identity record. | [optional] [default to undefined]
**originatorIdentityIdVersion** | **number** | The current version of the originator\&#39;s identity record. | [optional] [default to undefined]
**originatorIdentityNickName** | **string** | Nickname associated with the originator\&#39;s identity record. | [optional] [default to undefined]
**internalId** | **string** | An ID associated with this payment, if provided by the customer during payment initiation. | [optional] [default to undefined]
**sourceCountry** | **string** | The country where the payment originator is located or incorporated, specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. | [optional] [default to undefined]
**sourceCurrency** | **string** | originator\&#39;s currency | [optional] [default to undefined]
**sourceAmount** | **number** | The amount sent by the originator in this payment. This field can hold a value with up to 6 decimal places. | [optional] [default to undefined]
**payin** | **string** | Details about how this payment is funded. | [optional] [default to undefined]

## Example

```typescript
import { Originator } from '@ripple/payments-direct-client';

const instance: Originator = {
    originatorIdentityId,
    originatorIdentityIdVersion,
    originatorIdentityNickName,
    internalId,
    sourceCountry,
    sourceCurrency,
    sourceAmount,
    payin,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
