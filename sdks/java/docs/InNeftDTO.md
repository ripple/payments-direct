

# InNeftDTO

Rails: NEFT (National Electronic Funds Transfer)  Rail Definitions:  NEFT: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day (by end of business day) - Cut-off time: 7:00 PM IST (varies by bank) - Banking holidays: India banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**ifscCode** | **String** | The 11-character IFSC code of the identity&#39;s bank branch |  |
|**accountNumber** | **String** | The identity&#39;s bank account number |  |



