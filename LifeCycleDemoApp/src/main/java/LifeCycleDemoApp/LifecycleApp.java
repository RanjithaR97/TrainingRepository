package LifeCycleDemoApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.*;
import com.model.beans.*;
public class LifecycleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.configuration");
		context.refresh();
		Person person=context.getBean(Person.class);
		System.out.println(person.getPersonName());
		System.out.println(person.getPersonAddress());
		
		
		Item item=context.getBean(Item.class);
	    System.out.println(item.getItemName());
	    System.out.println(item.getPrice());
		context.close();

	}

}
