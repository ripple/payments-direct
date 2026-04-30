# ListIdentitiesResponseV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Array&lt;IdentityResponseV3&gt;**](IdentityResponseV3.md) | The list of the identities that match the query parameters | [optional] [default to undefined]
**nextToken** | **string** | The token to retrieve the next page of results | [optional] [default to undefined]

## Example

```typescript
import { ListIdentitiesResponseV3 } from '@ripple/payments-direct-client';

const instance: ListIdentitiesResponseV3 = {
    data,
    nextToken,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
