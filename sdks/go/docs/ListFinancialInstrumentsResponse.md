# ListFinancialInstrumentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]FinancialInstrumentMetadata**](FinancialInstrumentMetadata.md) | The list of the financial instruments that match the query parameters | [optional] 
**NextToken** | Pointer to **string** | The token to retrieve the next page of results | [optional] 

## Methods

### NewListFinancialInstrumentsResponse

`func NewListFinancialInstrumentsResponse() *ListFinancialInstrumentsResponse`

NewListFinancialInstrumentsResponse instantiates a new ListFinancialInstrumentsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListFinancialInstrumentsResponseWithDefaults

`func NewListFinancialInstrumentsResponseWithDefaults() *ListFinancialInstrumentsResponse`

NewListFinancialInstrumentsResponseWithDefaults instantiates a new ListFinancialInstrumentsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListFinancialInstrumentsResponse) GetData() []FinancialInstrumentMetadata`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListFinancialInstrumentsResponse) GetDataOk() (*[]FinancialInstrumentMetadata, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListFinancialInstrumentsResponse) SetData(v []FinancialInstrumentMetadata)`

SetData sets Data field to given value.

### HasData

`func (o *ListFinancialInstrumentsResponse) HasData() bool`

HasData returns a boolean if a field has been set.

### GetNextToken

`func (o *ListFinancialInstrumentsResponse) GetNextToken() string`

GetNextToken returns the NextToken field if non-nil, zero value otherwise.

### GetNextTokenOk

`func (o *ListFinancialInstrumentsResponse) GetNextTokenOk() (*string, bool)`

GetNextTokenOk returns a tuple with the NextToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextToken

`func (o *ListFinancialInstrumentsResponse) SetNextToken(v string)`

SetNextToken sets NextToken field to given value.

### HasNextToken

`func (o *ListFinancialInstrumentsResponse) HasNextToken() bool`

HasNextToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


