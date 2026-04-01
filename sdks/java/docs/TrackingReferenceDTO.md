

# TrackingReferenceDTO

A tracking reference provided by the payout partner for this transaction. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceType** | **String** | The type or category of this tracking reference. Known values include IMAD and OMAD for Fedwire transfers, but additional types may be provided depending on the payment rail and payout partner.  |  [optional] |
|**value** | **String** | The tracking reference value. Use this to locate the transaction with the payout partner or payment rail operator. Format varies by referenceType. |  [optional] |
|**displayName** | **String** | A human-readable name for this tracking reference, suitable for display in user interfaces. |  [optional] |
|**description** | **String** | A detailed description of what this tracking reference represents and how it can be used. |  [optional] |



