package com.entities;
import com.operations.*;
import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class CustomerKey  implements Serializable{
	private String customerName;
	private String customerEmail;
	private String digitalSign;
	
	public CustomerKey() {
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getDigitalSign() {
		return digitalSign;
	}

	public void setDigitalSign(String digitalSign) {
		this.digitalSign = digitalSign;
	}
	

}
