# Java 17 Payment Workflow Examples

This directory contains the Basic Payment Workflow.

## Prerequisites

1. Java 17 or higher
2. Maven 3.6+
3. Valid Ripple API credentials
4. Ripple Payments Direct SDK installed locally

### Installing the SDK locally

Before running the examples, you need to install the Ripple Payments Direct SDK to your local Maven repository. Go to specific git tag and follow below:

```bash
# From the repository root
cd sdks/java
mvn clean install
```

This will build and install the SDK (payments-direct-client-<version>.jar) to your local Maven repository. The version depends on which git tag was used to download the sdks.

## Configuration

The PaymentWorkflow class has few variables that are needed to be setup. For further support, consult the docs or reach out to your Ripple Customer-Partner-Engineer contact.

```
clientId
clientSecret
baseUrl
tenantId
```

## Compilation

To compile the examples:

```bash
cd examples/java
mvn -B clean compile
```

Make sure the pom.xml has the correct version for payments-direct-client, which was installed above.

## Running the Examples

mvn exec:java