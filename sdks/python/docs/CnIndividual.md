# CnIndividual

Rails: CUP (China UnionPay), CNAPS  Rail Definitions:  CUP (China UnionPay): - Availability: 24/7/365 - Limit: Varies by bank and account type - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable  CNAPS: - Availability: Business days and banking hours only (HVPS); batch throughout day (BEPS) - Limit: No limit (HVPS); CNY 30,000 limit to individuals; - Settlement: Same-day (HVPS real-time gross; BEPS batched) - Cut-off time: 5:00 PM CST (varies by bank) - Banking holidays: China banking holidays apply  Routing Evaluation Order: Determined at runtime. CUP is the primary rail for card-based account routing. CNAPS may be used for bank account routing depending on account type. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | Beneficiary Bank Name in English. Published list available at docs.ripple.com. | 
**bank_code** | **str** | Beneficiary Bank Code. Published bank code list at docs.ripple.com. | 
**account_number** | **str** | Beneficiary Account Number. | 

## Example

```python
from ripple_payments_direct.models.cn_individual import CnIndividual

# TODO update the JSON string below
json = "{}"
# create an instance of CnIndividual from a JSON string
cn_individual_instance = CnIndividual.from_json(json)
# print the JSON string representation of the object
print(CnIndividual.to_json())

# convert the object into a dict
cn_individual_dict = cn_individual_instance.to_dict()
# create an instance of CnIndividual from a dict
cn_individual_from_dict = CnIndividual.from_dict(cn_individual_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


