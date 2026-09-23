

# NgBankPayoutDTO

Rails: Bank Payout  Rail Definitions:  Bank Payout: - Availability: Country-dependant - Limit: - Nigeria: ₦5,000,000 - Settlement: Real time to 48 hours - Cut-off time: Real time - Banking holidays: Nigeria banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**bankCode** | **String** | Ripple Bank Code (RBC) for the destination bank in Nigeria. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. |  |
|**accountNumber** | **String** | The identity&#39;s account number associated with the Account Identification Scheme |  |



