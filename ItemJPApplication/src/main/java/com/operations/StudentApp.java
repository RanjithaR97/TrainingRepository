package com.operations;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entities.*;

public class StudentApp {

	public static void main(String[] args) {
		EntityManagerFactory entityFactory=
				Persistence.createEntityManagerFactory("ItemPU");
		
	  EntityManager	entityManager=entityFactory.createEntityManager();
	  
	  Student student=new Student();
	  student.setStudentName("Ranjitha");
	  
	  entityManager.getTransaction().begin();
	  entityManager.persist(student);
	  entityManager.flush();
	  entityManager.getTransaction().commit();
	  
	  

	}

}
