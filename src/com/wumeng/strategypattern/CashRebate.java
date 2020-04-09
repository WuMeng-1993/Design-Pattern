package com.wumeng.strategypattern;

/**
 * 打折收费子类
 */
public class CashRebate extends CashSuper{

    /**
     * 打折率
     */
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}
