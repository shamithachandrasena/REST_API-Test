package com.samsl.test.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.samsl.test.dao.CustomerDao;
import com.samsl.test.model.Customer;

public class CustomerServiceImp implements CustomerService {

	  @Autowired
	  private CustomerDao customerDao; 

	  @Override
	  public String getStringTest() {
	    return customerDao.getStringTest();
	  }

	  @Override
	  public Customer addCustomer(Customer customer) {
	    return customerDao.addCustomer(customer);
	  }

	  @Override
	  public Customer updateCustomer(int id, Customer customer) {
	    return customerDao.updateCustomer(id, customer);
	  }

	  @Override
	  public Customer deleteCustomer(int id) {
	    return customerDao.deleteCustomer(id);
	  }

	  @Override
	  public Customer getCustomerById(int id) {
	    return customerDao.getCustomerById(id);
	  }

	  @Override
	  public List<Customer> getAllCustomer() {
	    return customerDao.getAllCustomer();
	  }

	
}
