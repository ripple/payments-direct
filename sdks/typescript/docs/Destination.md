# Destination

Payment beneficiary and destination details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationAmount** | **number** | The amount received by the payment beneficiary. This field can hold a value with up to 6 decimal places. | [optional] [default to undefined]
**destinationCountry** | **string** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. | [optional] [default to undefined]
**destinationCurrency** | **string** | The currency code of the currency in which the beneficiary will receive this payment. | [optional] [default to undefined]
**destinationBlockchainNetwork** | **string** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] [default to undefined]
**beneficiaryIdentityId** | **string** | The unique ID associated with the payment beneficiary\&#39;s identity record. | [optional] [default to undefined]
**beneficiaryIdentityVersion** | **number** | The current version of the beneficiary\&#39;s identity record. | [optional] [default to undefined]
**beneficiaryIdentityNickName** | **string** | Nickname associated with the beneficiary\&#39;s identity record. | [optional] [default to undefined]
**payout** | **string** | The payout category for this payment. | [optional] [default to undefined]

## Example

```typescript
import { Destination } from '@ripple/payments-direct-client';

const instance: Destination = {
    destinationAmount,
    destinationCountry,
    destinationCurrency,
    destinationBlockchainNetwork,
    beneficiaryIdentityId,
    beneficiaryIdentityVersion,
    beneficiaryIdentityNickName,
    payout,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
