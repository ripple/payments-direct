

# AuNppDTO

Rails: NPP (New Payments Platform), Direct Entry (DE/BECS)  Rail Definitions:  NPP: - Availability: 24/7/365 - Limit: AUD 20,000 per transaction (higher with arrangement) - Settlement: Real-time (within 15 minutes) - Cut-off time: None - Banking holidays: Not applicable  Direct Entry (BECS): - Availability: Business days only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: Bank-dependent - Banking holidays: Australian banking holidays apply  Routing Evaluation Order:   1. NPP      - Conditions: beneficiary account is NPP-addressable AND amount ≤ AUD 20,000   2. Direct Entry      - Conditions: otherwise applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**bsbCode** | **String** | The 6-digit Bank-State-Branch (BSB) routing code |  |
|**accountNumber** | **String** | The identity&#39;s bank account number |  |



