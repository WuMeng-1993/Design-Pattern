package com.wumeng.SimpleFactoryMode;

/**
 * 增加求次方
 */
public class OperationPower extends Operation {

    @Override
    public double result() {
        return Math.pow(numberA,numberB);
    }

}
