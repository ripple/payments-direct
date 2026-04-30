# PaymentRailObjects


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**us_ach** | [**UsAch**](UsAch.md) |  | [optional] 
**us_fedwire** | [**UsFedwire**](UsFedwire.md) |  | [optional] 
**mx_spei** | [**MxSpei**](MxSpei.md) |  | [optional] 
**eu_sepa** | [**EuSepa**](EuSepa.md) |  | [optional] 
**gb_fps** | [**GbFps**](GbFps.md) |  | [optional] 
**ng_bank_payout** | [**NgBankPayout**](NgBankPayout.md) |  | [optional] 
**br_pix** | [**BrPix**](BrPix.md) |  | [optional] 
**co_pse** | [**CoPse**](CoPse.md) |  | [optional] 
**br_ted** | [**BrTed**](BrTed.md) |  | [optional] 
**ca_eft** | [**CaEft**](CaEft.md) |  | [optional] 

## Example

```python
from ripple_payments_direct.models.payment_rail_objects import PaymentRailObjects

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentRailObjects from a JSON string
payment_rail_objects_instance = PaymentRailObjects.from_json(json)
# print the JSON string representation of the object
print(PaymentRailObjects.to_json())

# convert the object into a dict
payment_rail_objects_dict = payment_rail_objects_instance.to_dict()
# create an instance of PaymentRailObjects from a dict
payment_rail_objects_from_dict = PaymentRailObjects.from_dict(payment_rail_objects_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


