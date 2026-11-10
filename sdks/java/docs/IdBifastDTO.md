

# IdBifastDTO

Rails: BI-FAST  Rail Definitions:  BI-FAST: - Availability: 24/7/365 - Limit: IDR 100,000,000 per transaction - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**bankBranchCity** | **String** | The city of the identity&#39;s bank branch. Optional on every bank payout corridor and not enforced by the API. If your organization works with Ripple&#39;s Australian entity, supply it on every financial instrument you create, whatever the destination corridor. Omitting it does not return an error. However, a value that does not match the permitted characters, or exceeds 50 characters, fails financial instrument create and update with 400 Bad Request (USR_109). An update replaces the stored financial instrument, so include this field in every update, not only at creation.  |  [optional] |
|**bankCode** | **String** | Legacy Bank Indonesia-assigned domestic clearing code or Ripple Bank Code (RBC) for the destination bank in Indonesia. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. |  |
|**accountNumber** | **String** | The identity&#39;s bank account number |  |



