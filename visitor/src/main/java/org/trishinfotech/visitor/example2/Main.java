package org.trishinfotech.visitor.example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.trishinfotech.visitor.example2.items.Book;
import org.trishinfotech.visitor.example2.items.Electronics;
import org.trishinfotech.visitor.example2.items.Fruit;
import org.trishinfotech.visitor.example2.items.ShopItem;
import org.trishinfotech.visitor.example2.items.ShopItemCategory;
import org.trishinfotech.visitor.example2.items.Vegetable;
import org.trishinfotech.visitor.example2.util.BillPrinter;

@SuppressWarnings("serial")
public class Main {

	protected static Map<ShopItemCategory, Map<String, Double>> shopItemsPriceList = new HashMap<ShopItemCategory, Map<String, Double>>();

	static {
		shopItemsPriceList.put(ShopItemCategory.BOOK, new HashMap<String, Double>() {
			{
				put("Java - Design Patterns", 10.4d);
				put("Learn java in 24 days", 8.64d);
				put("William Shakespeare", 12.43d);
				put("Times Magazine", 8.76d);
			}
		});
		shopItemsPriceList.put(ShopItemCategory.FRUIT, new HashMap<String, Double>() {
			{
				put("Banana", 2.0d);
				put("Apple", 3.5d);
				put("Mango", 5.5d);
				put("Grape", 4.3d);
			}
		});
		shopItemsPriceList.put(ShopItemCategory.VEGETABLE, new HashMap<String, Double>() {
			{
				put("Potato", 5.0d);
				put("Tomato", 1.4d);
				put("Onion", 2.43d);
				put("Capsicum", 3.76d);
			}
		});
		shopItemsPriceList.put(ShopItemCategory.ELECTRONICS, new HashMap<String, Double>() {
			{
				put("Casio Calculator", 4.3d);
				put("Samsung Mobile", 410.65d);
				put("iPhone X", 650.36d);
				put("MacBook Pro", 3500.45d);
			}
		});
	}

	public static void main(String[] args) {
		Student student = new Student("Racheal"); // Visitor #1
		List<ShopItem> studentItems = prepareShopItems(new HashMap<String, Double>() {
			{
				put("Java - Design Patterns", 1.0d);
				put("Learn java in 24 days", 8.64d);
				put("Banana", 2.3d);
				put("Apple", 1.4d);
				put("Potato", 2.0d);
				put("Tomato", 1.5d);
				put("Casio Calculator", 1.0d);
				put("iPhone X", 1.0d);
			}
		});
		double totalCostForStudent = BillPrinter.calculateAndPrintBill(student, studentItems);
		System.out.printf("Amount to pay = %10.2f\n", totalCostForStudent);

		System.out.println("\n\n");

		Person person = new Person("Micheal"); // Visitor #2
		List<ShopItem> personItems = prepareShopItems(new HashMap<String, Double>() {
			{
				put("Times Magazine", 1.0d);
				put("William Shakespeare", 1.0d);
				put("Banana", 2.8d);
				put("Mango", 1.4d);
				put("Potato", 2.8d);
				put("Tomato", 2.5d);
				put("Samsung Mobile", 1.0d);
				put("MacBook Pro", 1.0d);
			}
		});
		double totalCostForPerson = BillPrinter.calculateAndPrintBill(person, personItems);
		System.out.printf("Amount to pay = %10.2f\n", totalCostForPerson);
	}

	private static List<ShopItem> prepareShopItems(HashMap<String, Double> hashMap) {
		List<ShopItem> shopItems = new ArrayList<ShopItem>();
		hashMap.forEach((item, quantity) -> {
			for (ShopItemCategory category : ShopItemCategory.values()) {
				Double price = shopItemsPriceList.get(category).get(item);
				if (price != null) {
					switch (category) {
					case BOOK:
						shopItems.add(new Book(item, price));
						break;
					case FRUIT:
						shopItems.add(new Fruit(item, price, quantity));
						break;
					case VEGETABLE:
						shopItems.add(new Vegetable(item, price, quantity));
						break;
					case ELECTRONICS:
						shopItems.add(new Electronics(item, price));
						break;
					}
					break;
				}
			}

		});
		return shopItems;
	}
}