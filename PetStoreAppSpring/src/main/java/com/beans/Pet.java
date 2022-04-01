package com.beans;

public class Pet {
	
	private String petName;
	private int age;
	private String petType;
  private Owner owner;
   public Pet() {
	
   }

	public Pet(String petName, int age, String petType, Owner owner) {
	super();
	this.petName = petName;
	this.age = age;
	this.petType = petType;
	this.owner = owner;
}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}
  
}
