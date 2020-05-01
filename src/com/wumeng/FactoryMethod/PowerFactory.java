package com.wumeng.FactoryMethod;

import com.wumeng.SimpleFactoryMode.Operation;
import com.wumeng.SimpleFactoryMode.OperationPower;

/**
 * 新增加求次方
 */
public class PowerFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationPower();
    }
}
