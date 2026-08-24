

# ArInterbankingDTO

Rails: Interbanking  Rail Definitions:  Interbanking: - Availability: Business days only - Limit: ARS 10,000,000 - Settlement: Same-day or next business day - Cut-off time: 3:00 PM ART - Banking holidays: Argentina banking holidays apply  Routing Evaluation Order: AR_INTERBANKING has a single payment rail; no routing evaluation order applies. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank. Must begin and end with a letter or digit, and consecutive identical punctuation characters are not permitted. |  |
|**bankCode** | **String** | BCRA-assigned 3-digit Argentine bank code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. |  |
|**accountNumber** | **String** | The identity&#39;s account number (CBU or CVU) |  |
|**accountType** | **String** | The identity&#39;s account type |  |



