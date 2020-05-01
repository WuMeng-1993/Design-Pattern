package com.wumeng.SimpleFactoryMode;

/**
 * 减法
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
        return numberA - numberB;
    }

}
