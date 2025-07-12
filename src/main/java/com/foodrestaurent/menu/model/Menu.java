package com.foodrestaurent.menu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "price")
    private String price;

    public Menu(String name, String price) {
        this.itemName = name;
        this.price = price;
    }

    // Getters and Setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return Objects.equals(itemName, menu.itemName) &&
               Objects.equals(price, menu.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, price);
    }
    // Getters & Setters

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


    
}