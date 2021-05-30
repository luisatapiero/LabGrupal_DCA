package controller;

import java.util.ArrayList;

import model.FoodApp;
import model.Order;
import processing.core.PApplet;

public class ControllerMain {
	private FoodApp foodapp;

	public ControllerMain(PApplet app) {

		foodapp = FoodApp.getInstance(app);
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
	

	public ArrayList<Order> getHistory() {
        return foodapp.getHistory();
    }

    public void setHistory(ArrayList<Order> history) {
        //foodapp.setHistory(history);
    }

	public void registerUser(PApplet app, String name, String lastname, String city, String address, String email,
			String password) {
foodapp.registerUser(app,name,lastname,city,address,email,password);
	}
	
	

}
