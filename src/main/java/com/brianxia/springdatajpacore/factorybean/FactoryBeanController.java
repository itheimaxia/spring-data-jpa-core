package com.brianxia.springdatajpacore.factorybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Factory bean 案例的测试用例
 * @author:brianxia
 */

@RestController
public class FactoryBeanController {

    @Autowired
    private IFactoryBean iFactoryBean;

    @GetMapping(value = "factorybean")
    public String getData(){
        return iFactoryBean.printFactoryBean();
    }

}
