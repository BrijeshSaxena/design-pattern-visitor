package org.trishinfotech.visitor.example1.items;

public class Electronics implements ShopItem {

	private String brand;
	private double price;
	
	public Electronics(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String getName() {
		return getBrand();
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public double getWeight() {
		return 0.0d;
	}
	
	@Override
	public ShopItemCategory getCategory() {
		return ShopItemCategory.ELECTRONICS;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Electronics [brand=").append(brand)
			.append(", price=").append(price)
			.append("]");
		return builder.toString();
	}

}
