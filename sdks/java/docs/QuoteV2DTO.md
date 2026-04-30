

# QuoteV2DTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteId** | **UUID** | Unique ID that represents this quote. |  |
|**quoteStatus** | **QuoteStatusDTO** |  |  |
|**quoteAmountType** | **QuoteAmountTypeDTO** |  |  [optional] |
|**sourceAmount** | **Double** | Amount to be sent by the originator. |  [optional] |
|**destinationAmount** | **Double** | Amount to be received by destination |  [optional] |
|**sourceCurrency** | **String** | The currency code of the currency that you are sending. |  |
|**destinationCurrency** | **String** | The currency code of the currency in which your beneficiary will receive this payment. |  |
|**sourceCountry** | **String** | The country where the payment originator is located or incorporated, specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. |  [optional] |
|**destinationCountry** | **String** | The country code to which you wish to send the funds. It follows ISO 3166-1 alpha-2 code |  [optional] |
|**payinCategory** | **String** | The name of payin category specified in the quote request. |  |
|**adjustedExchangeRate** | [**AdjustedExchangeRateDTO**](AdjustedExchangeRateDTO.md) |  |  [optional] |
|**fees** | [**List&lt;FeeSummaryV2DTO&gt;**](FeeSummaryV2DTO.md) | A summary of fees included in this quote. |  [optional] |
|**taxes** | [**List&lt;TaxSummaryDTO&gt;**](TaxSummaryDTO.md) | A summary of taxes included in this quote. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time when this quote was created, specified in UTC. |  [optional] |
|**expiresAt** | **OffsetDateTime** | The time when this quote expires, specified in UTC. |  [optional] |
|**paymentRail** | **String** | The payment rail used for this quote. |  [optional] |



