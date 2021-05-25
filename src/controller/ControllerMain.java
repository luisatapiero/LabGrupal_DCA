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

}
