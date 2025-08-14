# ValidateTokenResponse

The response object indicating a token\'s validity and the time remaining on it

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **string** |  | [optional] [default to undefined]
**secondsToExpiry** | **number** | Remaining time in seconds before the tested token expires. | [optional] [default to undefined]

## Example

```typescript
import { ValidateTokenResponse } from '@ripple/payments-direct-client';

const instance: ValidateTokenResponse = {
    message,
    secondsToExpiry,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
