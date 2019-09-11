import ballerina/io;
import ballerinax/java;

public function main() {
    // Invoking a simple method
    int res = addInt(5, 10);
    io:println(res);

    // Creating instance
    handle sub = newSubstract(10);

    // Invoking a instance method
    int subRes = substract(sub, 5);
    io:println(subRes);

}


public function addInt(int a, int b) returns int = @java:Method {
    class:"org/wso2/ballerina/math/AddInt"
} external;


public function newSubstract(int initial) returns handle = @java:Constructor {
    class:"org/wso2/ballerina/math/Substract"
} external;

public function substract(handle receiver, int b) returns int = @java:Method{
    class:"org/wso2/ballerina/math/Substract",
    name:"substractInt"
} external;

