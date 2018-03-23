package com.samsl.test.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.samsl.test.AlienResource;

public class MyApplication extends ResourceConfig {
	
	public MyApplication(){
		register(MyResource.class);
		register(CustomerResource.class);
		register(AlienResource.class);
	}
	

}
