# QuoteCollectionRequest

Request to create a quote collection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote_amount** | **float** | The amount for which you wish to receive a collection of quotes. | 
**quote_amount_type** | [**QuoteAmountType**](QuoteAmountType.md) |  | [default to QuoteAmountType.SOURCE_AMOUNT]
**source_currency** | **str** | The currency code of the currency that you are sending. | 
**destination_currency** | **str** | The currency code of the currency in which your beneficiary will receive this payment. | 
**source_country** | **str** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. | [optional] 
**destination_country** | **str** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. | [optional] 
**payout_category** | **str** | The name of the payout category. | 
**payin_category** | **str** | The name of the pay in category indicating how this payment will be funded. | 
**destination_blockchain_network** | **str** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] 

## Example

```python
from ripple_payments_direct.models.quote_collection_request import QuoteCollectionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteCollectionRequest from a JSON string
quote_collection_request_instance = QuoteCollectionRequest.from_json(json)
# print the JSON string representation of the object
print(QuoteCollectionRequest.to_json())

# convert the object into a dict
quote_collection_request_dict = quote_collection_request_instance.to_dict()
# create an instance of QuoteCollectionRequest from a dict
quote_collection_request_from_dict = QuoteCollectionRequest.from_dict(quote_collection_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


