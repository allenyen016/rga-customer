package com.rga.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.rga.customer.pojo.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}
