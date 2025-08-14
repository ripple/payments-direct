

# GetBalances200ResponseBalancesInnerDTO

Customer available prefund balance for specific currency

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fundingType** | [**FundingTypeEnum**](#FundingTypeEnum) | The funding method associated with your account. |  |
|**currency** | **String** | Currency code. |  |
|**availableBalance** | **BigDecimal** | Available funded balance that you can use to initiate payments. |  |
|**reservedBalance** | **BigDecimal** | Amount reserved to complete in-progress transactions. You can&#39;t use this amount to initiate new payments. |  |



## Enum: FundingTypeEnum

| Name | Value |
|---- | -----|
| FUNDED | &quot;FUNDED&quot; |



