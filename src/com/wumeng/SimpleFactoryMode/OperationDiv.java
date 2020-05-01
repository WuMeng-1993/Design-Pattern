package com.wumeng.SimpleFactoryMode;

/**
 * 除法
 */
public class OperationDiv extends Operation {

    @Override
    public double result() {
        if (numberB == 0) {
            throw new RuntimeException("divided by 0");
        }
        return numberA / numberB;
    }

}
