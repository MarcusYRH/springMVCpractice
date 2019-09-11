package com.marcus.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcus.project.dao.CustomerDAO;
import com.marcus.project.entity.Customer;


//Why use a service? So we can define multiple, modular services calling on the same DAO (which is linked to the DAOimpl)  
@Service
public class CustomerServiceimpl implements CustomerService {

	// need to inject customer dao as a bean
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}
}
