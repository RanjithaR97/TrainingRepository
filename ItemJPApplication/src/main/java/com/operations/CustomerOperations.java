package com.operations;
import com.entities.*;
import javax.persistence.*;

public class CustomerOperations {
EntityManager entityManager;
	
	
	public CustomerOperations() {
		EntityManagerFactory entityFactory=
				Persistence.createEntityManagerFactory("ItemPU");
		
		entityManager=entityFactory.createEntityManager();
	}
	//public void saveItem(Item item) {
	//	entityManager.getTransaction().begin();
	//	entityManager.persist(item);
	//	entityManager.flush();
	////	entityManager.getTransaction().commit();
	//}
	
	public void findCustomer(int id) {
		Customer customer=entityManager.find(Customer.class,id);
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getAddress());
		
		
		
	}
	public void printAllItems() {
		
	}
	
	public void updateItem(int id,Item item) {
		//entityManager.getTransaction().begin();
	//	Item customer_to_be_updated=entityManager.find(Item.class, id);
		
	//	customer_to_be_updated.setItemName(Item.getItemName());
	//	customer_to_be_updated.setAddress(Item.);
		
		
		//entityManager.merge(customer_to_be_updated);
	//	entityManager.flush();
	//	entityManager.getTransaction().commit();
		
		
		
	}
	//public void deleteItem(int id) {
//	Customer customer_to_be_deleted =entityManager.find(Customer.class,id);
	//entityManager.getTransaction().begin();
//	entityManager.remove(customer_to_be_deleted);
	//entityManager.flush();
	//entityManager.getTransaction().commit();
		
//	}
	public void saveCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.flush();
		entityManager.getTransaction().commit();
		
	}


}
