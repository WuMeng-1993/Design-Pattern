package com.wumeng.factorymethod;

import com.wumeng.simplefactorymode.Operation;

/**
 * 工厂接口
 */
public interface IFactory {

    public Operation createOperation();

}
