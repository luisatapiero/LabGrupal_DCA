package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class FoodApp {
	private ArrayList<User> users;
	private int currentUser;

	public FoodApp() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
		currentUser = 0;

	}

	public void firstUser(PApplet app) {
		users.add(new User(app, "sebastian", "arango", "cali", "cra62", "abc@gmail.com", "123"));
	}

}
