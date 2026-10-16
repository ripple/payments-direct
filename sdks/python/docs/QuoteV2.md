# QuoteV2


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
**payin_category** | **str** | The name of payin category specified in the quote request. | 
**adjusted_exchange_rate** | [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] 
**fees** | [**List[FeeSummaryV2]**](FeeSummaryV2.md) | A summary of fees included in this quote. | [optional] 
**taxes** | [**List[TaxSummary]**](TaxSummary.md) | A summary of taxes included in this quote. | [optional] 
**created_at** | **datetime** | The time when this quote was created, specified in UTC. | [optional] 
**expires_at** | **datetime** | The time when this quote expires, specified in UTC. | [optional] 
**payment_rail** | **str** | The payment rail used for this quote. | [optional] 

## Example

```python
from ripple_payments_direct.models.quote_v2 import QuoteV2

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteV2 from a JSON string
quote_v2_instance = QuoteV2.from_json(json)
# print the JSON string representation of the object
print(QuoteV2.to_json())

# convert the object into a dict
quote_v2_dict = quote_v2_instance.to_dict()
# create an instance of QuoteV2 from a dict
quote_v2_from_dict = QuoteV2.from_dict(quote_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


