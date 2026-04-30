

# QuoteCollectionRequestV2DTO

Request to create a quote collection (v2).  **What's new in v3:** - `payoutCategory` and `destinationBlockchainNetwork` are no longer accepted in requests. - `paymentRail` is added as an optional field in the request to allow filtering quotes by a specific payment rail. When paymentRail is not passed, quotes will be returned for all supported payment rails. For a list of supported values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteAmount** | **Double** | The amount for which you wish to receive a collection of quotes. |  |
|**quoteAmountType** | **QuoteAmountTypeDTO** |  |  |
|**sourceCurrency** | **String** | The currency code of the currency that you are sending. |  |
|**destinationCurrency** | **String** | The currency code of the currency in which your beneficiary will receive this payment. |  |
|**sourceCountry** | **String** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. |  [optional] |
|**destinationCountry** | **String** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. |  [optional] |
|**payinCategory** | **String** | The name of the pay in category indicating how this payment will be funded. |  |
|**paymentRail** | **String** | The payment rail on which the beneficiary will receive this payment. This value may be used to filter quotes to a specific subset of supported payout rails. If not provided, quotes will be returned for all supported payout rails. For a list of supported values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference).  |  [optional] |



