package com.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.configuration.*;
import com.model.beans.Customer;
@Component
public class AppConfig {
	
	@Bean
	public Customer getCustomer() {
		Customer c=new Customer();
		c.setCustomerName("Nitin Mohulre");
		c.setAddress("Pune");
		return c;
		
	}
	
	

}
