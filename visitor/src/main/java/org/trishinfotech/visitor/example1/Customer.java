package org.trishinfotech.visitor.example1;

import org.trishinfotech.visitor.example1.items.ShopItem;

public abstract class Customer {

	protected String name;
	
	public Customer(String name) {
		super();
		this.name = name;
	}

	public double calculateCost(ShopItem item) {
		double price = item.getPrice();
		double weight = item.getWeight();
		return (weight == 0.0d) ? price : price * weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
