package controller;

import model.FoodApp;
import processing.core.PApplet;

public class ControllerMain {
	private FoodApp foodapp;

	public ControllerMain() {
		// TODO Auto-generated constructor stub
		foodapp = new FoodApp();
	}

	public void firstUser(PApplet app) {
		foodapp.firstUser(app);
	}

	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return foodapp.login(email, password);

	}

}
