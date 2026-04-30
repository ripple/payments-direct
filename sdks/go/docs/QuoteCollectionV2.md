# QuoteCollectionV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuoteCollectionId** | **string** | Unique ID that represents this quote collection. | 
**Quotes** | [**[]QuoteV2**](QuoteV2.md) | List of quotes | 

## Methods

### NewQuoteCollectionV2

`func NewQuoteCollectionV2(quoteCollectionId string, quotes []QuoteV2, ) *QuoteCollectionV2`

NewQuoteCollectionV2 instantiates a new QuoteCollectionV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuoteCollectionV2WithDefaults

`func NewQuoteCollectionV2WithDefaults() *QuoteCollectionV2`

NewQuoteCollectionV2WithDefaults instantiates a new QuoteCollectionV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuoteCollectionId

`func (o *QuoteCollectionV2) GetQuoteCollectionId() string`

GetQuoteCollectionId returns the QuoteCollectionId field if non-nil, zero value otherwise.

### GetQuoteCollectionIdOk

`func (o *QuoteCollectionV2) GetQuoteCollectionIdOk() (*string, bool)`

GetQuoteCollectionIdOk returns a tuple with the QuoteCollectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteCollectionId

`func (o *QuoteCollectionV2) SetQuoteCollectionId(v string)`

SetQuoteCollectionId sets QuoteCollectionId field to given value.


### GetQuotes

`func (o *QuoteCollectionV2) GetQuotes() []QuoteV2`

GetQuotes returns the Quotes field if non-nil, zero value otherwise.

### GetQuotesOk

`func (o *QuoteCollectionV2) GetQuotesOk() (*[]QuoteV2, bool)`

GetQuotesOk returns a tuple with the Quotes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuotes

`func (o *QuoteCollectionV2) SetQuotes(v []QuoteV2)`

SetQuotes sets Quotes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


