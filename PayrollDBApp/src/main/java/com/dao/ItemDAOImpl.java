package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.entities.Item;
@Component
public class ItemDAOImpl implements ItemDAO {

	
	List<Item> itemList;
	public ItemDAOImpl() {
		itemList=new ArrayList<Item>();
	}
	@Override
	public void addItem(Item item) {
		itemList.add(item);
		// TODO Auto-generated method stub

	}

	@Override
	public Item findItem(int id) {
		for(Item i: itemList) {
			if(i.getItemId()==id) {
				return i;
			}
		}
		return null;
	}

	@Override
	public List<Item> findAllItems() {
		
		return itemList;
	}

	@Override
	public boolean updateItem(Item item) {
		for(int i=0;i<itemList.size();i++)
		{
		if(itemList.get(i).getItemId()==item.getItemId())
		{
		itemList.set(i, item);
		return true;
	 }
		}
		return false;
	}

	@Override
	public boolean deleteItem(Item item) {
		for(int i=0;i<itemList.size();i++)
		{
		if(itemList.get(i).getItemId()==item.getItemId())
		{
		itemList.set(i, null);
		return true;
		}
		}
		return false;
		
	}

}
