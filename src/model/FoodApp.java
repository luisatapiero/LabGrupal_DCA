package model;

import java.util.ArrayList;
import java.util.Iterator;

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

}
