# Page

Specify page size and the ID of the last fetched result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size** | **int** | Size of the page | [optional] [default to 20]
**last_page_token** | **str** | The unique reference ID of the last fetched item. To retrieve subsequent item(s) if any, specify this value as the value of the &#x60;Page.list&#x60; field in the  &#x60;POST /payments/filter&#x60; operation request body. | [optional] 

## Example

```python
from ripple_payments_direct.models.page import Page

# TODO update the JSON string below
json = "{}"
# create an instance of Page from a JSON string
page_instance = Page.from_json(json)
# print the JSON string representation of the object
print(Page.to_json())

# convert the object into a dict
page_dict = page_instance.to_dict()
# create an instance of Page from a dict
page_from_dict = Page.from_dict(page_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


