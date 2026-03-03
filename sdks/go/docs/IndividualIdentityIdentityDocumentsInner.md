# IndividualIdentityIdentityDocumentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNumber** | **string** | Identification Number. | 
**IdType** | **string** | The type of identification document used to identify the identity.  - &#x60;ALIEN_REGISTRATION&#x60; — Alien Registration Number   - &#x60;CUSTOMER_ID&#x60; — Customer Identification Number   - &#x60;DRIVERS_LICENSE&#x60; — Driver’s License Number   - &#x60;PASSPORT&#x60; — Passport Number   - &#x60;EMPLOYEE_ID&#x60; — Employee ID   - &#x60;NATIONAL_ID_NUMBER&#x60; — National ID   - &#x60;SSN&#x60; — Social Security Number   - &#x60;TAX_ID&#x60; — Tax ID  | 

## Methods

### NewIndividualIdentityIdentityDocumentsInner

`func NewIndividualIdentityIdentityDocumentsInner(idNumber string, idType string, ) *IndividualIdentityIdentityDocumentsInner`

NewIndividualIdentityIdentityDocumentsInner instantiates a new IndividualIdentityIdentityDocumentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIndividualIdentityIdentityDocumentsInnerWithDefaults

`func NewIndividualIdentityIdentityDocumentsInnerWithDefaults() *IndividualIdentityIdentityDocumentsInner`

NewIndividualIdentityIdentityDocumentsInnerWithDefaults instantiates a new IndividualIdentityIdentityDocumentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIdNumber

`func (o *IndividualIdentityIdentityDocumentsInner) GetIdNumber() string`

GetIdNumber returns the IdNumber field if non-nil, zero value otherwise.

### GetIdNumberOk

`func (o *IndividualIdentityIdentityDocumentsInner) GetIdNumberOk() (*string, bool)`

GetIdNumberOk returns a tuple with the IdNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdNumber

`func (o *IndividualIdentityIdentityDocumentsInner) SetIdNumber(v string)`

SetIdNumber sets IdNumber field to given value.


### GetIdType

`func (o *IndividualIdentityIdentityDocumentsInner) GetIdType() string`

GetIdType returns the IdType field if non-nil, zero value otherwise.

### GetIdTypeOk

`func (o *IndividualIdentityIdentityDocumentsInner) GetIdTypeOk() (*string, bool)`

GetIdTypeOk returns a tuple with the IdType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdType

`func (o *IndividualIdentityIdentityDocumentsInner) SetIdType(v string)`

SetIdType sets IdType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


