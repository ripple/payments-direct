# ListIdentitiesResponseV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]IdentityV2**](IdentityV2.md) | The list of the identities that match the query parameters | [optional] 

## Methods

### NewListIdentitiesResponseV2

`func NewListIdentitiesResponseV2() *ListIdentitiesResponseV2`

NewListIdentitiesResponseV2 instantiates a new ListIdentitiesResponseV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListIdentitiesResponseV2WithDefaults

`func NewListIdentitiesResponseV2WithDefaults() *ListIdentitiesResponseV2`

NewListIdentitiesResponseV2WithDefaults instantiates a new ListIdentitiesResponseV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListIdentitiesResponseV2) GetData() []IdentityV2`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListIdentitiesResponseV2) GetDataOk() (*[]IdentityV2, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListIdentitiesResponseV2) SetData(v []IdentityV2)`

SetData sets Data field to given value.

### HasData

`func (o *ListIdentitiesResponseV2) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


