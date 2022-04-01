package com.operations;
import com.entities.*;

import java.util.List;

import javax.persistence.*;

public class ItemOperations {
	EntityManager entityManager;
	
	
	public ItemOperations() {
		EntityManagerFactory entityFactory=
				Persistence.createEntityManagerFactory("ItemPU");
		
		entityManager=entityFactory.createEntityManager();
	}
	public void saveItem(Item item) {
		entityManager.getTransaction().begin();
		entityManager.persist(item);
		entityManager.flush();
		entityManager.getTransaction().commit();
	}
	
	public void finditem(int id) {
		Item item=entityManager.find(Item.class,id);
		System.out.println(item.getItemName());
		System.out.println(item.getItemPrice());
		System.out.println(item.getQuantityAvailable());
		
		
	}
	public void printAllItems() {
		Query query=entityManager.createQuery("select i from Item i");
		
		System.out.println("*******************************************");
		List<Item> itemlist=query.getResultList();
		for(Item item:itemlist) {
			System.out.println("#####################################");
			System.out.println(item.getItemId());
			System.out.println(item.getItemName());
			System.out.println(item.getItemPrice());
			System.out.println(item.getQuantityAvailable());
			
		}
		
	}
	
	public void updateItem(int id,Item item) {
		entityManager.getTransaction().begin();
		Item item_to_be_updated=entityManager.find(Item.class, id);
		
		item_to_be_updated.setItemName(item.getItemName());
		item_to_be_updated.setItemPrice(item.getItemPrice());
		item_to_be_updated.setQuantityAvailable(item.getQuantityAvailable());
		
		entityManager.merge(item_to_be_updated);
		entityManager.flush();
		entityManager.getTransaction().commit();
		
		
		
	}
	public void deleteItem(int id) {
	Item item_to_be_deleted =entityManager.find(Item.class,id);
	entityManager.getTransaction().begin();
	entityManager.remove(item_to_be_deleted);
	entityManager.flush();
	entityManager.getTransaction().commit();
		
	}
	
	public void viewNameAndQuantity() {
		String query="Select i.itemName,i.quantityAvailable from Item i";
		Query jpaquery=entityManager.createQuery(query);
		List<Object[]> elementlist=jpaquery.getResultList();
		for(Object[] o:elementlist) {
			System.out.println("####################################");
			System.out.println(o[0]);
			System.out.println(o[1]);
		}
	}
	
	public void viewItemByPrice() {
		String query="Select i from Item  i where i.itemPrice>40";
		Query jpaquery=entityManager.createQuery(query);
		List<Item> itemlist=jpaquery.getResultList();
		for(Item i : itemlist) {
			System.out.println("#############################");
			System.out.println(i.getItemName());
			System.out.println(i.getItemPrice());
			System.out.println(i.getQuantityAvailable());
		}
	}
	
	public void viewItemByPriceAndQuantityParam(float itemPrice,int quantity) {
		String query="Select i from Item i where i.itemPrice> ?1 and i.quantityAvailable > ?2";
		
		Query jpaquery=entityManager.createQuery(query);
		jpaquery.setParameter(1,itemPrice);
		jpaquery.setParameter(2, quantity);
		List<Item> itemlist=jpaquery.getResultList();
		for(Item item:itemlist) {
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");
			System.out.println(item.getItemName());
			System.out.println(item.getItemPrice());
			System.out.println(item.getQuantityAvailable());
		}
		
	}
	
	public void viewOrderbyName() {
		String query="Select i from Item i order by i.itemName";
		
		Query jpaquery=entityManager.createQuery(query);
		List<Item> itemlist=jpaquery.getResultList();
		for(Item item:itemlist) {
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println(item.getItemName());
			System.out.println(item.getItemPrice());
			System.out.println(item.getQuantityAvailable());
		}
	}
	
	public void viewGroupByCity() {
	//String query="Select count(i.itemName),i.city from Item i group by i.city";
		String query="Select avg(i.itemPrice),i.city from Item i group by i.city";
		Query jpaquery=entityManager.createQuery(query);
		List<Object[]> elementlist=jpaquery.getResultList();
		for (Object[] o:elementlist) {
			System.out.println("####################################");
			System.out.println(o[0]);
			System.out.println(o[1]);
			
		}
		
	}

}
