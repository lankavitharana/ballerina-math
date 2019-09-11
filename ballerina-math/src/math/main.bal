import ballerina/io;
import ballerinax/java;

public function main() {
    int res = addInt(5, 10);
    io:println(res);
}


public function addInt(int a, int b) returns int = @java:Method {
    class:"org/wso2/ballerina/math/AddInt"
} external;

