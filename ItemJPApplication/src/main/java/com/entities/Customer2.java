package com.entities;
import javax.persistence.*;

@Entity
public class Customer2 {
	@EmbeddedId
	private CustomerKey customerKey;
	private String address;
	private String phoneno;
	
	public Customer2() {
		
	}

	public CustomerKey getCustomerKey() {
		return customerKey;
	}

	public void setCustomerKey(CustomerKey customerKey) {
		this.customerKey = customerKey;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

}
