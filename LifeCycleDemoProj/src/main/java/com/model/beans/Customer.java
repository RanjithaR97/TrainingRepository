package com.model.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {
	private String customerName;
	private String address;
	
	public Customer() {
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@PostConstruct
	public void postconstructmessage() {
		System.out.println("Customer bean created");
	}
	
	@PreDestroy
	public void predestroymessage() {
		System.out.println("Customer bean destroyed");
	}

}
