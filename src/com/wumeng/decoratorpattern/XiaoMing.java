package com.wumeng.decoratorpattern;

/**
 * ConcreteComponent(具体对象的实现类)
 */
public class XiaoMing implements Person {

    @Override
    public String getCloths() {
        return "小明穿的衣服是: ";
    }

}
