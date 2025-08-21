# AuthenticationResponse

The authentication response object that includes the token, type, scopes, and expiry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **string** | The bearer token you use when authenticating with a Ripple API. | [optional] [default to undefined]
**scope** | **string** | List of scopes applied to your &#x60;access_token&#x60;. | [optional] [default to undefined]
**expiresIn** | **number** | How long your &#x60;access_token&#x60; is valid. You need to request a new token when it expires. | [optional] [default to undefined]
**tokenType** | **string** | The type of token. Ripple APIs use &#x60;Bearer&#x60; auth tokens. | [optional] [default to undefined]

## Example

```typescript
import { AuthenticationResponse } from '@ripple/payments-direct-client';

const instance: AuthenticationResponse = {
    accessToken,
    scope,
    expiresIn,
    tokenType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
