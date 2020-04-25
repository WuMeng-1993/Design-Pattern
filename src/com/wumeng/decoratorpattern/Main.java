package com.wumeng.decoratorpattern;

public class Main {

    public static void main(String[] args) {

        Person person = new XiaoMing();

        IOuter iOuter = new Suit(person);
        ITrousers iTrousers = new Pants(person);
        System.out.println(iOuter.getCloths() + iOuter.getOuter());
        System.out.println(iTrousers.getCloths() + iTrousers.getOuter());

        IOuter iOuter1 = new Jacket(person);
        ITrousers iTrousers1 = new Jean(person);
        System.out.println(iOuter1.getCloths() + iOuter1.getOuter());
        System.out.println(iTrousers1.getCloths() + iTrousers1.getOuter());
    }

}
