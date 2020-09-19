package org.trishinfotech.visitor.example1;

public class Person extends Customer {

	public Person(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Person (" + name + ")";
	}

}
