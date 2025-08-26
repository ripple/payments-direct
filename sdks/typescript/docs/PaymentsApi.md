# PaymentsApi

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createPayment**](#createpayment) | **POST** /v2/payments | Create payment|
|[**getPaymentById**](#getpaymentbyid) | **GET** /v2/payments/{paymentId} | Get a payment by ID|
|[**getPaymentStateTransitionsById**](#getpaymentstatetransitionsbyid) | **GET** /v2/payments/{paymentId}/states | Get state transitions by payment ID|
|[**searchPayments**](#searchpayments) | **POST** /v2/payments/filter | Search payments|
|[**updatePaymentLabels**](#updatepaymentlabels) | **PATCH** /v2/payments/{paymentId}/labels | Update payment labels|

# **createPayment**
> Payment createPayment(paymentRequest)

Create a payment  **Tutorials**  * Learn how to [Create a payment](../../tutorials/create-a-payment/). * Learn how to [Create a third-party payment](../../tutorials/create-a-third-party-payment/). 

### Example

```typescript
import {
    PaymentsApi,
    Configuration,
    PaymentRequest
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsApi(configuration);

let paymentRequest: PaymentRequest; //create payment request

const { status, data } = await apiInstance.createPayment(
    paymentRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **paymentRequest** | **PaymentRequest**| create payment request | |


### Return type

**Payment**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Valid payment |  -  |
|**400** | Invalid input variables for the payment. |  -  |
|**402** | Problems related to payment limits. |  -  |
|**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPaymentById**
> PaymentWithDetails getPaymentById()

Gets a payment by ID.

### Example

```typescript
import {
    PaymentsApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsApi(configuration);

let paymentId: string; //Unique identifier of the payment to get. (default to undefined)

const { status, data } = await apiInstance.getPaymentById(
    paymentId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **paymentId** | [**string**] | Unique identifier of the payment to get. | defaults to undefined|


### Return type

**PaymentWithDetails**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successfully fetched payment details. |  -  |
|**400** | Invalid input variables for the payment. |  -  |
|**404** | Payment not found. |  -  |
|**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPaymentStateTransitionsById**
> StateTransitionsResponse getPaymentStateTransitionsById()

Gets the state transitions for a payment by ID.

### Example

```typescript
import {
    PaymentsApi,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsApi(configuration);

let paymentId: string; //Unique identifier of the payment for which you want to get state transition information. (default to undefined)

const { status, data } = await apiInstance.getPaymentStateTransitionsById(
    paymentId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **paymentId** | [**string**] | Unique identifier of the payment for which you want to get state transition information. | defaults to undefined|


### Return type

**StateTransitionsResponse**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successfully fetched payment state transitions. |  -  |
|**400** | Invalid input variables for the payment. |  -  |
|**404** | Payment not found. |  -  |
|**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchPayments**
> PaymentsResponse searchPayments(searchPaymentsRequest)

Search for payments based on filtering criteria.

### Example

```typescript
import {
    PaymentsApi,
    Configuration,
    SearchPaymentsRequest
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsApi(configuration);

let searchPaymentsRequest: SearchPaymentsRequest; //Search payments request

const { status, data } = await apiInstance.searchPayments(
    searchPaymentsRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **searchPaymentsRequest** | **SearchPaymentsRequest**| Search payments request | |


### Return type

**PaymentsResponse**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Payments matching the specified filtering criteria. |  -  |
|**400** | Invalid input variables for the request. |  -  |
|**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updatePaymentLabels**
> UpdatePaymentLabelsResponse updatePaymentLabels(updatePaymentLabelsRequest)

Add or remove labels for a payment.

### Example

```typescript
import {
    PaymentsApi,
    Configuration,
    UpdatePaymentLabelsRequest
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsApi(configuration);

let paymentId: string; //The unique ID that identifies the payment for which you want to update labels. (default to undefined)
let updatePaymentLabelsRequest: UpdatePaymentLabelsRequest; //Labels to add to or remove from the payment.

const { status, data } = await apiInstance.updatePaymentLabels(
    paymentId,
    updatePaymentLabelsRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **updatePaymentLabelsRequest** | **UpdatePaymentLabelsRequest**| Labels to add to or remove from the payment. | |
| **paymentId** | [**string**] | The unique ID that identifies the payment for which you want to update labels. | defaults to undefined|


### Return type

**UpdatePaymentLabelsResponse**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successfully updated the payment labels. |  -  |
|**400** | Invalid input variables for the request. |  -  |
|**404** | Payment not found. |  -  |
|**500** | Internal processing error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

