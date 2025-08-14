# GetBalances200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Timestamp** | **time.Time** | Timestamp of the balance response. | 
**Balances** | [**[]GetBalances200ResponseBalancesInner**](GetBalances200ResponseBalancesInner.md) | List of available prefund balances. | 

## Methods

### NewGetBalances200Response

`func NewGetBalances200Response(timestamp time.Time, balances []GetBalances200ResponseBalancesInner, ) *GetBalances200Response`

NewGetBalances200Response instantiates a new GetBalances200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBalances200ResponseWithDefaults

`func NewGetBalances200ResponseWithDefaults() *GetBalances200Response`

NewGetBalances200ResponseWithDefaults instantiates a new GetBalances200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTimestamp

`func (o *GetBalances200Response) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *GetBalances200Response) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *GetBalances200Response) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.


### GetBalances

`func (o *GetBalances200Response) GetBalances() []GetBalances200ResponseBalancesInner`

GetBalances returns the Balances field if non-nil, zero value otherwise.

### GetBalancesOk

`func (o *GetBalances200Response) GetBalancesOk() (*[]GetBalances200ResponseBalancesInner, bool)`

GetBalancesOk returns a tuple with the Balances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBalances

`func (o *GetBalances200Response) SetBalances(v []GetBalances200ResponseBalancesInner)`

SetBalances sets Balances field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


