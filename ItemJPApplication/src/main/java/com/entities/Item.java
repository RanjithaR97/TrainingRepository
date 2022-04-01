package com.entities;
import com.operations.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.Table;

import org.hibernate.validator.Min;
import org.hibernate.validator.NotNull;

@Entity
@Table(name="ItemTable")
public class Item {
	@Id
	private int itemId;
	@NotNull(message="Name cannot be Null")
	private String itemName;
	@Min(value=100)
	@Column(name="Price")
	private float itemPrice;
	@Column(name="Qunatity")
	private int quantityAvailable;
	private String city;
	
	

	public Item(int itemId, String itemName, float itemPrice, int quantityAvailable, String city) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantityAvailable = quantityAvailable;
		this.city = city;
	}
	

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	@PostPersist
	public void itemSaved() {
		System.out.println("#################################");
		System.out.println(this.getItemName()+"with the item id"+this.getItemId()+"saved");
		System.out.println("#####################################");
		
	}
	
	
	
	

}
