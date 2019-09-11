package com.marcus.project.dao;

import java.util.List;

import com.marcus.project.entity.Customer;

public interface CustomerDAO {
	
	//list of the methods for use in the DAO

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
	
}