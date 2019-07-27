package com.brianxia.springdatajpacore.contoller;

import com.brianxia.springdatajpacore.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private CustomerDao customerDao;

    @GetMapping(value = "test")
    public String getResult(){
        return customerDao.findOne(0L).getCustName();
    }
}
