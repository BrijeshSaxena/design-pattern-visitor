package org.trishinfotech.visitor.example2.items;

import org.trishinfotech.visitor.example2.ShopVisitor;

public interface ShopItem {

	String getName();

	double getPrice();

	double getWeight();

	ShopItemCategory getCategory();

	// will accept different visitors
	// every visitor type will have its own defined discount
	// and hence will differ the final cost of the item.
	double accept(ShopVisitor visitor);
}
