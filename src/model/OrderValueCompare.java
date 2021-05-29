package model;

import java.util.Comparator;

public class OrderValueCompare implements Comparator<Order> {


	public int compare(Order o1, Order o2) {
		return o1.getId() - o2.getId();
	}

	
	}
