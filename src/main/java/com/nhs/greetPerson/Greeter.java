package com.nhs.greetPerson;

import java.util.Optional;

public class Greeter {

	public static void main(String[] args) {

	}

	public String greet(String name) {
		
		return Optional.ofNullable(name).isPresent()
				? name.isEmpty() ? "Hello " : "Hello "+Character.toUpperCase(name.charAt(0)) + name.substring(1).trim()
				: "Hello ";
	}

}
