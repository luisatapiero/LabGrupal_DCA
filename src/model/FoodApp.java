package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

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
	private static FoodApp foodapp;
	
	private LinkedList<Order> listOrder;
	private OrderValueCompare orderValueCompare;

	public static FoodApp getInstance(PApplet app) {
		if (foodapp == null) {
			foodapp = new FoodApp(app);
		}
		return foodapp;
	}

	private FoodApp(PApplet app) {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
		cart = new ArrayList<Dish>();
		history = new ArrayList<Order>();
		currentUser = 0;
		this.app = app;
		id = 0;
		totalPrice = 0;
		paintInfo = false;
		listOrder = new LinkedList<Order>();
		orderValueCompare = new OrderValueCompare();

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
		System.out.println(currentUser);
		System.out.println(users.size());
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

			for (int j = 0; j < cart.size(); j++) {
				app.fill(0);
				app.text(cart.get(j).getName() + "    $ " + cart.get(j).getPrice(), 30, j * 20 + 176);
				//app.text(cart.get(j).getName() + "    $ " + cart.get(j).getPrice(), 30, j * 20 + 176);

			}

			// }
		}

	}

	public void processPayment(int totalPrice, int screen) { // cuando le da pagar se guarda la orden

		if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY) {

			id++;
			history.add(new Order(id, totalPrice, app));

			System.out.println(history.get(id - 1).getId() + " " + history.get(id - 1).getTotalPrice());
			cart.clear();
			
		}

	}

	public ArrayList<Order> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<Order> history) {
		this.history = history;
	}

	public void registerUser(PApplet app2, String name, String lastname, String city, String address, String email,
			String password) {
		User u = new User(app2, name, lastname, city, address, email, password);
		users.add(u);
		System.out.println(users.size());

	}
	
	public void sortHistory(int screen) {
		if (app.mouseX > 20 && 158 > app.mouseX && app.mouseY > 676 && 723 > app.mouseY) {
			Collections.sort(listOrder);
			System.out.println("Esta Ordenado");
		
		}
		//Ayudame Dios tengo sue�o
		if(app.mouseX > 214 && 346 > app.mouseX && app.mouseY > 677 && 722 > app.mouseY) {
			Collections.sort(listOrder, orderValueCompare);
		}
	}

}
