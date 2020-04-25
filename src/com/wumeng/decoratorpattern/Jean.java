package com.wumeng.decoratorpattern;

/**
 * ConcreteDecoratorB
 */
public class Jean implements ITrousers {

    private Person person;

    public Jean(Person person) {
        this.person = person;
    }

    @Override
    public String getOuter() {
        return "---下衣";
    }

    @Override
    public String getCloths() {
        return person.getCloths() + "牛仔裤";
    }
}
