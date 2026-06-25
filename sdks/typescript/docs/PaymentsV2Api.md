# PaymentsV2Api

All URIs are relative to *https://api.test.ripple.com*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createPaymentV2**](#createpaymentv2) | **POST** /v3/payments | Create payment|
|[**getPaymentByIdV2**](#getpaymentbyidv2) | **GET** /v3/payments/{paymentId} | Get a payment by ID|
|[**getPaymentStateTransitionsByIdV2**](#getpaymentstatetransitionsbyidv2) | **GET** /v3/payments/{paymentId}/states | Get state transitions by payment ID|
|[**searchPaymentsV2**](#searchpaymentsv2) | **POST** /v3/payments/filter | Search payments|
|[**updatePaymentLabelsV2**](#updatepaymentlabelsv2) | **PATCH** /v3/payments/{paymentId}/labels | Update payment labels|

# **createPaymentV2**
> PaymentV2 createPaymentV2(paymentRequestV2)

Initiates a new cross-border payment. Payments are processed asynchronously. Use **Get a payment by ID** to poll for status updates, or **Get state transitions** to view the full status history. 

### Example

```typescript
import {
    PaymentsV2Api,
    Configuration,
    PaymentRequestV2
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsV2Api(configuration);

let paymentRequestV2: PaymentRequestV2; //create payment request

const { status, data } = await apiInstance.createPaymentV2(
    paymentRequestV2
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **paymentRequestV2** | **PaymentRequestV2**| create payment request | |


### Return type

**PaymentV2**

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

# **getPaymentByIdV2**
> PaymentWithDetailsV2 getPaymentByIdV2()

Returns the current status and full details of a payment, including amounts, beneficiary information, and the associated quote.

### Example

```typescript
import {
    PaymentsV2Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsV2Api(configuration);

let paymentId: string; //Unique identifier of the payment to get. (default to undefined)

const { status, data } = await apiInstance.getPaymentByIdV2(
    paymentId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **paymentId** | [**string**] | Unique identifier of the payment to get. | defaults to undefined|


### Return type

**PaymentWithDetailsV2**

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

# **getPaymentStateTransitionsByIdV2**
> StateTransitionsResponseV2 getPaymentStateTransitionsByIdV2()

Returns the complete state transition history for a payment, including each status change and its timestamp. Use this to audit payment progress or debug processing issues.

### Example

```typescript
import {
    PaymentsV2Api,
    Configuration
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsV2Api(configuration);

let paymentId: string; //Unique identifier of the payment for which you want to get state transition information. (default to undefined)

const { status, data } = await apiInstance.getPaymentStateTransitionsByIdV2(
    paymentId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **paymentId** | [**string**] | Unique identifier of the payment for which you want to get state transition information. | defaults to undefined|


### Return type

**StateTransitionsResponseV2**

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

# **searchPaymentsV2**
> PaymentsResponseV2 searchPaymentsV2(searchPaymentsRequestV2)

Returns a paginated list of payments matching the specified filters. You can filter by status, date range, destination country, currency, or custom labels.

### Example

```typescript
import {
    PaymentsV2Api,
    Configuration,
    SearchPaymentsRequestV2
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsV2Api(configuration);

let searchPaymentsRequestV2: SearchPaymentsRequestV2; //Search payments request

const { status, data } = await apiInstance.searchPaymentsV2(
    searchPaymentsRequestV2
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **searchPaymentsRequestV2** | **SearchPaymentsRequestV2**| Search payments request | |


### Return type

**PaymentsResponseV2**

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

# **updatePaymentLabelsV2**
> UpdatePaymentLabelsResponse updatePaymentLabelsV2(updatePaymentLabelsRequest)

Add or remove labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment\'s lifetime.

### Example

```typescript
import {
    PaymentsV2Api,
    Configuration,
    UpdatePaymentLabelsRequest
} from '@ripple/payments-direct-client';

const configuration = new Configuration();
const apiInstance = new PaymentsV2Api(configuration);

let paymentId: string; //The unique ID that identifies the payment for which you want to update labels. (default to undefined)
let updatePaymentLabelsRequest: UpdatePaymentLabelsRequest; //Labels to add to or remove from the payment.

const { status, data } = await apiInstance.updatePaymentLabelsV2(
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

