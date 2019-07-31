package com.brianxia.springdatajpacore.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBeanDemo实现了FactoryBean接口，如果在需要使用IFactoryBean时，会调用getObject来生成
 * 这样做的好处是如果在生成对象时需要对对象进行额外处理就比较方便，比如动态代理该对象
 *
 * @author:brianxia
 */
public class FactoryBeanDemo implements FactoryBean<IFactoryBean> {
    @Override
    public IFactoryBean getObject() throws Exception {
        System.out.println("生成FactoryBeanImpl!");
        return new FactoryBeanImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return IFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
