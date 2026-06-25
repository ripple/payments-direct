# CnCfxps

Rails: CFXPS (Cross-border Foreign Exchange Payment System)  Rail Definitions:  CFXPS: - Availability: Business days and banking hours only - Limit: No limit (institutional) - Settlement: Same-day or next business day - Cut-off time: 5:00 PM CST (varies by bank) - Banking holidays: China banking holidays apply 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | Beneficiary Bank Name. Looked up from swiftCode. | 
**swift_code** | **str** | Beneficiary Bank SWIFT/BIC Code. ~67 proprietary SWIFT codes (e.g., ICBKCNBJXXX, BKCHCNBJXXX, CMBCCNBSXXX). | 
**account_number** | **str** | Beneficiary Account Number. | 
**account_holder_name** | **str** | Beneficiary Account Holder Name (English). | 

## Example

```python
from ripple_payments_direct.models.cn_cfxps import CnCfxps

# TODO update the JSON string below
json = "{}"
# create an instance of CnCfxps from a JSON string
cn_cfxps_instance = CnCfxps.from_json(json)
# print the JSON string representation of the object
print(CnCfxps.to_json())

# convert the object into a dict
cn_cfxps_dict = cn_cfxps_instance.to_dict()
# create an instance of CnCfxps from a dict
cn_cfxps_from_dict = CnCfxps.from_dict(cn_cfxps_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


