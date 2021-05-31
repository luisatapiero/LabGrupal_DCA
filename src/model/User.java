package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class User {
	private PApplet app;
	private String name, lastname, city, address, email, password;

	//crear arraylist de historial de pedidos

	public User(PApplet app, String name, String lastname, String city, String address, String email, String password) {

		this.app = app;
		this.name = name;
		this.lastname = lastname;
		this.city = city;
		this.address = address;
		this.email = email;
		this.password = password;

	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
