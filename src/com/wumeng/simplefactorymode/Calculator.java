package com.wumeng.simplefactorymode;

/**
 * 使用工厂方法生成实例完成运算操作
 */
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
