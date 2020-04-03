package com.wumeng.factorymethod;

import com.wumeng.simplefactorymode.Operation;
import com.wumeng.simplefactorymode.OperationPower;

/**
 * 新增加求次方
 */
public class PowerFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationPower();
    }
}
