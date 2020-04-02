package com.wumeng.simplefactorymode;

public class Calculator {

    public static void main(String[] args) {
        Operation operation;
        char operator;

        operator = '+';
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 10;
        operation.numberB = 100;

        System.out.println(operation.result());
    }

}
