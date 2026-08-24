# GetFinancialInstrumentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FinancialInstrument** | [**RippleFinancialInstrumentEntry**](RippleFinancialInstrumentEntry.md) |  | 
**Identity** | Pointer to [**GetIdentityResponseV3**](GetIdentityResponseV3.md) |  | [optional] 

## Methods

### NewGetFinancialInstrumentResponse

`func NewGetFinancialInstrumentResponse(financialInstrument RippleFinancialInstrumentEntry, ) *GetFinancialInstrumentResponse`

NewGetFinancialInstrumentResponse instantiates a new GetFinancialInstrumentResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetFinancialInstrumentResponseWithDefaults

`func NewGetFinancialInstrumentResponseWithDefaults() *GetFinancialInstrumentResponse`

NewGetFinancialInstrumentResponseWithDefaults instantiates a new GetFinancialInstrumentResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFinancialInstrument

`func (o *GetFinancialInstrumentResponse) GetFinancialInstrument() RippleFinancialInstrumentEntry`

GetFinancialInstrument returns the FinancialInstrument field if non-nil, zero value otherwise.

### GetFinancialInstrumentOk

`func (o *GetFinancialInstrumentResponse) GetFinancialInstrumentOk() (*RippleFinancialInstrumentEntry, bool)`

GetFinancialInstrumentOk returns a tuple with the FinancialInstrument field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinancialInstrument

`func (o *GetFinancialInstrumentResponse) SetFinancialInstrument(v RippleFinancialInstrumentEntry)`

SetFinancialInstrument sets FinancialInstrument field to given value.


### GetIdentity

`func (o *GetFinancialInstrumentResponse) GetIdentity() GetIdentityResponseV3`

GetIdentity returns the Identity field if non-nil, zero value otherwise.

### GetIdentityOk

`func (o *GetFinancialInstrumentResponse) GetIdentityOk() (*GetIdentityResponseV3, bool)`

GetIdentityOk returns a tuple with the Identity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentity

`func (o *GetFinancialInstrumentResponse) SetIdentity(v GetIdentityResponseV3)`

SetIdentity sets Identity field to given value.

### HasIdentity

`func (o *GetFinancialInstrumentResponse) HasIdentity() bool`

HasIdentity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


