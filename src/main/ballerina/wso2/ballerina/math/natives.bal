package wso2.ballerina.math;

import ballerina.doc;


@doc:Description { value:"Get the exp of provied float value"}
@doc:Param { value:"val: float value to get exp" }
@doc:Return { value:"float: exp value" }
native function exp (float val) (float);

@doc:Description { value:"Returns the value of the 'a' raised to the power of 'b'"}
@doc:Param { value:"a: the base value" }
@doc:Param { value:"b: the exponent value" }
@doc:Return { value:"float: result value" }
native function pow (float a, float b) (float);


@doc:Description { value:"Returns a random number between 0.0 and 1.0"}
@doc:Return { value:"float: random value" }
native function random () (float);