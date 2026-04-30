

# PutRippleIdentityDTO

Request to update an existing identity. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**internalId** | **String** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  |  [optional] |
|**business** | [**BusinessIdentityDTO**](BusinessIdentityDTO.md) |  |  [optional] |
|**individual** | [**IndividualIdentityDTO**](IndividualIdentityDTO.md) |  |  [optional] |



