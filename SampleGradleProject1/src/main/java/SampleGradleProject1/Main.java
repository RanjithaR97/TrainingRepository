package SampleGradleProject1;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.entities.Customer;

public class Main {

	public static void main(String[] args) {
		System.out.println("HIII Gradle");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("SamplePU");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
    //   Teacher teacher=new Teacher();
   //      teacher.setTeacherId(10);
   //     teacher.setTeacherName("Nandhini");
    //    teacher.setNoofstudents(10);
      //  teacher.setSubject("Maths");
        
        Customer obj=new Customer();
        obj.setCustomerId(10);
        obj.setCustomerName("Steffi");
        obj.setAddress("Gandhinagar 3 rd cross");
        obj.setEmailId("Stefii@gmail.com");
        obj.setPhoneNum("773920820");
        obj.setAge(24);
        
        entityManager.getTransaction().begin();
        entityManager.persist(obj);
        entityManager.flush();
        entityManager.getTransaction().commit();
	}

}
