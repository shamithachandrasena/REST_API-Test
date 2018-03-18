package com.samsl.test.config;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

@Path("customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
	
	  @Autowired
	  CustomerService customerService;

	  @GET
	  public List<Customer> getCustomers(){
	    return customerService.getAllCustomer();
	  }

	  @GET
	  @Path("/{customerId}")
	  public Customer getCustomer(@PathParam("customerId") int id){
	    return customerService.getCustomerById(id);
	  }

	  @POST
	  public Customer saveCustomer(Customer customer){
	    return customerService.addCustomer(customer);
	  }

	  @PUT
	  @Path("/{customerId}")
	  public Customer updateCustomer(@PathParam("customerId") int id, Customer customer){
	    return customerService.updateCustomer(id, customer);
	  }

	  @DELETE
	  @Path("/{customerId}")
	  public Customer removeCustomer(@PathParam ("customerId") int id ){
	    return customerService.deleteCustomer(id);
	  }
	
}
