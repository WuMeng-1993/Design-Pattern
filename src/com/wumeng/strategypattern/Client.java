package com.wumeng.strategypattern;

public class Client {

    public static void main(String[] args) {
        String type = "满300减100";
        CashContext cashContext = new CashContext(type);

        double total = 0d;
        total = cashContext.getResult(1000);

        System.out.println("收费为:" + total);
    }

}
