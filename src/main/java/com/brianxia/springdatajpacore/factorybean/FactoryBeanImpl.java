package com.brianxia.springdatajpacore.factorybean;

/**
 * IFactoryBean的实现类
 * @author:brianxia
 */

public class FactoryBeanImpl implements IFactoryBean{
    @Override
    public String printFactoryBean() {
        return("这是一个FactoryBean的实现!");
    }
}
