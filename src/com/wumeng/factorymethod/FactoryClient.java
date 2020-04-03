package com.wumeng.factorymethod;

import com.wumeng.simplefactorymode.Operation;

/**
 * 工厂方法客户端
 */
public class FactoryClient {

    public static void main(String[] args) {
        IFactory factory = new PowerFactory();
        Operation operation = factory.createOperation();
        operation.numberA = 100;
        operation.numberB = 3;
        System.out.println(operation.result());
    }

}
