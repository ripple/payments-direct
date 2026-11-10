# QuoteCollection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuoteCollectionId** | **string** | Unique ID that represents this quote collection. | 
**Quotes** | [**[]Quote**](Quote.md) | List of quotes | 

## Methods

### NewQuoteCollection

`func NewQuoteCollection(quoteCollectionId string, quotes []Quote, ) *QuoteCollection`

NewQuoteCollection instantiates a new QuoteCollection object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuoteCollectionWithDefaults

`func NewQuoteCollectionWithDefaults() *QuoteCollection`

NewQuoteCollectionWithDefaults instantiates a new QuoteCollection object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuoteCollectionId

`func (o *QuoteCollection) GetQuoteCollectionId() string`

GetQuoteCollectionId returns the QuoteCollectionId field if non-nil, zero value otherwise.

### GetQuoteCollectionIdOk

`func (o *QuoteCollection) GetQuoteCollectionIdOk() (*string, bool)`

GetQuoteCollectionIdOk returns a tuple with the QuoteCollectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteCollectionId

`func (o *QuoteCollection) SetQuoteCollectionId(v string)`

SetQuoteCollectionId sets QuoteCollectionId field to given value.


### GetQuotes

`func (o *QuoteCollection) GetQuotes() []Quote`

GetQuotes returns the Quotes field if non-nil, zero value otherwise.

### GetQuotesOk

`func (o *QuoteCollection) GetQuotesOk() (*[]Quote, bool)`

GetQuotesOk returns a tuple with the Quotes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuotes

`func (o *QuoteCollection) SetQuotes(v []Quote)`

SetQuotes sets Quotes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


