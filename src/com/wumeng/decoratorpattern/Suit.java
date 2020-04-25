package com.wumeng.decoratorpattern;

/**
 * ConcreteDecoratorA
 */
public class Suit implements IOuter {

    private Person person;

    public Suit(Person person) {
        this.person = person;
    }

    @Override
    public String getOuter() {
        return "---上衣";
    }

    @Override
    public String getCloths() {
        return person.getCloths() + "西装";
    }

}
