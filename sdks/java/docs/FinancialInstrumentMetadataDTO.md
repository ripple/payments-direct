

# FinancialInstrumentMetadataDTO

Metadata information for a financial instrument without the payment rail specific details. Used in list operations to provide summary information. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**financialInstrumentId** | **String** | The unique identifier of the financial instrument. |  |
|**financialInstrumentType** | **String** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  |  |
|**currency** | **String** | The 3-letter ISO currency code of the financial instrument. |  |
|**label** | **String** | A user-defined label for the financial instrument. |  [optional] |
|**country** | **String** | The 2-letter ISO 3166-1 alpha-2 country code of the financial instrument. For crypto wallet instruments (ETH_WALLET, XRPL_WALLET, TRON_WALLET, SOL_WALLET), this field returns &#x60;ZZ&#x60;, the ISO 3166-1 user-assigned code used when no country jurisdiction applies.  |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which the financial instrument was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | The time at which the financial instrument was last updated |  [optional] |



