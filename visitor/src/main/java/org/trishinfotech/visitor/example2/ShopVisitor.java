package org.trishinfotech.visitor.example2;

import org.trishinfotech.visitor.example2.items.Book;
import org.trishinfotech.visitor.example2.items.Electronics;
import org.trishinfotech.visitor.example2.items.Fruit;
import org.trishinfotech.visitor.example2.items.Vegetable;

public interface ShopVisitor {

	static final double DISCOUNT_NONE = 0.0d;
	static final double DISCOUNT_5_PERCENT = 0.05d;
	static final double DISCOUNT_7_PERCENT = 0.07d;
	static final double DISCOUNT_10_PERCENT = 0.10d;
	static final double DISCOUNT_12_PERCENT = 0.12d;
	static final double DISCOUNT_15_PERCENT = 0.15d;

	double visit(Fruit item);

	double visit(Vegetable item);

	double visit(Book item);

	double visit(Electronics item);

}
