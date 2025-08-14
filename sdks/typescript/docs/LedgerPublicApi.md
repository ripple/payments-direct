# LedgerPublicApi

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getBalances**](#getbalances) | **GET** /v2/balances | Get available balances|

# **getBalances**
> GetBalances200Response getBalances()


### Example

```typescript
import {
    LedgerPublicApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new LedgerPublicApi(configuration);

let currency: string; //The currency for which you want to get the balance. (optional) (default to undefined)

const { status, data } = await apiInstance.getBalances(
    currency
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **currency** | [**string**] | The currency for which you want to get the balance. | (optional) defaults to undefined|


### Return type

**GetBalances200Response**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successful response containing balance details. |  -  |
|**400** | Bad request |  -  |
|**401** | Unauthorized access |  -  |
|**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

