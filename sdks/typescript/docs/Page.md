# Page

Specify page size and the ID of the last fetched result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size** | **number** | Size of the page | [optional] [default to 20]
**lastPageToken** | **string** | The unique reference ID of the last fetched item. To retrieve subsequent item(s) if any, specify this value as the value of the &#x60;Page.list&#x60; field in the  &#x60;POST /payments/filter&#x60; operation request body. | [optional] [default to undefined]

## Example

```typescript
import { Page } from '@ripple/payments-direct-client';

const instance: Page = {
    size,
    lastPageToken,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
