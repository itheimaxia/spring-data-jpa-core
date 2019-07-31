package com.brianxia.springdatajpacore.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Factory bean Demo 配置类，自动装配一个FactoryBeanDemo
 * @author:brianxia
 */

@Configuration
public class FactoryBeanDemoConfiguration {

    @Bean
    public FactoryBeanDemo getFactoryBeanDemo(){
        return new FactoryBeanDemo();
    }
}
