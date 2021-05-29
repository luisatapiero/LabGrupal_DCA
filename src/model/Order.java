package model;

import processing.core.PApplet;

public class Order {
	
	private PApplet app;
	private int id;
	private int totalPrice;
	
	
	public Order(int id, int totalPrice, PApplet app) {

	this.id = id;
	this.totalPrice = totalPrice;	
	this.app = app;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
