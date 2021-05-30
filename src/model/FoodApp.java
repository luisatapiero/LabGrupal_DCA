package model;

import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;
import processing.core.PImage;

public class FoodApp {
	private ArrayList<User> users;
	private ArrayList<Dish> cart;
	private ArrayList<Order> history;
	private int currentUser;
	private PApplet app;
	private int id, totalPrice;
	private boolean paintInfo;
	
	private boolean paintStatus;

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
		
		paintStatus = false;
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

	public void addCart(String name, int price, int screen) {
		if (screen != 9) {
			cart.add(new Dish(name, price));
			System.out.println(name + " " + price);
			totalPrice += price;
		} else if (screen == 9){
			processPayment(totalPrice, screen);
			totalPrice = 0;
		}

	}

	public void cartInfo(int screen) { // se supone que pinta la info en la canasta
		if (screen == 9) {

			
			;
			for (int j = 0; j < cart.size(); j++) {
				System.out.println("pinta info");
				app.fill(0);
				app.text(cart.get(j).getName() + " " + cart.get(j).getPrice(), 30, j * 100 + 156);
				app.text(cart.get(j).getName() + " " + cart.get(j).getPrice(), 30, j * 100 + 156);

				
			}
			
			// }
		}

	}

	public void processPayment(int totalPrice, int screen) { // cuando le da pagar se guarda la orden

		if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY && screen == 9) {

			id++;
			history.add(new Order(id, totalPrice, app));
			System.out.println(history.get(id - 1).getId() + " " + history.get(id - 1).getTotalPrice());
			
		}

	}

	public ArrayList<Order> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<Order> history) {
		this.history = history;
	}
	
}
