package com.model.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Item {
	private String itemName;
	private float price;
	
	public Item() {
		
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	@PostConstruct
	public void postConstructMessage() {
		System.out.println("Bean Created");
	}
	
	@PreDestroy
	public void preDestroyMessage() {
		System.out.println("Bean is to be removed");
	}
}
