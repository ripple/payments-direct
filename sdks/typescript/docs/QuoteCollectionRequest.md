# QuoteCollectionRequest

Request to create a quote collection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteAmount** | **number** | The amount for which you wish to receive a collection of quotes. | [default to undefined]
**quoteAmountType** | [**QuoteAmountType**](QuoteAmountType.md) |  | [default to undefined]
**sourceCurrency** | **string** | The currency code of the currency that you are sending. | [default to undefined]
**destinationCurrency** | **string** | The currency code of the currency in which your beneficiary will receive this payment. | [default to undefined]
**sourceCountry** | **string** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. | [optional] [default to undefined]
**destinationCountry** | **string** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. | [optional] [default to undefined]
**payoutCategory** | **string** | The name of the payout category. | [default to undefined]
**payinCategory** | **string** | The name of the pay in category indicating how this payment will be funded. | [default to undefined]
**destinationBlockchainNetwork** | **string** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] [default to undefined]

## Example

```typescript
import { QuoteCollectionRequest } from '@ripple/payments-direct-client';

const instance: QuoteCollectionRequest = {
    quoteAmount,
    quoteAmountType,
    sourceCurrency,
    destinationCurrency,
    sourceCountry,
    destinationCountry,
    payoutCategory,
    payinCategory,
    destinationBlockchainNetwork,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
