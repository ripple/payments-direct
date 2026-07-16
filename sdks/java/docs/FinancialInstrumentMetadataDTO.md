

# FinancialInstrumentMetadataDTO

Metadata information for a financial instrument without the payment rail specific details. Used in list operations to provide summary information. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**financialInstrumentId** | **String** | The unique identifier of the financial instrument. |  |
|**financialInstrumentType** | **String** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  |  |
|**currency** | **String** | The 3-letter ISO currency code of the financial instrument. |  |
|**label** | **String** | A user-defined label for the financial instrument. |  [optional] |
|**country** | **String** | The 2-letter ISO 3166-1 alpha-2 country code of the financial instrument. This field is omitted when no country jurisdiction applies (for example, crypto wallet instruments such as ETH_WALLET, TRON_WALLET, and SOL_WALLET). An absent &#x60;country&#x60; should be interpreted as \&quot;no applicable jurisdiction\&quot;.  |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which the financial instrument was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | The time at which the financial instrument was last updated |  [optional] |



