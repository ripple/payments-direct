# Quote


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote_id** | **str** | Unique ID that represents this quote. | 
**quote_status** | [**QuoteStatus**](QuoteStatus.md) |  | 
**quote_amount_type** | [**QuoteAmountType**](QuoteAmountType.md) |  | [optional] [default to QuoteAmountType.SOURCE_AMOUNT]
**source_amount** | **float** | Amount to be sent by the originator. | [optional] 
**destination_amount** | **float** | Amount to be received by destination | [optional] 
**source_currency** | **str** | The currency code of the currency that you are sending. | 
**destination_currency** | **str** | The currency code of the currency in which your beneficiary will receive this payment. | 
**source_country** | **str** | The country where the payment originator is located or incorporated, specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. | [optional] 
**destination_country** | **str** | The country code to which you wish to send the funds. It follows ISO 3166-1 alpha-2 code | [optional] 
**payout_category** | **str** | Name of the payout category specified in the quote request. | 
**payin_category** | **str** | The name of payin category specified in the quote request. | 
**adjusted_exchange_rate** | [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] 
**fees** | [**List[FeeSummary]**](FeeSummary.md) | A summary of fees included in this quote. | [optional] 
**created_at** | **datetime** | The time when this quote was created, specified in UTC. | [optional] 
**expires_at** | **datetime** | The time when this quote expires, specified in UTC. | [optional] 
**destination_blockchain_network** | **str** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] 

## Example

```python
from ripple_payments_direct.models.quote import Quote

# TODO update the JSON string below
json = "{}"
# create an instance of Quote from a JSON string
quote_instance = Quote.from_json(json)
# print the JSON string representation of the object
print(Quote.to_json())

# convert the object into a dict
quote_dict = quote_instance.to_dict()
# create an instance of Quote from a dict
quote_from_dict = Quote.from_dict(quote_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


