

# AuthenticationResponseDTO

The authentication response object that includes the token, type, scopes, and expiry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The bearer token you use when authenticating with a Ripple API. |  [optional] |
|**scope** | **String** | List of scopes applied to your &#x60;access_token&#x60;. |  [optional] |
|**expiresIn** | **Long** | How long your &#x60;access_token&#x60; is valid. You need to request a new token when it expires. |  [optional] |
|**tokenType** | **String** | The type of token. Ripple APIs use &#x60;Bearer&#x60; auth tokens. |  [optional] |



