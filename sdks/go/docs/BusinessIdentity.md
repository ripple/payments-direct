# BusinessIdentity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessName** | **string** | Business Legal Name | 
**Address** | [**BusinessIdentityAddress**](BusinessIdentityAddress.md) |  | 
**Email** | Pointer to **string** | Address for electronic mail (e-mail). | [optional] 
**Phone** | Pointer to **string** | Phone Number | [optional] 
**Registration** | Pointer to [**[]BusinessIdentityRegistrationInner**](BusinessIdentityRegistrationInner.md) | Unique and unambiguous way to identify a business or organization. An array of objects, each containing unique identification of an organization, as assigned by an institution, using an identification scheme. | [optional] 
**IncorporationCountry** | Pointer to **string** | Information that locates and identifies the country, as defined by postal services where the organization was incorporated. Use Alpha-2 Code as defined in the ISO CountryCode ISO 3166-1 list. | [optional] 

## Methods

### NewBusinessIdentity

`func NewBusinessIdentity(businessName string, address BusinessIdentityAddress, ) *BusinessIdentity`

NewBusinessIdentity instantiates a new BusinessIdentity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessIdentityWithDefaults

`func NewBusinessIdentityWithDefaults() *BusinessIdentity`

NewBusinessIdentityWithDefaults instantiates a new BusinessIdentity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessName

`func (o *BusinessIdentity) GetBusinessName() string`

GetBusinessName returns the BusinessName field if non-nil, zero value otherwise.

### GetBusinessNameOk

`func (o *BusinessIdentity) GetBusinessNameOk() (*string, bool)`

GetBusinessNameOk returns a tuple with the BusinessName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessName

`func (o *BusinessIdentity) SetBusinessName(v string)`

SetBusinessName sets BusinessName field to given value.


### GetAddress

`func (o *BusinessIdentity) GetAddress() BusinessIdentityAddress`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *BusinessIdentity) GetAddressOk() (*BusinessIdentityAddress, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *BusinessIdentity) SetAddress(v BusinessIdentityAddress)`

SetAddress sets Address field to given value.


### GetEmail

`func (o *BusinessIdentity) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *BusinessIdentity) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *BusinessIdentity) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *BusinessIdentity) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetPhone

`func (o *BusinessIdentity) GetPhone() string`

GetPhone returns the Phone field if non-nil, zero value otherwise.

### GetPhoneOk

`func (o *BusinessIdentity) GetPhoneOk() (*string, bool)`

GetPhoneOk returns a tuple with the Phone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone

`func (o *BusinessIdentity) SetPhone(v string)`

SetPhone sets Phone field to given value.

### HasPhone

`func (o *BusinessIdentity) HasPhone() bool`

HasPhone returns a boolean if a field has been set.

### GetRegistration

`func (o *BusinessIdentity) GetRegistration() []BusinessIdentityRegistrationInner`

GetRegistration returns the Registration field if non-nil, zero value otherwise.

### GetRegistrationOk

`func (o *BusinessIdentity) GetRegistrationOk() (*[]BusinessIdentityRegistrationInner, bool)`

GetRegistrationOk returns a tuple with the Registration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistration

`func (o *BusinessIdentity) SetRegistration(v []BusinessIdentityRegistrationInner)`

SetRegistration sets Registration field to given value.

### HasRegistration

`func (o *BusinessIdentity) HasRegistration() bool`

HasRegistration returns a boolean if a field has been set.

### GetIncorporationCountry

`func (o *BusinessIdentity) GetIncorporationCountry() string`

GetIncorporationCountry returns the IncorporationCountry field if non-nil, zero value otherwise.

### GetIncorporationCountryOk

`func (o *BusinessIdentity) GetIncorporationCountryOk() (*string, bool)`

GetIncorporationCountryOk returns a tuple with the IncorporationCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncorporationCountry

`func (o *BusinessIdentity) SetIncorporationCountry(v string)`

SetIncorporationCountry sets IncorporationCountry field to given value.

### HasIncorporationCountry

`func (o *BusinessIdentity) HasIncorporationCountry() bool`

HasIncorporationCountry returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


