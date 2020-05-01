package com.wumeng.DecoratorPattern;

/**
 * ConcreteDecoratorB
 */
public class Jacket implements IOuter {

    private Person person;

    public Jacket(Person person) {
        this.person = person;
    }

    @Override
    public String getOuter() {
        return "---上衣";
    }

    @Override
    public String getCloths() {
        return person.getCloths() + "夹克";
    }

}
