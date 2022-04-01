package com.operations;
import javax.persistence.*;
import com.entities.CustomerKey;
import com.entities.Customer2;

public class CustomerApp1 {

	public static void main(String[] args) {
		EntityManagerFactory entityFactory=
				Persistence.createEntityManagerFactory("ItemPU");
		
	  EntityManager	em=entityFactory.createEntityManager();
	  CustomerKey key=new CustomerKey();
	  key.setCustomerName("Ranji");
	  key.setCustomerEmail("Ranji@gmail.com");
	  key.setDigitalSign("#cgsuhakk");
	  
	  Customer2 obj=new Customer2();
	  obj.setCustomerKey(key);
	  obj.setAddress("ECR Road");
	  obj.setPhoneno("6728787629");
	  
	  em.getTransaction().begin();
	  em.persist(obj);
	  em.flush();
	  em.getTransaction().commit();
	  
	  
		

	}

}
