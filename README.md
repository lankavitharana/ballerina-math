# ballerina-math

This is a native function module for ballerina. Which you can use as a sample to build your own ballerina native functions.

## how to use?

This is currently depends on ballerina 0.981.0 release. 

 - Go to the project folder and build using "mvn clean install"
 
 - There will be a zip file and a jar file inside the target directory

 - Copy the jar file to BALLERINA_HOME/bre/lib folder
 
 - Extract the zip file and copy the content ("ballerina-math-0.981.0-SNAPSHOT-ballerina-binary-repo/repo" folder content)
 to BALLERINA_HOME/lib/repo directory

Then you can use functions in "wso2/math" package within your ballerina files.

Sample usage would be as follows (mathTest.bal)

```
import wso2/math;
import ballerina/io;

function main(string... args) {
        io:println(math:addInt(5, 6));
}


```

run this with `ballerina run --offline mathTest.bal`

