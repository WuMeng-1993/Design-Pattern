package com.wumeng.factorymethod;

import com.wumeng.simplefactorymode.Operation;
import com.wumeng.simplefactorymode.OperationAdd;

/**
 * 加法工厂类
 */
class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
