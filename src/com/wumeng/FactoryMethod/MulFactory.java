package com.wumeng.FactoryMethod;

import com.wumeng.SimpleFactoryMode.Operation;
import com.wumeng.SimpleFactoryMode.OperationMul;

/**
 * 乘法工厂类
 */
public class MulFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}
