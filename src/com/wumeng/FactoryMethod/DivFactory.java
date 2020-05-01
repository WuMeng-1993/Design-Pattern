package com.wumeng.FactoryMethod;

import com.wumeng.SimpleFactoryMode.Operation;
import com.wumeng.SimpleFactoryMode.OperationDiv;

/**
 * 乘法工厂类
 */
public class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}
