package com.brianxia.springdatajpacore.contoller;

import com.brianxia.springdatajpacore.dao.CustomerDao;
import com.brianxia.springdatajpacore.utils.SpringBootApplicationContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 由于需要懒加载测试，通过ApplicationContext获取到接口实现类。
 */
@RestController
public class DemoController {

//    @Autowired
//    private CustomerDao customerDao;

    @GetMapping(value = "test")
    public String getResult(){
        CustomerDao customerDao = SpringBootApplicationContextUtil.getBean(CustomerDao.class);
        return customerDao.findOne(0L).getCustName();
    }
}
