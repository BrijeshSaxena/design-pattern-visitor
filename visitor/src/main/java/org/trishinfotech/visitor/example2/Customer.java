package org.trishinfotech.visitor.example2;

import org.trishinfotech.visitor.example2.items.ShopItem;

public abstract class Customer implements ShopVisitor {

	protected String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public double calculateCost(ShopItem item, double price, double discount) {
		double weight = item.getWeight();
		double cost = (weight == 0.0d) ? price : price * weight;
		return (discount == 0.0d) ? cost : (cost - (cost * discount));
	}

}
