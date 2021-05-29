package controller;

import model.FoodApp;
import processing.core.PApplet;

public class ControllerMain {
	private FoodApp foodapp;

	public ControllerMain(PApplet app) {

		foodapp = new FoodApp(app);
	}

	public void firstUser(PApplet app) {
		foodapp.firstUser(app);
	}

	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return foodapp.login(email, password);

	}
	
	public void addCart(String name, int price, int screen) {
		foodapp.addCart(name, price, screen);
	}
	
	public void cartInfo(int screen) {
		foodapp.cartInfo(screen);
	}
	
	/*public void processPayment(int screen) {
		foodapp.processPayment(screen);
	}*/
	
	
	

}
