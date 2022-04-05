package com.configurations;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.dao.*;
import com.model.entities.*;
@Component
public class AppConfig {
	
	@Bean
	public ItemDAOImpl getDAOImpl() {
		ItemDAOImpl impl=new ItemDAOImpl();
		return impl;
		
		
	}
	@Bean
	public Item getItem() {
		Item item=new Item();
		item.setItemId(1);
		item.setItemName("Coffee");
		item.setPrice(200.0f);
		item.setQuantity(50);
		return item;
	}

}
