package com.brianxia.springdatajpacore.repository.impl;

import com.brianxia.springdatajpacore.domain.Customer;
import com.brianxia.springdatajpacore.repository.JpaRepository;

import java.io.Serializable;

public class SimpleJpaRepository<T,ID extends Serializable> implements JpaRepository<T, ID> {
    @Override
    public T findOne(ID id) {
        System.out.println("调用SimpleJpaRepository的findOne方法");
        Customer cst = new Customer();
        cst.setCustName("simple实现!");
        return (T)cst;
    }
}
