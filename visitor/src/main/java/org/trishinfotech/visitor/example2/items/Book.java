package org.trishinfotech.visitor.example2.items;

import org.trishinfotech.visitor.example2.ShopVisitor;

public class Book implements ShopItem {

	private String title;
	private double pricePerUnit;
	
	public Book(String title, double pricePerUnit) {
		this.title = title;
		this.pricePerUnit = pricePerUnit;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int price) {
		this.pricePerUnit = price;
	}

	@Override
	public String getName() {
		return getTitle();
	}

	@Override
	public double getPrice() {
		return getPricePerUnit();
	}

	@Override
	public double getWeight() {
		return 0.0d;
	}
	
	@Override
	public ShopItemCategory getCategory() {
		return ShopItemCategory.BOOK;
	}

	@Override
	public double accept(ShopVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [title=").append(title)
			.append(", price=").append(getPrice())
			.append("]");
		return builder.toString();
	}
	
}
