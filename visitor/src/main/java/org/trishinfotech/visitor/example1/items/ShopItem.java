package org.trishinfotech.visitor.example1.items;

public interface ShopItem {

	String getName();

	double getPrice();

	double getWeight();

	ShopItemCategory getCategory();
}
