# PayoutExecutionDetails

Metadata about the payout execution, including the payment rail used, timing, and tracking references.  `payoutExecutionDetails` is an optional field that should be treated as informational only. Do not build required workflows that depend on its presence, as availability varies by corridor and partner.  When present, `trackingReferences` provides network-specific identifiers useful for audit, reconciliation, or customer inquiry resolution. Use the `referenceType` field on each tracking reference to identify what a value represents rather than relying on its position in the array.  Coverage will expand as additional corridors and partners are onboarded. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payment_rail_used** | **str** | The payment rail or network used to execute the payout (e.g., FEDWIRE, ACH, RTP, SEPA).  | [optional] 
**payout_start_time** | **datetime** | The time at which the payout execution started, specified in UTC.  | [optional] 
**payout_end_time** | **datetime** | The timestamp when the payout execution completed or was last updated, as reported by the payout partner. Specified in UTC using ISO 8601 format. For in-progress payouts, this may represent the last status update time.  | [optional] 
**tracking_references** | [**List[TrackingReference]**](TrackingReference.md) | A list of tracking references for this transaction, such as transaction IDs and confirmation numbers.  | [optional] 

## Example

```python
from ripple_payments_direct.models.payout_execution_details import PayoutExecutionDetails

# TODO update the JSON string below
json = "{}"
# create an instance of PayoutExecutionDetails from a JSON string
payout_execution_details_instance = PayoutExecutionDetails.from_json(json)
# print the JSON string representation of the object
print(PayoutExecutionDetails.to_json())

# convert the object into a dict
payout_execution_details_dict = payout_execution_details_instance.to_dict()
# create an instance of PayoutExecutionDetails from a dict
payout_execution_details_from_dict = PayoutExecutionDetails.from_dict(payout_execution_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


