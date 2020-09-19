package org.trishinfotech.visitor.example2;

import org.trishinfotech.visitor.example2.items.Book;
import org.trishinfotech.visitor.example2.items.Electronics;
import org.trishinfotech.visitor.example2.items.Fruit;
import org.trishinfotech.visitor.example2.items.Vegetable;

public class Person extends Customer {

	public Person(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Person Visitor (" + name + ")";
	}


	@Override
	public double visit(Fruit item) {
		double discount = DISCOUNT_NONE;
		double weight = item.getWeight();
		if (weight >= 2.0d) { // 5% discount if buy more then 2 kg fruit item
			discount = DISCOUNT_5_PERCENT;
		}
		return discount;
	}

	@Override
	public double visit(Vegetable item) {
		double discount = DISCOUNT_NONE;
		double weight = item.getWeight();
		if (weight >= 2.0d) { // 10% discount if buy more the 2 kg vegetable item
			discount = DISCOUNT_10_PERCENT;
		}
		return discount;
	}

	@Override
	public double visit(Book item) {
		return DISCOUNT_NONE; // no discount on books
	}

	@Override
	public double visit(Electronics item) {
		double discount = DISCOUNT_NONE;
		double price = item.getPrice();
		if (price >= 500.0d) { // 10% discount if electronic item cost more then 500
			discount = DISCOUNT_10_PERCENT;
		} else if (price >= 200.0d) { // 5% discount if electronic item cost more then 200
			discount = DISCOUNT_5_PERCENT;
		}
		return discount;
	}

}
