package model;

import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;

public class FoodApp {
	private ArrayList<User> users;
	private ArrayList<Dish> cart;
	private int currentUser;
	private PApplet app;

	public FoodApp() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
		cart = new ArrayList<Dish>();
		currentUser = 0;
		this.app = app;
	}

	public void firstUser(PApplet app) {
		users.add(new User(app, "sebastian", "arango", "cali", "cra62", "abc@gmail.com", "123"));
	}

	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		boolean login = false;
		for (int i = 0; i < users.size() && login == false; i++) {
			if (email.equals(users.get(i).getEmail())) {
				if (password.equals(users.get(i).getPassword())) {
					login = true;
					currentUser = i;
				}
			}
		}
		return login;
	}

	public void addCart(String name, int price) {
		cart.add(new Dish(name, price));
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i).getName() + " " + cart.get(i).getPrice());
			System.out.println(cart.size());

		}

	}

	public void cartInfo() {
		//if (cart.size() >= 1) {
		System.out.println(cart.size());
			for (int i = 0; i < cart.size(); i++) {
				System.out.println("funciona");
				app.text(cart.get(i).getName() + " " + cart.get(i).getPrice(), 30, i * 100 + 156);
				app.text(cart.get(i).getName() + " " + cart.get(i).getPrice(), 30, i * 100 + 156);
			}
			
			
		//}

	}

}
