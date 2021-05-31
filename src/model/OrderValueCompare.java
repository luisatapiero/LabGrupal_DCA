package model;

import java.util.Comparator;

public class OrderValueCompare implements Comparator<Order> {


	public int compare(Order o1, Order o2) {
		return (int) o1.getTotalPrice() - o2.getTotalPrice();
	}

	
	}
