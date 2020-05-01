package com.wumeng.StrategyPattern;

/**
 * 返利收费子类
 */
public class CashReturn extends CashSuper {

    /**
     * 返利条件：如满300返100的300
     */
    private double moneyCondition = 0d;

    /**
     * 返利值： 如满300返100的100
     */
    private double moneyReturn = 0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {

        double result = money;

        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }

        return result;
    }

}
