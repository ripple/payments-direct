

# OriginatorV2DTO

Payment originator and source details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originatorIdentityId** | **String** | The unique ID associated with the payment originator&#39;s identity record. |  [optional] |
|**originatorIdentityIdVersion** | **Integer** | The current version of the originator&#39;s identity record. |  [optional] |
|**originatorIdentityNickName** | **String** | The originator&#39;s nickname at the identity version this payment references. Editing the nickname later does not change the value returned for this payment. |  [optional] |
|**internalId** | **String** | An ID associated with this payment, if provided by the customer during payment initiation. |  [optional] |
|**sourceCurrency** | **String** | originator&#39;s currency |  [optional] |
|**sourceAmount** | **Double** | The amount sent by the originator in this payment. This field can hold a value with up to 6 decimal places. |  [optional] |
|**payin** | **String** | Details about how this payment is funded. |  [optional] |



