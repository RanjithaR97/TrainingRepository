package com.controller;
import com.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ItemService;

@RestController
public class ItemRestController {
	@Autowired
	ItemService service;
	
	@GetMapping("/allitems")
	public List<Item> getallitems()
	{
   return service.findAll();		
	}
	

}
