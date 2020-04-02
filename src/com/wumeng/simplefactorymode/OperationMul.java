package com.wumeng.simplefactorymode;

/**
 * 乘法
 */
public class OperationMul extends Operation {

    @Override
    public double result() {
        return numberA * numberB;
    }

}
