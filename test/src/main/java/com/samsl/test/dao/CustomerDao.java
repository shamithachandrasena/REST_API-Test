package com.samsl.test.dao;
import java.util.List;

public class CustomerDao {

	 String getStringTest();
	 Customer addCustomer(Customer customer);
	 Customer updateCustomer(int id, Customer customer);
	 Customer deleteCustomer(int id);
	 Customer getCustomerById(int id);
	 List<Customer> getAllCustomer();
	
}
