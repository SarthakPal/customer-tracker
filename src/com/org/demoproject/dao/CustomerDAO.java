package com.org.demoproject.dao;

import java.util.List;

import com.org.demoproject.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theId);
	
	public void deleteCustomer(int theId);
	
}
