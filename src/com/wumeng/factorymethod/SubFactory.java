package com.wumeng.factorymethod;

import com.wumeng.simplefactorymode.Operation;
import com.wumeng.simplefactorymode.OperationSub;

/**
 * 减法工厂类
 */
public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}
