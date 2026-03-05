# IndividualIdentity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FirstName** | **string** | First name of the individual | 
**LastName** | **string** | Last name of the individual | 
**Address** | [**IndividualIdentityAddress**](IndividualIdentityAddress.md) |  | 
**Email** | Pointer to **string** | Address for electronic mail (e-mail). | [optional] 
**Phone** | Pointer to **string** | Phone Number | [optional] 
**IdentityDocuments** | Pointer to [**[]IndividualIdentityIdentityDocumentsInner**](IndividualIdentityIdentityDocumentsInner.md) | Gathers identifying documentation | [optional] 
**DateOfBirth** | Pointer to **string** | Date of Birth. | [optional] 
**CountryOfBirth** | Pointer to **string** | Country of Birth. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. | [optional] 
**Citizenship** | Pointer to **string** | Alpha-2 country code for the nationality of the individual in ISO 3166-1 format. | [optional] 
**Gender** | Pointer to **string** | Gender of the identity.  - &#x60;MALE&#x60; — Male identity   - &#x60;FEMALE&#x60; — Female identity   - &#x60;OTHER&#x60; — Other identity  | [optional] 

## Methods

### NewIndividualIdentity

`func NewIndividualIdentity(firstName string, lastName string, address IndividualIdentityAddress, ) *IndividualIdentity`

NewIndividualIdentity instantiates a new IndividualIdentity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIndividualIdentityWithDefaults

`func NewIndividualIdentityWithDefaults() *IndividualIdentity`

NewIndividualIdentityWithDefaults instantiates a new IndividualIdentity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFirstName

`func (o *IndividualIdentity) GetFirstName() string`

GetFirstName returns the FirstName field if non-nil, zero value otherwise.

### GetFirstNameOk

`func (o *IndividualIdentity) GetFirstNameOk() (*string, bool)`

GetFirstNameOk returns a tuple with the FirstName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstName

`func (o *IndividualIdentity) SetFirstName(v string)`

SetFirstName sets FirstName field to given value.


### GetLastName

`func (o *IndividualIdentity) GetLastName() string`

GetLastName returns the LastName field if non-nil, zero value otherwise.

### GetLastNameOk

`func (o *IndividualIdentity) GetLastNameOk() (*string, bool)`

GetLastNameOk returns a tuple with the LastName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastName

`func (o *IndividualIdentity) SetLastName(v string)`

SetLastName sets LastName field to given value.


### GetAddress

`func (o *IndividualIdentity) GetAddress() IndividualIdentityAddress`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *IndividualIdentity) GetAddressOk() (*IndividualIdentityAddress, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *IndividualIdentity) SetAddress(v IndividualIdentityAddress)`

SetAddress sets Address field to given value.


### GetEmail

`func (o *IndividualIdentity) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *IndividualIdentity) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *IndividualIdentity) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *IndividualIdentity) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetPhone

`func (o *IndividualIdentity) GetPhone() string`

GetPhone returns the Phone field if non-nil, zero value otherwise.

### GetPhoneOk

`func (o *IndividualIdentity) GetPhoneOk() (*string, bool)`

GetPhoneOk returns a tuple with the Phone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone

`func (o *IndividualIdentity) SetPhone(v string)`

SetPhone sets Phone field to given value.

### HasPhone

`func (o *IndividualIdentity) HasPhone() bool`

HasPhone returns a boolean if a field has been set.

### GetIdentityDocuments

`func (o *IndividualIdentity) GetIdentityDocuments() []IndividualIdentityIdentityDocumentsInner`

GetIdentityDocuments returns the IdentityDocuments field if non-nil, zero value otherwise.

### GetIdentityDocumentsOk

`func (o *IndividualIdentity) GetIdentityDocumentsOk() (*[]IndividualIdentityIdentityDocumentsInner, bool)`

GetIdentityDocumentsOk returns a tuple with the IdentityDocuments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityDocuments

`func (o *IndividualIdentity) SetIdentityDocuments(v []IndividualIdentityIdentityDocumentsInner)`

SetIdentityDocuments sets IdentityDocuments field to given value.

### HasIdentityDocuments

`func (o *IndividualIdentity) HasIdentityDocuments() bool`

HasIdentityDocuments returns a boolean if a field has been set.

### GetDateOfBirth

`func (o *IndividualIdentity) GetDateOfBirth() string`

GetDateOfBirth returns the DateOfBirth field if non-nil, zero value otherwise.

### GetDateOfBirthOk

`func (o *IndividualIdentity) GetDateOfBirthOk() (*string, bool)`

GetDateOfBirthOk returns a tuple with the DateOfBirth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateOfBirth

`func (o *IndividualIdentity) SetDateOfBirth(v string)`

SetDateOfBirth sets DateOfBirth field to given value.

### HasDateOfBirth

`func (o *IndividualIdentity) HasDateOfBirth() bool`

HasDateOfBirth returns a boolean if a field has been set.

### GetCountryOfBirth

`func (o *IndividualIdentity) GetCountryOfBirth() string`

GetCountryOfBirth returns the CountryOfBirth field if non-nil, zero value otherwise.

### GetCountryOfBirthOk

`func (o *IndividualIdentity) GetCountryOfBirthOk() (*string, bool)`

GetCountryOfBirthOk returns a tuple with the CountryOfBirth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryOfBirth

`func (o *IndividualIdentity) SetCountryOfBirth(v string)`

SetCountryOfBirth sets CountryOfBirth field to given value.

### HasCountryOfBirth

`func (o *IndividualIdentity) HasCountryOfBirth() bool`

HasCountryOfBirth returns a boolean if a field has been set.

### GetCitizenship

`func (o *IndividualIdentity) GetCitizenship() string`

GetCitizenship returns the Citizenship field if non-nil, zero value otherwise.

### GetCitizenshipOk

`func (o *IndividualIdentity) GetCitizenshipOk() (*string, bool)`

GetCitizenshipOk returns a tuple with the Citizenship field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCitizenship

`func (o *IndividualIdentity) SetCitizenship(v string)`

SetCitizenship sets Citizenship field to given value.

### HasCitizenship

`func (o *IndividualIdentity) HasCitizenship() bool`

HasCitizenship returns a boolean if a field has been set.

### GetGender

`func (o *IndividualIdentity) GetGender() string`

GetGender returns the Gender field if non-nil, zero value otherwise.

### GetGenderOk

`func (o *IndividualIdentity) GetGenderOk() (*string, bool)`

GetGenderOk returns a tuple with the Gender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGender

`func (o *IndividualIdentity) SetGender(v string)`

SetGender sets Gender field to given value.

### HasGender

`func (o *IndividualIdentity) HasGender() bool`

HasGender returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


