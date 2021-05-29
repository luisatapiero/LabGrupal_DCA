package model;

import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;

public class FoodApp {
	private ArrayList<User> users;
	private ArrayList<Dish> cart;
	private ArrayList<Order> history;
	private int currentUser;
	private PApplet app;
	private int id, totalPrice;
	private boolean paintInfo;

	public FoodApp(PApplet app) {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
		cart = new ArrayList<Dish>();
		history = new ArrayList<Order>();
		currentUser = 0;
		this.app = app;
		id = 0;
		totalPrice = 0;
		paintInfo = false;
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
			System.out.println(cart.get(0).getName() + " " + cart.get(0).getPrice());
			totalPrice += price;

	}

	public ArrayList<Dish> getCart() {
		return cart;
	}

	public void cartInfo(int screen) {
		if (screen == 9) {
			paintInfo = true;
			System.out.println(paintInfo);
			paintCartinfo();
			processPayment(id, totalPrice);
		}
		
	}

	public void paintCartinfo() {
		if (paintInfo) {

			for (int i = 0; i < cart.size(); i++) {
				// System.out.println("pinta info");
				app.fill(0);
				app.text(cart.get(i).getName() + " " + cart.get(i).getPrice(), 30, i * 100 + 156);
				app.text(cart.get(i).getName() + " " + cart.get(i).getPrice(), 30, i * 100 + 156);
			}
		}
	}

	public void processPayment(int id, int totalPrice) {
		id++;
		history.add(new Order(id, totalPrice, app));
		System.out.println(id+" "+totalPrice);
	}

}
