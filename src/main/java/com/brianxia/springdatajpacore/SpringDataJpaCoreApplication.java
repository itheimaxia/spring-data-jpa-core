package com.brianxia.springdatajpacore;

import com.brianxia.springdatajpacore.utils.SpringBootApplicationContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaCoreApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaCoreApplication.class, args);
        SpringBootApplicationContextUtil.setApplicationContext(run);
    }

}
