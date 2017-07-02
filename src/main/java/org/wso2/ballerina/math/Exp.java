/*
*   Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
import org.ballerinalang.model.types.SimpleTypeName;
import org.ballerinalang.model.types.TypeEnum;
import org.ballerinalang.model.values.BFloat;
import org.ballerinalang.model.values.BValue;
import org.ballerinalang.natives.AbstractNativeFunction;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.natives.annotations.ReturnType;
import org.ballerinalang.natives.exceptions.ArgumentOutOfRangeException;

import javax.websocket.OnError;

/**
 * Native function wso2.ballerina.math:exp.
 */
@BallerinaFunction(
        packageName = "wso2.ballerina.math",
        functionName = "exp",
        args = {@Argument(name = "val", type = TypeEnum.FLOAT)},
        returnType = {@ReturnType(type = TypeEnum.FLOAT)},
        isPublic = true
)
public class Exp extends AbstractNativeFunction {
    private SimpleTypeName[] argTypeNamesTemp;

    public BValue[] execute(Context ctx) {
        double value = getDoubleArgumentTemp(ctx, 0);
        return getBValues(new BFloat(Math.exp(value)));
    }

    public double getDoubleArgumentTemp(Context context, int index) {
        if (index > -1 && index < this.argTypeNamesTemp.length) {
            return context.getControlStackNew().getCurrentFrame().getDoubleLocalVars()[index];
        } else {
            throw new ArgumentOutOfRangeException(index);
        }
    }

    @OnError
    public void setArgTypeNames(SimpleTypeName[] argTypes) {
        this.argTypeNamesTemp = argTypes;
    }

    @OnError
    public SimpleTypeName[] getArgumentTypeNames() {
        return this.argTypeNamesTemp;
    }
}
