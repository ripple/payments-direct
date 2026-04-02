# PaymentsV2Api

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPaymentV2**](PaymentsV2Api.md#createPaymentV2) | **POST** /v3/payments | Create payment V2 |
| [**getPaymentByIdV2**](PaymentsV2Api.md#getPaymentByIdV2) | **GET** /v3/payments/{paymentId} | Get a payment by ID V2 |
| [**getPaymentStateTransitionsByIdV2**](PaymentsV2Api.md#getPaymentStateTransitionsByIdV2) | **GET** /v3/payments/{paymentId}/states | Get state transitions by payment ID |
| [**searchPaymentsV2**](PaymentsV2Api.md#searchPaymentsV2) | **POST** /v3/payments/filter | Search payments V2 |
| [**updatePaymentLabelsV2**](PaymentsV2Api.md#updatePaymentLabelsV2) | **PATCH** /v3/payments/{paymentId}/labels | Update payment labels |



## createPaymentV2

> PaymentV2DTO createPaymentV2(paymentRequestV2DTO)

Create payment V2

Create a payment  **Tutorial**  * Learn how to [Create a payment](/products/payments-direct-2/api-docs/tutorials/create-a-payment/). 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.PaymentsV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsV2Api apiInstance = new PaymentsV2Api(defaultClient);
        PaymentRequestV2DTO paymentRequestV2DTO = new PaymentRequestV2DTO(); // PaymentRequestV2DTO | create payment request
        try {
            PaymentV2DTO result = apiInstance.createPaymentV2(paymentRequestV2DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsV2Api#createPaymentV2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentRequestV2DTO** | [**PaymentRequestV2DTO**](PaymentRequestV2DTO.md)| create payment request | |

### Return type

[**PaymentV2DTO**](PaymentV2DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Valid payment |  -  |
| **400** | Invalid input variables for the payment. |  -  |
| **402** | Problems related to payment limits. |  -  |
| **500** | Internal processing error |  -  |


## getPaymentByIdV2

> PaymentWithDetailsV2DTO getPaymentByIdV2(paymentId)

Get a payment by ID V2

Gets a payment by ID.

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.PaymentsV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsV2Api apiInstance = new PaymentsV2Api(defaultClient);
        UUID paymentId = UUID.fromString("7ea3399c-1234-5678-8d8f-d320ea406630"); // UUID | Unique identifier of the payment to get.
        try {
            PaymentWithDetailsV2DTO result = apiInstance.getPaymentByIdV2(paymentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsV2Api#getPaymentByIdV2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentId** | **UUID**| Unique identifier of the payment to get. | |

### Return type

[**PaymentWithDetailsV2DTO**](PaymentWithDetailsV2DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched payment details. |  -  |
| **400** | Invalid input variables for the payment. |  -  |
| **404** | Payment not found. |  -  |
| **500** | Internal processing error |  -  |


## getPaymentStateTransitionsByIdV2

> StateTransitionsResponseV2DTO getPaymentStateTransitionsByIdV2(paymentId)

Get state transitions by payment ID

Gets the state transitions for a payment by ID.

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.PaymentsV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsV2Api apiInstance = new PaymentsV2Api(defaultClient);
        UUID paymentId = UUID.fromString("7ea3399c-1234-5678-8d8f-d320ea406630"); // UUID | Unique identifier of the payment for which you want to get state transition information.
        try {
            StateTransitionsResponseV2DTO result = apiInstance.getPaymentStateTransitionsByIdV2(paymentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsV2Api#getPaymentStateTransitionsByIdV2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentId** | **UUID**| Unique identifier of the payment for which you want to get state transition information. | |

### Return type

[**StateTransitionsResponseV2DTO**](StateTransitionsResponseV2DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched payment state transitions. |  -  |
| **400** | Invalid input variables for the payment. |  -  |
| **404** | Payment not found. |  -  |
| **500** | Internal processing error |  -  |


## searchPaymentsV2

> PaymentsResponseV2DTO searchPaymentsV2(searchPaymentsRequestV2DTO)

Search payments V2

Search for payments based on filtering criteria.

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.PaymentsV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsV2Api apiInstance = new PaymentsV2Api(defaultClient);
        SearchPaymentsRequestV2DTO searchPaymentsRequestV2DTO = new SearchPaymentsRequestV2DTO(); // SearchPaymentsRequestV2DTO | Search payments request
        try {
            PaymentsResponseV2DTO result = apiInstance.searchPaymentsV2(searchPaymentsRequestV2DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsV2Api#searchPaymentsV2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchPaymentsRequestV2DTO** | [**SearchPaymentsRequestV2DTO**](SearchPaymentsRequestV2DTO.md)| Search payments request | |

### Return type

[**PaymentsResponseV2DTO**](PaymentsResponseV2DTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payments matching the specified filtering criteria. |  -  |
| **400** | Invalid input variables for the request. |  -  |
| **500** | Internal processing error |  -  |


## updatePaymentLabelsV2

> UpdatePaymentLabelsResponseDTO updatePaymentLabelsV2(paymentId, updatePaymentLabelsRequestDTO)

Update payment labels

Add or remove labels for a payment.

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.PaymentsV2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsV2Api apiInstance = new PaymentsV2Api(defaultClient);
        UUID paymentId = UUID.fromString("7ea3399c-1234-5678-8d8f-d320ea406630"); // UUID | The unique ID that identifies the payment for which you want to update labels.
        UpdatePaymentLabelsRequestDTO updatePaymentLabelsRequestDTO = new UpdatePaymentLabelsRequestDTO(); // UpdatePaymentLabelsRequestDTO | Labels to add to or remove from the payment.
        try {
            UpdatePaymentLabelsResponseDTO result = apiInstance.updatePaymentLabelsV2(paymentId, updatePaymentLabelsRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsV2Api#updatePaymentLabelsV2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentId** | **UUID**| The unique ID that identifies the payment for which you want to update labels. | |
| **updatePaymentLabelsRequestDTO** | [**UpdatePaymentLabelsRequestDTO**](UpdatePaymentLabelsRequestDTO.md)| Labels to add to or remove from the payment. | |

### Return type

[**UpdatePaymentLabelsResponseDTO**](UpdatePaymentLabelsResponseDTO.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the payment labels. |  -  |
| **400** | Invalid input variables for the request. |  -  |
| **404** | Payment not found. |  -  |
| **500** | Internal processing error |  -  |

