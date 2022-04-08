package com.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.model.Item;

@Component
public interface ItemDAO {
	public void addItem(Item item);
	public Item findItem(int id);
	public List<Item> findAllItem();
	public boolean updateItem(Item item);
	public boolean deleteItem(Item item);
	

}
