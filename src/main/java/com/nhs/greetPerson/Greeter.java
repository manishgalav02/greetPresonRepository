package com.nhs.greetPerson;

import java.util.Optional;
import java.util.logging.Logger;

public class Greeter {
	Logger logger = Logger.getLogger(Greeter.class.getName());

	public static void main(String[] args) {

	}

	public String greet(String name) {
		logger.info("start executing greet method");
		return Optional.ofNullable(name).isPresent() ? name.isEmpty() ? "Hello "
				: "Hello " + Character.toUpperCase(name.charAt(0)) + name.substring(1).trim() : "Hello ";
	}

}
