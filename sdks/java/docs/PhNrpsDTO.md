

# PhNrpsDTO

Rails: InstaPay, PESONet  Rail Definitions:  InstaPay:   - Availability: 24/7/365   - Limit: PHP 1,000,000   - Settlement: Real-time (within 15 minutes)   - Cut-off time: None   - Banking holidays: Applicable  PESONet:   - Availability: Business days only   - Limit: No limit   - Settlement: Same-day or next business day   - Cut-off time: 2:00 PM PHT   - Banking holidays: Philippines banking holidays apply  Routing Evaluation Order: InstaPay > PESONet 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**swiftCode** | **String** | The SWIFT/BIC code of the beneficiary bank. Constrained to the SWIFT/BIC code list published on Ripple Docs. |  |
|**accountNumber** | **String** | The identity&#39;s bank account number |  |



