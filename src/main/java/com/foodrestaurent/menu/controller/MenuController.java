package com.foodrestaurent.menu.controller;

import java.util.HashSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foodrestaurent.menu.model.Menu;
import com.foodrestaurent.menu.service.ItemsOfRestaurent;

@RestController
public class MenuController {
	private ItemsOfRestaurent ioftt = new ItemsOfRestaurent();

	// http://localhost:8082/menus
	@GetMapping("/menus")
	public HashSet<Menu> getMenus(){
		this.ioftt.addItems();
		return this.ioftt.getMenuItems();
	}
	
	// e.g http://localhost:8082/menus/dosa/80
	@GetMapping("/menus/{ItemName}/{Price}")
	public Menu itemPathVariable(@PathVariable(name = "ItemName") String ItemName, @PathVariable(name = "Price") String Price) {
		return new Menu(ItemName, Price);
	}
	
	// e.g http://localhost:8082/menus/query?ItemName=idly&Price=40
	@GetMapping("menus/query")
	public Menu itemQueryVariable(@RequestParam(name = "ItemName") String ItemName, @RequestParam(name = "Price") String Price) {
		return new Menu(ItemName, Price);
	}
	
	// e.g http://localhost:8082/add_item
	@PostMapping("/add_item")
	public void  addItemVariable(@RequestBody HashSet<Menu>  add_item) {
		this.ioftt.setMenuItems(add_item);
	}
	
}



