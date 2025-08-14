

# QuoteCollectionRequestDTO

Request to create a quote collection

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteAmount** | **Double** | The amount for which you wish to receive a collection of quotes. |  |
|**quoteAmountType** | **QuoteAmountTypeDTO** |  |  |
|**sourceCurrency** | **String** | The currency code of the currency that you are sending. |  |
|**destinationCurrency** | **String** | The currency code of the currency in which your beneficiary will receive this payment. |  |
|**sourceCountry** | **String** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. |  [optional] |
|**destinationCountry** | **String** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. |  [optional] |
|**payoutCategory** | **String** | The name of the payout category. |  |
|**payinCategory** | **String** | The name of the pay in category indicating how this payment will be funded. |  |
|**destinationBlockchainNetwork** | **String** | The name of the blockchain network on which the beneficiary will receive this payment. |  [optional] |



