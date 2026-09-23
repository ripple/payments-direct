

# CreateIdentityRequestV3DTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nickName** | **String** | The nickname for the identity |  [optional] |
|**validatePayoutRails** | **List&lt;String&gt;** | The payment rails to validate the identity against |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags are used to categorize the identity.  |  [optional] |
|**identityType** | **String** | The type of the identity |  |
|**paymentRole** | **String** | The payment role of the identity |  |
|**internalId** | **String** | Client-provided unique identifier for idempotency and deduplication. Required for ORIGINATOR identities; optional for BENEFICIARY identities. Must be unique across all active identities in your organization. Duplicate values will result in a 409 Conflict error.  This is your own reference key, not the originator&#39;s account number. Use &#x60;originatorAccountNumber&#x60; for that.  |  [optional] |
|**originatorAccountNumber** | **String** | The originator&#39;s account number, or your customer identifier for the originator. Optional on every currently available corridor. Only sent to payout partners for ORIGINATOR identities.  Must be unique across all active identities in your organization, including BENEFICIARY identities. Duplicate values return a 409 Conflict error.  Payout partners apply their own length and character limits to this value, but they are not enforced on this field.  |  [optional] |
|**business** | [**BusinessIdentityDTO**](BusinessIdentityDTO.md) |  |  [optional] |
|**individual** | [**IndividualIdentityDTO**](IndividualIdentityDTO.md) |  |  [optional] |



