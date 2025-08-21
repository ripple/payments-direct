# ValidateTokenResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | Pointer to **string** |  | [optional] 
**SecondsToExpiry** | Pointer to **int64** | Remaining time in seconds before the tested token expires. | [optional] 

## Methods

### NewValidateTokenResponse

`func NewValidateTokenResponse() *ValidateTokenResponse`

NewValidateTokenResponse instantiates a new ValidateTokenResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewValidateTokenResponseWithDefaults

`func NewValidateTokenResponseWithDefaults() *ValidateTokenResponse`

NewValidateTokenResponseWithDefaults instantiates a new ValidateTokenResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *ValidateTokenResponse) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ValidateTokenResponse) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ValidateTokenResponse) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ValidateTokenResponse) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetSecondsToExpiry

`func (o *ValidateTokenResponse) GetSecondsToExpiry() int64`

GetSecondsToExpiry returns the SecondsToExpiry field if non-nil, zero value otherwise.

### GetSecondsToExpiryOk

`func (o *ValidateTokenResponse) GetSecondsToExpiryOk() (*int64, bool)`

GetSecondsToExpiryOk returns a tuple with the SecondsToExpiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecondsToExpiry

`func (o *ValidateTokenResponse) SetSecondsToExpiry(v int64)`

SetSecondsToExpiry sets SecondsToExpiry field to given value.

### HasSecondsToExpiry

`func (o *ValidateTokenResponse) HasSecondsToExpiry() bool`

HasSecondsToExpiry returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


