package com.foodrestaurent.menu.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.foodrestaurent.menu.model.Menu;

@Service
public class ItemsOfRestaurent {
	private HashSet<Menu> menuItems = new HashSet<>();

	public ItemsOfRestaurent() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void addItems() {
		menuItems.add(new Menu("Dosa", "80"));
		menuItems.add(new Menu("Puri", "60"));
		menuItems.add(new Menu("Idly", "40"));
		menuItems.add(new Menu("Vada", "70"));
		menuItems.add(new Menu("Bonda", "50"));
	}

	public HashSet<Menu> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(HashSet<Menu> menuItems) {
		this.menuItems = menuItems;
	}	
	
}
