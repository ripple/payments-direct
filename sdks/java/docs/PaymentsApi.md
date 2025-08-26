# PaymentsApi

All URIs are relative to *https://api.test.ripple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPayment**](PaymentsApi.md#createPayment) | **POST** /v2/payments | Create payment |
| [**getPaymentById**](PaymentsApi.md#getPaymentById) | **GET** /v2/payments/{paymentId} | Get a payment by ID |
| [**getPaymentStateTransitionsById**](PaymentsApi.md#getPaymentStateTransitionsById) | **GET** /v2/payments/{paymentId}/states | Get state transitions by payment ID |
| [**searchPayments**](PaymentsApi.md#searchPayments) | **POST** /v2/payments/filter | Search payments |
| [**updatePaymentLabels**](PaymentsApi.md#updatePaymentLabels) | **PATCH** /v2/payments/{paymentId}/labels | Update payment labels |



## createPayment

> PaymentDTO createPayment(paymentRequestDTO)

Create payment

Create a payment  **Tutorials**  * Learn how to [Create a payment](../../tutorials/create-a-payment/). * Learn how to [Create a third-party payment](../../tutorials/create-a-third-party-payment/). 

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        PaymentRequestDTO paymentRequestDTO = new PaymentRequestDTO(); // PaymentRequestDTO | create payment request
        try {
            PaymentDTO result = apiInstance.createPayment(paymentRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createPayment");
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
| **paymentRequestDTO** | [**PaymentRequestDTO**](PaymentRequestDTO.md)| create payment request | |

### Return type

[**PaymentDTO**](PaymentDTO.md)

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


## getPaymentById

> PaymentWithDetailsDTO getPaymentById(paymentId)

Get a payment by ID

Gets a payment by ID.

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        UUID paymentId = UUID.fromString("7ea3399c-1234-5678-8d8f-d320ea406630"); // UUID | Unique identifier of the payment to get.
        try {
            PaymentWithDetailsDTO result = apiInstance.getPaymentById(paymentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#getPaymentById");
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

[**PaymentWithDetailsDTO**](PaymentWithDetailsDTO.md)

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


## getPaymentStateTransitionsById

> StateTransitionsResponseDTO getPaymentStateTransitionsById(paymentId)

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
import com.ripple.payments.direct.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        UUID paymentId = UUID.fromString("7ea3399c-1234-5678-8d8f-d320ea406630"); // UUID | Unique identifier of the payment for which you want to get state transition information.
        try {
            StateTransitionsResponseDTO result = apiInstance.getPaymentStateTransitionsById(paymentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#getPaymentStateTransitionsById");
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

[**StateTransitionsResponseDTO**](StateTransitionsResponseDTO.md)

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


## searchPayments

> PaymentsResponseDTO searchPayments(searchPaymentsRequestDTO)

Search payments

Search for payments based on filtering criteria.

### Example

```java
// Import classes:
import com.ripple.payments.direct.ApiClient;
import com.ripple.payments.direct.ApiException;
import com.ripple.payments.direct.Configuration;
import com.ripple.payments.direct.auth.*;
import com.ripple.payments.direct.models.*;
import com.ripple.payments.direct.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        SearchPaymentsRequestDTO searchPaymentsRequestDTO = new SearchPaymentsRequestDTO(); // SearchPaymentsRequestDTO | Search payments request
        try {
            PaymentsResponseDTO result = apiInstance.searchPayments(searchPaymentsRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#searchPayments");
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
| **searchPaymentsRequestDTO** | [**SearchPaymentsRequestDTO**](SearchPaymentsRequestDTO.md)| Search payments request | |

### Return type

[**PaymentsResponseDTO**](PaymentsResponseDTO.md)

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


## updatePaymentLabels

> UpdatePaymentLabelsResponseDTO updatePaymentLabels(paymentId, updatePaymentLabelsRequestDTO)

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
import com.ripple.payments.direct.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.test.ripple.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        UUID paymentId = UUID.fromString("7ea3399c-1234-5678-8d8f-d320ea406630"); // UUID | The unique ID that identifies the payment for which you want to update labels.
        UpdatePaymentLabelsRequestDTO updatePaymentLabelsRequestDTO = new UpdatePaymentLabelsRequestDTO(); // UpdatePaymentLabelsRequestDTO | Labels to add to or remove from the payment.
        try {
            UpdatePaymentLabelsResponseDTO result = apiInstance.updatePaymentLabels(paymentId, updatePaymentLabelsRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#updatePaymentLabels");
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

