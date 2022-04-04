package com.beans;
import java.util.List;
import java.util.Map;



public class PetStore {
	private String petStoreName;
	private String petStoreAddress;
	
	public PetStore() {
		
	}
	private City city;
	
	List<Pet>petList;
	
	Map<String,String> volunteerDetails;
	

	public Map<String,String> getVolunteerDetails() {
		return volunteerDetails;
	}

	public void setVolunteerDetails(Map<String,String> volunteerDetails) {
		this.volunteerDetails = volunteerDetails;
	}

	public List<Pet> getPetList() {
		return petList;
	}

	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}

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
