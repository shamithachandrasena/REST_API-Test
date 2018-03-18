package com.samsl.test.service;
import java.util.List;

public interface CustomerService {

    String getStringTest();
    Customer addCustomer(Customer customer);
    Customer updateCustomer(int id, Customer customer);
    Customer deleteCustomer(int id);
    Customer getCustomerById(int id);
    List<Customer> getAllCustomer();




}
