package org.trishinfotech.visitor.example2.items;

public enum ShopItemCategory {
	
	BOOK("Book"), ELECTRONICS("Electronics"), FRUIT("Fruit"), VEGETABLE("Vegetable");

	private String name;

	ShopItemCategory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
