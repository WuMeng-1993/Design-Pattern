package com.wumeng.simplefactorymode;

/**
 * 加法运算
 */
public class OperationAdd extends Operation{

    @Override
    public double result() {
        return numberA + numberB;
    }

}
