

# SolWalletDTO

Rails: CRYPTO  Rail Definitions:  CRYPTO:   - Availability: 24/7/365   - Limit: None   - Settlement: Blockchain dependent   - Cut-off time: None   - Banking holidays: Not applicable  Routing Policy: Not applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletAddress** | **String** | Receiving wallet address at the exchange |  |
|**cryptoInstitutionName** | **String** | Name of the crypto exchange |  |
|**network** | **String** | The default name of the blockchain network for this instrument |  [optional] [readonly] |
|**supportedCorridors** | [**List&lt;SupportedCorridorsEnum&gt;**](#List&lt;SupportedCorridorsEnum&gt;) | The list of supported corridors for the payout method |  [optional] [readonly] |



## Enum: List&lt;SupportedCorridorsEnum&gt;

| Name | Value |
|---- | -----|
| SOLANA_USDC | &quot;SOLANA_USDC&quot; |



