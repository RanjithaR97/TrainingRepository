package PayrollDBApp;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.ItemService;
import com.model.entities.Item;

public class ItemApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.configurations");
		context.scan("com.dao");
		context.refresh();
		
		ItemService service=context.getBean(ItemService.class);
		
		Item item1=new Item();
		item1.setItemId(1);
		item1.setItemName("Coffee");
		item1.setPrice(50.0f);
		item1.setQuantity(200);
		
		Item item2=new Item();
		item2.setItemId(2);
		item2.setItemName("Caparcino");
		item2.setPrice(100.0f);
		item2.setQuantity(400);
		
		Item item3=new Item();
		item3.setItemId(3);
		item3.setItemName("Espresso");
		item3.setPrice(300);
		item3.setQuantity(100);
		
		service.add(item1);
		service.add(item2);
		service.add(item3);
		
		List<Item> itemlist=service.findAll();
		for(Item i:itemlist) {
			System.out.println(i.getItemName());
			System.out.println(i.getPrice());
			System.out.println(i.getQuantity());
		}
		
		item3.setItemName("Latte");
		service.update(item3);
		System.out.println(service.find(3).getItemName()+"for"+service.find(3).getPrice());
		
		
		
		

	}

}
