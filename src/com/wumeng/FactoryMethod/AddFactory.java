package com.wumeng.FactoryMethod;

import com.wumeng.SimpleFactoryMode.Operation;
import com.wumeng.SimpleFactoryMode.OperationAdd;

/**
 * 加法工厂类
 */
class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}
