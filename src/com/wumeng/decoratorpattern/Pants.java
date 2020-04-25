package com.wumeng.decoratorpattern;

/**
 * ConcrateDecoratorA
 */
public class Pants implements ITrousers {

    private Person person;

    public Pants(Person person) {
        this.person = person;
    }

    @Override
    public String getOuter() {
        return "---下衣";
    }

    @Override
    public String getCloths() {
        return person.getCloths() + "西裤";
    }
}
