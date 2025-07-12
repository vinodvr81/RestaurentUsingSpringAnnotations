package com.foodrestaurent.menu.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.foodrestaurent.menu.model.Menu;


@Service
public class ItemsOfRestaurent {


	public HashSet<Menu> menuItems = new HashSet<>();

	public void addItems() {
		menuItems.add(new Menu("Rawa Dosa", "100"));
		menuItems.add(new Menu("Tomato Bath", "80"));
		menuItems.add(new Menu("Medu Onion Vada", "70"));
		menuItems.add(new Menu("Bonda", "50"));
		menuItems.add(new Menu("Puri Kurma", "60"));
		menuItems.add(new Menu("Onion Bonda", "80"));
		menuItems.add(new Menu("Thatta Idly", "50"));
		menuItems.add(new Menu("Idly", "40"));
		menuItems.add(new Menu("Dosa", "60"));
		menuItems.add(new Menu("Puri", "60"));
		menuItems.add(new Menu("Vada", "55"));
		menuItems.add(new Menu("Pongal", "40"));
		menuItems.add(new Menu("Upma", "45"));
		menuItems.add(new Menu("Masala Dosa", "80"));
		menuItems.add(new Menu("Chapati", "70"));
		menuItems.add(new Menu("Poori Bhaji", "75"));
		menuItems.add(new Menu("Parotta", "75"));

				
		
	}

	public HashSet<Menu> getMenuItems() {
		this.addItems();
		return menuItems;
	}

	public void setMenuItems(HashSet<Menu> menuItems) {
		this.menuItems = menuItems;
	}

	public void removeMenuItem(String ItemPrice, String Price) {
		this.menuItems.remove(new Menu(ItemPrice, Price));
	}

}
