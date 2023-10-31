package com.nhs.greetPerson;

public class Greeter {

	public static void main(String[] args) {

	}

	public String greet(String name) {
		if (name.isEmpty()) {
			return "Hello " ;
		}
		return "Hello "+name.trim();
	}

}
