# Quote


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | **string** | Unique ID that represents this quote. | [default to undefined]
**quoteStatus** | [**QuoteStatus**](QuoteStatus.md) |  | [default to undefined]
**quoteAmountType** | [**QuoteAmountType**](QuoteAmountType.md) |  | [optional] [default to undefined]
**sourceAmount** | **number** | Amount to be sent by the originator. | [optional] [default to undefined]
**destinationAmount** | **number** | Amount to be received by destination | [optional] [default to undefined]
**sourceCurrency** | **string** | The currency code of the currency that you are sending. | [default to undefined]
**destinationCurrency** | **string** | The currency code of the currency in which your beneficiary will receive this payment. | [default to undefined]
**sourceCountry** | **string** | The country where the payment originator is located or incorporated, specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. | [optional] [default to undefined]
**destinationCountry** | **string** | The country code to which you wish to send the funds. It follows ISO 3166-1 alpha-2 code | [optional] [default to undefined]
**payoutCategory** | **string** | Name of the payout category specified in the quote request. | [default to undefined]
**payinCategory** | **string** | The name of payin category specified in the quote request. | [default to undefined]
**adjustedExchangeRate** | [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] [default to undefined]
**fees** | [**Array&lt;FeeSummary&gt;**](FeeSummary.md) | A summary of fees included in this quote. | [optional] [default to undefined]
**createdAt** | **string** | The time when this quote was created, specified in UTC. | [optional] [default to undefined]
**expiresAt** | **string** | The time when this quote expires, specified in UTC. | [optional] [default to undefined]
**destinationBlockchainNetwork** | **string** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] [default to undefined]

## Example

```typescript
import { Quote } from '@ripple/payments-direct-client';

const instance: Quote = {
    quoteId,
    quoteStatus,
    quoteAmountType,
    sourceAmount,
    destinationAmount,
    sourceCurrency,
    destinationCurrency,
    sourceCountry,
    destinationCountry,
    payoutCategory,
    payinCategory,
    adjustedExchangeRate,
    fees,
    createdAt,
    expiresAt,
    destinationBlockchainNetwork,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
