

# GetIdentityResponseV3DTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identityId** | **String** | Server-generated unique identifier of the identity. |  [optional] |
|**identityState** | **String** | The state of the identity   * ACTIVE   * DEACTIVATED  |  [optional] |
|**nickName** | **String** | Optional human-readable alias set by the client. |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional labels used to categorize or filter identities. |  [optional] |
|**validatePayoutRails** | **List&lt;String&gt;** | List of payout methods where this identity is considered valid. Use this to indicate which payout methods (for example, US_ACH, EU_SEPA) the identity can be used with in payments. |  [optional] |
|**version** | **String** | Sequential version number. Each successful PUT creates a higher version. |  [optional] |
|**schemaVersion** | **String** | Schema version used to validate this identity, for example 1.0.0. |  [optional] |
|**createdAt** | **OffsetDateTime** | RFC 3339 timestamp when the identity was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | RFC 3339 timestamp when the identity was last updated. |  [optional] |
|**identityType** | **String** | The type of the identity |  |
|**paymentRole** | **String** | The payment role of the identity |  |
|**internalId** | **String** | Client-provided unique identifier for idempotency and deduplication. Required for ORIGINATOR identities; optional for BENEFICIARY identities. Must be unique across all active identities in your organization. Duplicate values will result in a 409 Conflict error.  This is your own reference key, not the originator&#39;s account number. Use &#x60;originatorAccountNumber&#x60; for that.  |  [optional] |
|**originatorAccountNumber** | **String** | The originator&#39;s account number, or your customer identifier for the originator. Required for ORIGINATOR identities on USD payments to China (&#x60;CN_CFXPS&#x60;); optional elsewhere. Only sent to payout partners for ORIGINATOR identities.  Must be unique across all active identities in your organization, including BENEFICIARY identities. Duplicate values return a 409 Conflict error.  Corridor length and character limits apply to this value but are not enforced on this field. See the corridor&#39;s Integration resources page.  |  [optional] |
|**business** | [**BusinessIdentityDTO**](BusinessIdentityDTO.md) |  |  [optional] |
|**individual** | [**IndividualIdentityDTO**](IndividualIdentityDTO.md) |  |  [optional] |



