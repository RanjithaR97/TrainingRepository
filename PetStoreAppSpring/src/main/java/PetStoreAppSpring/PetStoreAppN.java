package PetStoreAppSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Pet;
import com.beans.PetStore;
import java.util.List;
import java.util.Map;
public class PetStoreAppN {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		
		PetStore petstore=context.getBean("mypetstore",PetStore.class);
		
		System.out.println(petstore.getPetStoreName());
		System.out.println(petstore.getPetStoreAddress());
		System.out.println(petstore.getCity());
		
		List<Pet> petlist=petstore.getPetList();
		for(Pet p:petlist) {
			System.out.println(p.getPetName());
			System.out.println(p.getAge());
			System.out.println(p.getPetType());
			if(p.getOwner()!=null) {
				System.out.println(p.getOwner().getOwnerName());
				System.out.println(p.getOwner().getOwnerAddress());
			}
			
		}
		Map<String,String> map=petstore.getVolunteerDetails();
		System.out.println("######################");
		System.out.println("List of volunteers");
		for(String s:map.keySet()) {
			System.out.println(map.get(s));
		}
		

	}

}
