# QuoteCollectionV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote_collection_id** | **str** | Unique ID that represents this quote collection. | 
**quotes** | [**List[QuoteV2]**](QuoteV2.md) | List of quotes | 

## Example

```python
from ripple_payments_direct.models.quote_collection_v2 import QuoteCollectionV2

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteCollectionV2 from a JSON string
quote_collection_v2_instance = QuoteCollectionV2.from_json(json)
# print the JSON string representation of the object
print(QuoteCollectionV2.to_json())

# convert the object into a dict
quote_collection_v2_dict = quote_collection_v2_instance.to_dict()
# create an instance of QuoteCollectionV2 from a dict
quote_collection_v2_from_dict = QuoteCollectionV2.from_dict(quote_collection_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


