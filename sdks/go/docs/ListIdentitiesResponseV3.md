# ListIdentitiesResponseV3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]IdentityResponseV3**](IdentityResponseV3.md) | The list of the identities that match the query parameters | [optional] 
**NextToken** | Pointer to **string** | The token to retrieve the next page of results | [optional] 

## Methods

### NewListIdentitiesResponseV3

`func NewListIdentitiesResponseV3() *ListIdentitiesResponseV3`

NewListIdentitiesResponseV3 instantiates a new ListIdentitiesResponseV3 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListIdentitiesResponseV3WithDefaults

`func NewListIdentitiesResponseV3WithDefaults() *ListIdentitiesResponseV3`

NewListIdentitiesResponseV3WithDefaults instantiates a new ListIdentitiesResponseV3 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListIdentitiesResponseV3) GetData() []IdentityResponseV3`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListIdentitiesResponseV3) GetDataOk() (*[]IdentityResponseV3, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListIdentitiesResponseV3) SetData(v []IdentityResponseV3)`

SetData sets Data field to given value.

### HasData

`func (o *ListIdentitiesResponseV3) HasData() bool`

HasData returns a boolean if a field has been set.

### GetNextToken

`func (o *ListIdentitiesResponseV3) GetNextToken() string`

GetNextToken returns the NextToken field if non-nil, zero value otherwise.

### GetNextTokenOk

`func (o *ListIdentitiesResponseV3) GetNextTokenOk() (*string, bool)`

GetNextTokenOk returns a tuple with the NextToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextToken

`func (o *ListIdentitiesResponseV3) SetNextToken(v string)`

SetNextToken sets NextToken field to given value.

### HasNextToken

`func (o *ListIdentitiesResponseV3) HasNextToken() bool`

HasNextToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


