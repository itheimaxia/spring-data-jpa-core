package com.brianxia.springdatajpacore.dao;

import com.brianxia.springdatajpacore.domain.Customer;
import com.brianxia.springdatajpacore.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Long> {
}
