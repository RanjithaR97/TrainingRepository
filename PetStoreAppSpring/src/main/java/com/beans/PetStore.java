package com.beans;

public class PetStore {
	private String petStoreName;
	private String petStoreAddress;
	
	public PetStore() {
		
	}
	private City city;
	

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPetStoreName() {
		return petStoreName;
	}

	public void setPetStoreName(String petStoreName) {
		this.petStoreName = petStoreName;
	}

	public String getPetStoreAddress() {
		return petStoreAddress;
	}

	public void setPetStoreAddress(String petStoreAddress) {
		this.petStoreAddress = petStoreAddress;
	}
 
}
