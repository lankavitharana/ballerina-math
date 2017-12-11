# ballerina-math

This is a native function module for ballerina. Which you can use as a sample to build your own ballerina native functions.

## how to use?

This is currently depends on ballerina 0.89 release. Since ballerina jars are not yet available in nexus, you'll have to build "ballerina-parent" "v0.89" tag and "ballerina" "v0.89" tags locally before building this sample.(this is a temporary solution)

 - Go to the project folder and build using "mvn clean install"

 - Copy the jar file to BALLERINA_HOME/bre/lib folder

Then you can use functions in "wso2.sample.math" package within your ballerina files.

Sample usage would be as follows

```
import wso2.sample.math;

function main (string[] args) {
    int a = 8;
    int b = math:nextInt(a);
    println(b);
}

```

