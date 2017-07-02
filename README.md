# ballerina-math

This is a native function module for ballerina. Which you can use as a sample to build your own ballerina native functions.

## how to use?

This is currently depends on ballerina 0.89 release. Since ballerina jars are not yet available in nexus, you'll have to build "ballerina-parent" "v0.89" tag and "ballerina" "v0.89" tags locally before building this sample.(this is a temporary solution)

 - Go to the project folder and buil using "mvn clean install"

 - Copy the jar file to BALLERINA_HOME/bre/lib folder

Then you can use functions in "wso2.ballerina.math" package within your ballerina files.

Sample usage would be as follows

```
import ballerina.lang.system;
import wso2.ballerina.math;

function main (string[] args) {
        float a = 2;
        float b = math:exp(a);
        float c = 2.0;
        float d = 2.0;
        float e = math:pow(c,d);
        float f = math:random();
        system:println(b);
        system:println(e);
        system:println(f);

}

```

