# Getting Started

### Purpose
This project has the main goal to have nice and well-defined logs on Datadog

### Requirements
* Java 8
* Gradle 6.8
* DataDog account
* AWS Lambda created with AWS_LAMBDA_FUNCTION_NAME
* AWS CLI
* NPM

### Defining some variables
#### AWS Credentials
```
export AWS_ACCESS_KEY_ID=<AWS Access Key ID>
export AWS_SECRET_ACCESS_KEY=<AWS Secret Access Key>
export AWS_DEFAULT_REGION=<AWS region>
export AWS_LAMBDA_FUNCTION_NAME=<Lambda function name>
```

#### Datadog Credentials
```
export DATADOG_SITE=<DD site. E.q.: datadoghq.eu or datadoghq.com>
export DATADOG_API_KEY=<DD API key>
```

### Building and Deploying
```
gradle clean build;
aws lambda update-function-code --function-name ${AWS_LAMBDA_FUNCTION_NAME} --zip-file fileb://build/libs/logapp-2.0.0.RELEASE-aws.jar;
```

### Defining the function Handler on AWS:
``com.dias.logapp.invoke.CustomFunctionInvoker::handleRequest
``


### Install the Datadog CLI with NPM
This process is required only once
```
npm install -g @datadog/datadog-ci
```

### Instrument your Lambda Functions
This process is required only once
```
datadog-ci lambda instrument -i
```

### PS
After the instrumentation, on the AWS console, add the following environment variable:
Key: ``JAVA_TOOL_OPTIONS`` <br>
Value: ``-javaagent:"/opt/java/lib/dd-java-agent.jar" -XX:+TieredCompilation -XX:TieredStopAtLevel=1 ``
