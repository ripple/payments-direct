

# OriginatorDTO

Payment originator and source details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originatorIdentityId** | **UUID** | The unique ID associated with the payment originator&#39;s identity record. |  [optional] |
|**originatorIdentityIdVersion** | **Integer** | The current version of the originator&#39;s identity record. |  [optional] |
|**originatorIdentityNickName** | **String** | Nickname associated with the originator&#39;s identity record. |  [optional] |
|**internalId** | **String** | An ID associated with this payment, if provided by the customer during payment initiation. |  [optional] |
|**sourceCountry** | **String** | The country where the payment originator is located or incorporated, specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. |  [optional] |
|**sourceCurrency** | **String** | originator&#39;s currency |  [optional] |
|**sourceAmount** | **Double** | The amount sent by the originator in this payment. This field can hold a value with up to 6 decimal places. |  [optional] |
|**payin** | **String** | Details about how this payment is funded. |  [optional] |



