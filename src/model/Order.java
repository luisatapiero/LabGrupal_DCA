package model;

import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;

import processing.core.PApplet;

public class Order implements Comparable <Order> {
	
	private PApplet app;
	private int id;
	private int totalPrice;
	private Date date;

	
	public Order(int id, int totalPrice, PApplet app) {
		date = new Date();
		
		
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
	
	public Date getDate() {
		return date;
		
	}


	public int compareTo(Order nextOrder) {
		return this.id - nextOrder.getId();
	}
	

}
