# Python 3 Payment Workflow Examples

This directory contains the Basic Payment Workflow.

## Prerequisites

1. Python 3.9 or higher
2. Valid Ripple API credentials
3. Ripple Payments Direct SDK installed locally

### Installing the SDK locally

Before running the examples, you need to install the Ripple Payments Direct SDK to your local system. Go to specific git tag and follow below:

```bash
# From the repository root
cd sdks/python
pip install .
```

This will build and install the SDK (ripple-payments-direct-\<version\>) locally. The version depends on which git tag was used to download the sdks.

## Configuration

The payment_workflow.py file has few variables that are needed to be setup. For further support, consult the docs or reach out to your Ripple Customer-Partner-Engineer contact.

```
client_id
client_secret
base_url
tenant_id
```

## Create virtual environment and use sdk dependency

Follow below to create a virtual environment:

```bash
cd examples/python
python -m venv venv1
source venv1/bin/activate
pip install -r requirements.txt
```

The sdk dependency is provided in the requirements.txt file.

## Running the Examples

python payment_workflow.py