package com.operations;
import com.entities.*;

public class CustomerApp {

	public static void main(String[] args) {
		CustomerOperations obj=new CustomerOperations();
		obj.saveCustomer(new Customer(1,"Ranji","Ramnagar"));
		obj.saveCustomer(new Customer(2,"Mani","Mysore"));
		obj.saveCustomer(new Customer(3,"ramesh","Hosur"));
		obj.saveCustomer(new Customer(4,"sumathi","Mumbai"));
		
		
		obj.findCustomer(1);
		obj.findCustomer(2);
		obj.findCustomer(3);
		obj.findCustomer(4);
		
		
		
		//Item updateitem=new Item(2,"Rose tea",50,24);
	//	obj.updateItem(2, updateitem);
		//obj.finditem(2);
	//	obj.deleteItem(3);
		

	}

}
