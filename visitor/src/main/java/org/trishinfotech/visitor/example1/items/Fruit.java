package org.trishinfotech.visitor.example1.items;

public class Fruit implements ShopItem {

	private String name;
	private double pricePerKg;
	private double weight;
	
	public Fruit(String name, double pricePerKg, double weight) {
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
	public ShopItemCategory getCategory() {
		return ShopItemCategory.FRUIT;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fruit [name=").append(name)
			.append(", pricePerKg=").append(pricePerKg)
			.append(", weight=").append(weight)
			.append("]");
		return builder.toString();
	}

	
}
