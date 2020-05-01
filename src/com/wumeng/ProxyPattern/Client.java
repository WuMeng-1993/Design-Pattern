package com.wumeng.ProxyPattern;

/**
 * 客服端
 */
public class Client {

    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("李娇娇");

        Proxy proxy = new Proxy(girl);
        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();

    }

}
