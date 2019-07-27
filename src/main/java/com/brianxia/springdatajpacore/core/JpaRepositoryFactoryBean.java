package com.brianxia.springdatajpacore.core;

import com.brianxia.springdatajpacore.dao.CustomerDao;
import com.brianxia.springdatajpacore.repository.Repository;
import com.brianxia.springdatajpacore.repository.impl.SimpleJpaRepository;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.interceptor.ExposeInvocationInterceptor;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 *   这个类的主要作用，是为了创建JDK动态代理和SimpleJpaRepository
 *   可以通过afterPropertiesSet初始化创建
 *   也可以通过懒加载
 *   本例子中使用懒加载
 */

@Component
public class JpaRepositoryFactoryBean<T extends Repository<S, ID>, S, ID extends Serializable>
         implements InitializingBean, FactoryBean<T> {

    private ClassLoader classLoader = org.springframework.util.ClassUtils.getDefaultClassLoader();
    private Class<? extends T> repositoryInterface;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("spring-data-jpa可以不通过懒加载创建实现类，本demo中使用懒加载方式实现。");
    }


    private T  createProxy(){
        System.out.println("在autowire注入时，创建了动态代理和SimpleJpaRepository。");
        //使用JDK proxy生成代理类
        ProxyFactory factory = new ProxyFactory();
        factory.setInterfaces(new Class[] { CustomerDao.class });
        factory.addAdvice(ExposeInvocationInterceptor.INSTANCE);
        factory.setTarget(new SimpleJpaRepository<>());
        return (T) factory.getProxy(classLoader);
    }

    @Override
    public T getObject() throws Exception {
        return createProxy();
    }

    @Override
    public Class<?> getObjectType() {
        return CustomerDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
