package com.wumeng.FactoryMethod;

import com.wumeng.SimpleFactoryMode.Operation;
import com.wumeng.SimpleFactoryMode.OperationSub;

/**
 * 减法工厂类
 */
public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}
