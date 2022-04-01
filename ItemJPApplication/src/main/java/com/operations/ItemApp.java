package com.operations;
import com.entities.*;

public class ItemApp {

	public static void main(String[] args) {
		ItemOperations obj=new ItemOperations();
		obj.saveItem(new Item(1,"Coffee",23,10,"Bangalore"));
		obj.saveItem(new Item(2,"Black Coffee",45,15,"Mumbai"));
		obj.saveItem(new Item(3,"Espresso",50,19,"Mumbai"));
		obj.saveItem(new Item(4,"Latte",49,11,"Madhyapradhesh"));
		obj.saveItem(new Item(5,"Arabica",34,20,"Chennai"));
		obj.saveItem(new Item(6,"Americano",39,29,"Bangalore"));
		obj.saveItem(new Item(7,"RoseHerb",40,25,"Pune"));
		obj.saveItem(new Item(8,"Jasmine tea",99,78,"Chennai"));
		obj.saveItem(new Item(9,"Capriciono",66,70,"Hyderabad"));
		
		obj.finditem(1);
		obj.finditem(2);
		obj.finditem(3);
		obj.finditem(4);
		
		Item updateitem=new Item(2,"Rose tea",50,24,"");
		obj.updateItem(2, updateitem);
		obj.finditem(2);
		obj.viewItemByPriceAndQuantityParam(49,10);
		obj.viewOrderbyName();
		obj.viewGroupByCity();
		//obj.deleteItem(3);
		
	}

}
