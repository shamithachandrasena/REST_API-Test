package com.samsl.test.dao;
import java.util.List;

import com.samsl.test.model.Customer;

public interface CustomerDao {

	 String getStringTest();
	 Customer addCustomer(Customer customer);
	 Customer updateCustomer(int id, Customer customer);
	 Customer deleteCustomer(int id);
	 Customer getCustomerById(int id);
	 List<Customer> getAllCustomer();
	
}
