package PetStoreAppSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.PetStore;
import com.beans.Pet;


public class PetStoreApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		PetStore petstore=context.getBean("petstorebean",PetStore.class);

		System.out.println(petstore.getPetStoreName());
		
		System.out.println(petstore.getPetStoreAddress());
		System.out.println(petstore.getCity().getCityName());
		System.out.println(petstore.getCity().getState());
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Pet pet1=context.getBean("pet1",Pet.class);
		Pet pet2=context.getBean("pet2", Pet.class);
		System.out.println("###########################################");
		System.out.println(pet1.getPetName());
		System.out.println(pet1.getPetType());
		System.out.println(pet1.getAge());
		System.out.println(pet1.getOwner().getOwnerName());
		System.out.println(pet1.getOwner().getOwnerAddress());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(pet2.getPetName());
		System.out.println(pet2.getPetType());
		System.out.println(pet2.getAge());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		

	}

}
