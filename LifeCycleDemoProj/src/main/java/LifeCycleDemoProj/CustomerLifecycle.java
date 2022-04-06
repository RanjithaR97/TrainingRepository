package LifeCycleDemoProj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.beans.Customer;

public class CustomerLifecycle {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.configuration");
		context.refresh();
		
		Customer obj=context.getBean(Customer.class);
		System.out.println(obj.getCustomerName());
		System.out.println(obj.getAddress());
		context.close();
				

	}

}
