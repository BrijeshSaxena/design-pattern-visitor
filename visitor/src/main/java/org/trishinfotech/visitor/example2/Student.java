package org.trishinfotech.visitor.example2;

import org.trishinfotech.visitor.example2.items.Book;
import org.trishinfotech.visitor.example2.items.Electronics;
import org.trishinfotech.visitor.example2.items.Fruit;
import org.trishinfotech.visitor.example2.items.Vegetable;

public class Student extends Customer {

	public Student(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Student Visitor (" + name + ")";
	}

	@Override
	public double visit(Fruit item) {
		double discount = DISCOUNT_NONE;
		double weight = item.getWeight();
		if (weight >= 2.0d) { // 7% discount if buy more then 2 kg fruit item
			discount = DISCOUNT_7_PERCENT;
		}
		return discount;
	}

	@Override
	public double visit(Vegetable item) {
		double discount = DISCOUNT_NONE;
		double weight = item.getWeight();
		if (weight >= 2.0d) { // 12% discount if buy more the 2 kg vegetable item
			discount = DISCOUNT_12_PERCENT;
		}
		return discount;
	}

	@Override
	public double visit(Book item) {
		// 15% flat discount on all book/magazine/stationary item 
		return DISCOUNT_15_PERCENT;
	}

	@Override
	public double visit(Electronics item) {
		double discount = DISCOUNT_NONE;
		double price = item.getPrice();
		if (price >= 500.0d) { // 15% discount if electronic item cost more then 500
			discount = DISCOUNT_15_PERCENT;
		} else if (price >= 200.0d) { // 10% discount if electronic item cost more then 200
			discount = DISCOUNT_10_PERCENT;
		}
		return discount;
	}

}
