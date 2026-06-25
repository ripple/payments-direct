

# SortV2DTO

Defines the sorting parameters for listing payments, including the field and sort direction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sortField** | **String** | The field to use when sorting payments in the requested sort order.  Currently supported values include:  - &#x60;internalId&#x60;  - &#x60;paymentState&#x60;  - &#x60;sourceCurrency&#x60;  - &#x60;sourceAmount&#x60;  - &#x60;destinationCurrency&#x60;  - &#x60;destinationCountry&#x60;  - &#x60;destinationAmount&#x60;  - &#x60;initiatedAt&#x60;  - &#x60;expiresAt&#x60;  - &#x60;lastStateUpdatedAt&#x60;  - &#x60;paymentLabel&#x60;  If an unsupported value is provided, the request fails with a validation error.  |  [optional] |
|**sortDirection** | [**SortDirectionEnum**](#SortDirectionEnum) | Indicates whether results are sorted in ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. |  [optional] |



## Enum: SortDirectionEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



