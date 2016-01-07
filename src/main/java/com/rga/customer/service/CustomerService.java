package com.rga.customer.service;

import java.util.List;

import com.rga.customer.pojo.Customer;


public interface CustomerService {

	public List<Customer> list();

	public Customer findOne(Long id);

	public Customer add(Customer customer);

	public boolean delete(Long id);

	public Customer update(Customer customer);

	public int init();
}
