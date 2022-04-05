package com.dao;
import java.util.List;

import com.model.entities.*;
public interface ItemDAO {
	void addItem(Item item);
	Item findItem(int id);
	List<Item> findAllItems();
	boolean updateItem(Item item);
	boolean deleteItem(Item item);
	

}
