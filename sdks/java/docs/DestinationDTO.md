

# DestinationDTO

Payment beneficiary and destination details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationAmount** | **Double** | The amount received by the payment beneficiary. This field can hold a value with up to 6 decimal places. |  [optional] |
|**destinationCountry** | **String** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. |  [optional] |
|**destinationCurrency** | **String** | The currency code of the currency in which the beneficiary will receive this payment. |  [optional] |
|**destinationBlockchainNetwork** | **String** | The name of the blockchain network on which the beneficiary will receive this payment. |  [optional] |
|**beneficiaryIdentityId** | **UUID** | The unique ID associated with the payment beneficiary&#39;s identity record. |  [optional] |
|**beneficiaryIdentityVersion** | **Integer** | The current version of the beneficiary&#39;s identity record. |  [optional] |
|**beneficiaryIdentityNickName** | **String** | Nickname associated with the beneficiary&#39;s identity record. |  [optional] |
|**payout** | **String** | The payout category for this payment. |  [optional] |



