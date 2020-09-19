package org.trishinfotech.visitor.example2.items;

import org.trishinfotech.visitor.example2.ShopVisitor;

public class Vegetable implements ShopItem {

	private String name;
	private double pricePerKg;
	private double weight;
	
	public Vegetable(String name, double pricePerKg, double weight) {
		this.name = name;
		this.pricePerKg = pricePerKg;
		this.weight = weight;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public double getPrice() {
		return getPricePerKg();
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
	
	@Override
	public double accept(ShopVisitor visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public ShopItemCategory getCategory() {
		return ShopItemCategory.VEGETABLE;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vegetable [name=").append(name)
			.append(", pricePerKg=").append(pricePerKg)
			.append(", weight=").append(weight)
			.append("]");
		return builder.toString();
	}

	
}
