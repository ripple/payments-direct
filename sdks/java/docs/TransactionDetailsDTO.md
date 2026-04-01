

# TransactionDetailsDTO

A summary of the payment category.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentProduct** | **String** | The Ripple payments product used to make this payment. |  [optional] |
|**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) | Specifies the type of payment you&#39;re making as categorized by the identity type of the payment originator and beneficiary. |  [optional] |
|**thirdPartyPayment** | **Boolean** | Flag to indicate if this payment is initiated on behalf of a third-party originator. |  [optional] |
|**businessUseCase** | [**BusinessUseCaseEnum**](#BusinessUseCaseEnum) | Indicates the type of payment you&#39;re making. |  [optional] |



## Enum: FlowTypeEnum

| Name | Value |
|---- | -----|
| B2_B | &quot;B2B&quot; |
| B2_C | &quot;B2C&quot; |
| C2_B | &quot;C2B&quot; |
| C2_C | &quot;C2C&quot; |



## Enum: BusinessUseCaseEnum

| Name | Value |
|---- | -----|
| ON_RAMP | &quot;ON_RAMP&quot; |
| OFF_RAMP | &quot;OFF_RAMP&quot; |
| FIAT_TRANSFER | &quot;FIAT_TRANSFER&quot; |
| CRYPTO_TRANSFER | &quot;CRYPTO_TRANSFER&quot; |



