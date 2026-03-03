

# GetIdentityResponseV3DTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identityId** | **String** | Server-generated unique identifier of the identity. |  [optional] |
|**identityState** | **String** | The state of the identity. |  [optional] |
|**nickName** | **String** | Optional human-readable alias set by the client. |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional labels used to categorize or filter identities. |  [optional] |
|**validatePayoutRails** | **List&lt;String&gt;** | List of payout methods where this identity is considered valid. Use this to indicate which payout methods (for example, US_ACH, EU_SEPA) the identity can be used with in payments. |  [optional] |
|**version** | **String** | Sequential version number. Each successful PUT creates a higher version. |  [optional] |
|**schemaVersion** | **String** | Schema version used to validate this identity, for example 1.0.0. |  [optional] |
|**createdAt** | **OffsetDateTime** | RFC 3339 timestamp when the identity was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | RFC 3339 timestamp when the identity was last updated. |  [optional] |
|**identityType** | **String** | The type of the identity |  |
|**paymentRole** | **String** | The payment role of the identity |  |
|**internalId** | **String** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  |  [optional] |
|**business** | [**BusinessIdentityDTO**](BusinessIdentityDTO.md) |  |  [optional] |
|**individual** | [**IndividualIdentityDTO**](IndividualIdentityDTO.md) |  |  [optional] |



