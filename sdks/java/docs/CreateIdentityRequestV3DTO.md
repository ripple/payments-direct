

# CreateIdentityRequestV3DTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nickName** | **String** | The nickname for the identity |  [optional] |
|**validatePayoutRails** | **List&lt;String&gt;** | The payout rails to validate the identity against |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags are used to categorize the identity.  |  [optional] |
|**identityType** | **String** | The type of the identity |  |
|**paymentRole** | **String** | The payment role of the identity |  |
|**internalId** | **String** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  |  [optional] |
|**business** | [**BusinessIdentityDTO**](BusinessIdentityDTO.md) |  |  [optional] |
|**individual** | [**IndividualIdentityDTO**](IndividualIdentityDTO.md) |  |  [optional] |



