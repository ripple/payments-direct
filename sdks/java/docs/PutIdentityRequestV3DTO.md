

# PutIdentityRequestV3DTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nickName** | **String** | The new nickname for the identity |  [optional] |
|**validatePayoutRails** | **List&lt;String&gt;** | The payment rails to validate the identity against |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags are used to categorize the identity.  |  [optional] |
|**internalId** | **String** | Client-provided unique identifier for idempotency and deduplication. Required for ORIGINATOR identities; optional for BENEFICIARY identities. Must be unique across all active identities in your organization. Duplicate values will result in a 409 Conflict error.  This is your own reference key, not the originator&#39;s account number. Use &#x60;originatorAccountNumber&#x60; for that.  |  [optional] |
|**originatorAccountNumber** | **String** | The originator&#39;s account number, or your customer identifier for the originator. Required for ORIGINATOR identities on USD payments to China (&#x60;CN_CFXPS&#x60;); optional elsewhere. Only sent to payout partners for ORIGINATOR identities.  Must be unique across all active identities in your organization, including BENEFICIARY identities. Duplicate values return a 409 Conflict error.  Corridor length and character limits apply to this value but are not enforced on this field. See the corridor&#39;s Integration resources page.  |  [optional] |
|**business** | [**BusinessIdentityDTO**](BusinessIdentityDTO.md) |  |  [optional] |
|**individual** | [**IndividualIdentityDTO**](IndividualIdentityDTO.md) |  |  [optional] |



