

# StateTransitionV2DTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedFrom** | **String** | Current state of a payment. The payment lifecycle currently uses the following values: - &#x60;QUOTED&#x60; - &#x60;INITIATED&#x60; - &#x60;VALIDATING&#x60; - &#x60;TRANSFERRING&#x60; - &#x60;COMPLETED&#x60; - &#x60;FAILED&#x60; - &#x60;RETURNED&#x60; - &#x60;DECLINED&#x60; - &#x60;AWAITING_FUNDING&#x60; Additional states may be introduced in the future without breaking existing integrations.  |  |
|**updatedTo** | **String** | Current state of a payment. The payment lifecycle currently uses the following values: - &#x60;QUOTED&#x60; - &#x60;INITIATED&#x60; - &#x60;VALIDATING&#x60; - &#x60;TRANSFERRING&#x60; - &#x60;COMPLETED&#x60; - &#x60;FAILED&#x60; - &#x60;RETURNED&#x60; - &#x60;DECLINED&#x60; - &#x60;AWAITING_FUNDING&#x60; Additional states may be introduced in the future without breaking existing integrations.  |  |
|**updatedAt** | **OffsetDateTime** | The timestamp when the payment state was updated. |  |



