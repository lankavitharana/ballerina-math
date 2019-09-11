# ballerina-math

This is a interop function example module for ballerina. Which you can use as a sample to build your own ballerina interop functions.

## how to use?

This is currently depends on ballerina 1.0.0 release. 

 - Go to the `native-math` folder inside project folder and build using "mvn clean install"
 
 - Above will create the native jar file with relevant method class included

 - Then go to the `ballerina-math` folder inside the project folder and do `ballerina build -a`

 - Above command will create the final uber jar inside `ballerina-math/target/bin/math.jar
 
 - You can run the above jar either as a standalone jar (java -jar target/bin/math.jar) or using the ballerina command itself (ballerina run target/bin/math.jar)
 
 Note that you should have ballerina 1.0.0 version installed get this compiled and running


