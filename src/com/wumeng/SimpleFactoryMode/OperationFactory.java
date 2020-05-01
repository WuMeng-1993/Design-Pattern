package com.wumeng.SimpleFactoryMode;

/**
 * 操作的工厂类
 */
public class OperationFactory {

    public static Operation createOperation(char operator) {
        Operation operation = null;
        switch (operator) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
            case '^':
                operation = new OperationPower();
                break;
            default:
                throw new RuntimeException("unsupported operation");
        }
        return operation;
    }

}
