package com.foodrestaurent.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.foodrestaurent.menu.controller.MenuController;


@SpringBootApplication
public class Restaurent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context = SpringApplication.run(Restaurent.class, args);
		System.out.println(context.getBean(MenuController.class).getMenus());

	}

}
