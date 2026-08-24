# IndividualIdentityAddress

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StreetAddress** | **[]string** | Allows the street address of the individual to be held | 
**Country** | **string** | Allows the Country of the individual to be held. Use Alpha-2 Code as defined in the [ISO CountryCode ISO 3166-1](https://www.iso.org/obp/ui/#search) list. | 
**City** | **string** | City | 
**StateOrProvince** | **string** | Information that locates and identifies the state / county for the party, as defined by postal services | 
**PostalCode** | **string** | Postal code for the individual&#39;s address | 

## Methods

### NewIndividualIdentityAddress

`func NewIndividualIdentityAddress(streetAddress []string, country string, city string, stateOrProvince string, postalCode string, ) *IndividualIdentityAddress`

NewIndividualIdentityAddress instantiates a new IndividualIdentityAddress object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIndividualIdentityAddressWithDefaults

`func NewIndividualIdentityAddressWithDefaults() *IndividualIdentityAddress`

NewIndividualIdentityAddressWithDefaults instantiates a new IndividualIdentityAddress object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStreetAddress

`func (o *IndividualIdentityAddress) GetStreetAddress() []string`

GetStreetAddress returns the StreetAddress field if non-nil, zero value otherwise.

### GetStreetAddressOk

`func (o *IndividualIdentityAddress) GetStreetAddressOk() (*[]string, bool)`

GetStreetAddressOk returns a tuple with the StreetAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreetAddress

`func (o *IndividualIdentityAddress) SetStreetAddress(v []string)`

SetStreetAddress sets StreetAddress field to given value.


### GetCountry

`func (o *IndividualIdentityAddress) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *IndividualIdentityAddress) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *IndividualIdentityAddress) SetCountry(v string)`

SetCountry sets Country field to given value.


### GetCity

`func (o *IndividualIdentityAddress) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *IndividualIdentityAddress) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *IndividualIdentityAddress) SetCity(v string)`

SetCity sets City field to given value.


### GetStateOrProvince

`func (o *IndividualIdentityAddress) GetStateOrProvince() string`

GetStateOrProvince returns the StateOrProvince field if non-nil, zero value otherwise.

### GetStateOrProvinceOk

`func (o *IndividualIdentityAddress) GetStateOrProvinceOk() (*string, bool)`

GetStateOrProvinceOk returns a tuple with the StateOrProvince field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStateOrProvince

`func (o *IndividualIdentityAddress) SetStateOrProvince(v string)`

SetStateOrProvince sets StateOrProvince field to given value.


### GetPostalCode

`func (o *IndividualIdentityAddress) GetPostalCode() string`

GetPostalCode returns the PostalCode field if non-nil, zero value otherwise.

### GetPostalCodeOk

`func (o *IndividualIdentityAddress) GetPostalCodeOk() (*string, bool)`

GetPostalCodeOk returns a tuple with the PostalCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostalCode

`func (o *IndividualIdentityAddress) SetPostalCode(v string)`

SetPostalCode sets PostalCode field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


