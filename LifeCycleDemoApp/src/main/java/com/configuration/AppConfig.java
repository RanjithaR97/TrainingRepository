package com.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.model.beans.*;
@Component
public class AppConfig {
	
	@Bean
	public Person getPerson() {
		Person obj=new Person();
		obj.setPersonName("Peter Rome");
		obj.setPersonAddress("Chennai");
		return obj;
	}
	
	@Bean
	public Item getItem() {
		Item obj=new Item();
		obj.setItemName("Coffee");
		obj.setPrice(30);
		return obj;
	}

}
