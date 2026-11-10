

# QuoteCollectionRequestV2DTO

Request to create a quote collection with `POST /v3/quotes/quote-collection`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteAmount** | **Double** | The amount for which you wish to receive a collection of quotes. |  |
|**quoteAmountType** | **QuoteAmountTypeDTO** |  |  |
|**sourceCurrency** | **String** | The currency code of the currency that you are sending. |  |
|**destinationCurrency** | **String** | The currency code of the currency in which your beneficiary will receive this payment. |  |
|**sourceCountry** | **String** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. |  [optional] |
|**destinationCountry** | **String** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their country of incorporation.  Required for a fiat payout; omitting it returns &#x60;USR_017&#x60;. Omit it for a stablecoin payout, or the request fails.  |  [optional] |
|**payinCategory** | **String** | The name of the pay in category indicating how this payment will be funded. |  |
|**paymentRail** | **String** | The payment rail to quote. Include it to request a quote for this payment rail only. If you omit it, the collection contains a quote for each payment rail available for the corridor. For valid values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference).  |  [optional] |



