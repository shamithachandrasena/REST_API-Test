package com.samsl.test.config;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import com.samsl.test.service.CustomerService;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	 @Autowired
	 CustomerService customerService;
	
	 @GET
	 @Produces(MediaType.TEXT_PLAIN)
	 public String getIt(){
		 System.out.println("invoked myresource");
	 return customerService.getStringTest();
	 }
	

	
	


	   


	   
	
}
