package com.wumeng.factorymethod;

import com.wumeng.simplefactorymode.Operation;
import com.wumeng.simplefactorymode.OperationDiv;

/**
 * 乘法工厂类
 */
public class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}
