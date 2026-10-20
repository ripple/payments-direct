# QuoteCollectionRequestV2

Request to create a quote collection with `POST /v3/quotes/quote-collection`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote_amount** | **float** | The amount for which you wish to receive a collection of quotes. | 
**quote_amount_type** | [**QuoteAmountType**](QuoteAmountType.md) |  | [default to QuoteAmountType.SOURCE_AMOUNT]
**source_currency** | **str** | The currency code of the currency that you are sending. | 
**destination_currency** | **str** | The currency code of the currency in which your beneficiary will receive this payment. | 
**source_country** | **str** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. | [optional] 
**destination_country** | **str** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their country of incorporation.  Required for a fiat payout; omitting it returns &#x60;USR_017&#x60;. Omit it for a stablecoin payout, or the request fails.  | [optional] 
**payin_category** | **str** | The name of the pay in category indicating how this payment will be funded. | 
**payment_rail** | **str** | The payment rail to quote. Include it to request a quote for this payment rail only. If you omit it, the collection contains a quote for each payment rail available for the corridor. For valid values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference).  | [optional] 

## Example

```python
from ripple_payments_direct.models.quote_collection_request_v2 import QuoteCollectionRequestV2

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteCollectionRequestV2 from a JSON string
quote_collection_request_v2_instance = QuoteCollectionRequestV2.from_json(json)
# print the JSON string representation of the object
print(QuoteCollectionRequestV2.to_json())

# convert the object into a dict
quote_collection_request_v2_dict = quote_collection_request_v2_instance.to_dict()
# create an instance of QuoteCollectionRequestV2 from a dict
quote_collection_request_v2_from_dict = QuoteCollectionRequestV2.from_dict(quote_collection_request_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


