/*
*   Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.ballerina.math;

import org.ballerinalang.bre.Context;
import org.ballerinalang.bre.bvm.BlockingNativeCallableUnit;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.values.BInteger;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.natives.annotations.ReturnType;

/**
 * Native function wso2.ballerina.math:addInt.
 */
@BallerinaFunction(
        orgName = "wso2",
        packageName = "math:0.0.0",
        functionName = "addInt",
        args = {@Argument(name = "a", type = TypeKind.INT),
                @Argument(name = "b", type = TypeKind.INT)},
        returnType = {@ReturnType(type = TypeKind.INT)},
        isPublic = true
)
public class AddInt extends BlockingNativeCallableUnit {

    @Override
    public void execute(Context context) {
        System.out.println("**** Method addInt called ****");
        long a = context.getIntArgument(0);
        long b = context.getIntArgument(1);
        BInteger result = new BInteger(a + b);
        context.setReturnValues(result);
    }
}