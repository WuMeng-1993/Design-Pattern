package com.wumeng.factorymethod;

import com.wumeng.simplefactorymode.Operation;
import com.wumeng.simplefactorymode.OperationMul;

/**
 * 乘法工厂类
 */
public class MulFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}
