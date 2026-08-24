

# GetBalances200ResponseBalancesInnerDTO

Customer available prefund balance for specific currency

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fundingType** | [**FundingTypeEnum**](#FundingTypeEnum) | The funding method associated with your account. |  |
|**currency** | **String** | Currency code. |  |
|**availableBalance** | **String** | Available funded balance that you can use to initiate payments, represented as a decimal string. |  |
|**reservedBalance** | **String** | Amount reserved to complete in-progress transactions. You can&#39;t use this amount to initiate new payments, represented as a decimal string. |  |



## Enum: FundingTypeEnum

| Name | Value |
|---- | -----|
| FUNDED | &quot;FUNDED&quot; |



