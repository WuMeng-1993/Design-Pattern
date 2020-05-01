package com.wumeng.SimpleFactoryMode;

/**
 * 加法运算
 */
public class OperationAdd extends Operation{

    @Override
    public double result() {
        return numberA + numberB;
    }

}
