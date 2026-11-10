# QuoteCollectionRequestV2

Request to create a quote collection with `POST /v3/quotes/quote-collection`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteAmount** | **number** | The amount for which you wish to receive a collection of quotes. | [default to undefined]
**quoteAmountType** | [**QuoteAmountType**](QuoteAmountType.md) |  | [default to undefined]
**sourceCurrency** | **string** | The currency code of the currency that you are sending. | [default to undefined]
**destinationCurrency** | **string** | The currency code of the currency in which your beneficiary will receive this payment. | [default to undefined]
**sourceCountry** | **string** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. | [optional] [default to undefined]
**destinationCountry** | **string** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their country of incorporation.  Required for a fiat payout; omitting it returns &#x60;USR_017&#x60;. Omit it for a stablecoin payout, or the request fails.  | [optional] [default to undefined]
**payinCategory** | **string** | The name of the pay in category indicating how this payment will be funded. | [default to undefined]
**paymentRail** | **string** | The payment rail to quote. Include it to request a quote for this payment rail only. If you omit it, the collection contains a quote for each payment rail available for the corridor. For valid values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference).  | [optional] [default to undefined]

## Example

```typescript
import { QuoteCollectionRequestV2 } from '@ripple/payments-direct-client';

const instance: QuoteCollectionRequestV2 = {
    quoteAmount,
    quoteAmountType,
    sourceCurrency,
    destinationCurrency,
    sourceCountry,
    destinationCountry,
    payinCategory,
    paymentRail,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
