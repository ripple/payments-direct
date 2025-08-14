# QuoteCollection


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote_collection_id** | **str** | Unique ID that represents this quote collection. | 
**quotes** | [**List[Quote]**](Quote.md) | List of quotes | 

## Example

```python
from ripple_payments_direct.models.quote_collection import QuoteCollection

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteCollection from a JSON string
quote_collection_instance = QuoteCollection.from_json(json)
# print the JSON string representation of the object
print(QuoteCollection.to_json())

# convert the object into a dict
quote_collection_dict = quote_collection_instance.to_dict()
# create an instance of QuoteCollection from a dict
quote_collection_from_dict = QuoteCollection.from_dict(quote_collection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


