# CreateIdentityRequestV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PiiData** | **map[string]interface{}** | PII data in JSON format.  You must use the correct &#x60;piiData&#x60; schema for the type of identity you want to create.  **Note**: Reach out to your Ripple liaison to get this schema.  | 
**IdentityType** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | 
**NickName** | Pointer to **string** | The nickname for the identity provided at the time of identity creation | [optional] 
**UseCaseType** | [**UseCaseType**](UseCaseType.md) |  | 

## Methods

### NewCreateIdentityRequestV2

`func NewCreateIdentityRequestV2(piiData map[string]interface{}, identityType IdentityTypeV2, useCaseType UseCaseType, ) *CreateIdentityRequestV2`

NewCreateIdentityRequestV2 instantiates a new CreateIdentityRequestV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateIdentityRequestV2WithDefaults

`func NewCreateIdentityRequestV2WithDefaults() *CreateIdentityRequestV2`

NewCreateIdentityRequestV2WithDefaults instantiates a new CreateIdentityRequestV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPiiData

`func (o *CreateIdentityRequestV2) GetPiiData() map[string]interface{}`

GetPiiData returns the PiiData field if non-nil, zero value otherwise.

### GetPiiDataOk

`func (o *CreateIdentityRequestV2) GetPiiDataOk() (*map[string]interface{}, bool)`

GetPiiDataOk returns a tuple with the PiiData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPiiData

`func (o *CreateIdentityRequestV2) SetPiiData(v map[string]interface{})`

SetPiiData sets PiiData field to given value.


### GetIdentityType

`func (o *CreateIdentityRequestV2) GetIdentityType() IdentityTypeV2`

GetIdentityType returns the IdentityType field if non-nil, zero value otherwise.

### GetIdentityTypeOk

`func (o *CreateIdentityRequestV2) GetIdentityTypeOk() (*IdentityTypeV2, bool)`

GetIdentityTypeOk returns a tuple with the IdentityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityType

`func (o *CreateIdentityRequestV2) SetIdentityType(v IdentityTypeV2)`

SetIdentityType sets IdentityType field to given value.


### GetNickName

`func (o *CreateIdentityRequestV2) GetNickName() string`

GetNickName returns the NickName field if non-nil, zero value otherwise.

### GetNickNameOk

`func (o *CreateIdentityRequestV2) GetNickNameOk() (*string, bool)`

GetNickNameOk returns a tuple with the NickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNickName

`func (o *CreateIdentityRequestV2) SetNickName(v string)`

SetNickName sets NickName field to given value.

### HasNickName

`func (o *CreateIdentityRequestV2) HasNickName() bool`

HasNickName returns a boolean if a field has been set.

### GetUseCaseType

`func (o *CreateIdentityRequestV2) GetUseCaseType() UseCaseType`

GetUseCaseType returns the UseCaseType field if non-nil, zero value otherwise.

### GetUseCaseTypeOk

`func (o *CreateIdentityRequestV2) GetUseCaseTypeOk() (*UseCaseType, bool)`

GetUseCaseTypeOk returns a tuple with the UseCaseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseCaseType

`func (o *CreateIdentityRequestV2) SetUseCaseType(v UseCaseType)`

SetUseCaseType sets UseCaseType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


