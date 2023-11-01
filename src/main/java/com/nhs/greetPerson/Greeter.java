package com.nhs.greetPerson;

import java.time.Clock;
import java.time.LocalTime;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Greeter {
	private static final String HELLO = "Hello ";
	private Clock clock;
	static Logger logger = Logger.getLogger(Greeter.class.getName());

	public Greeter(Clock clock) {
		this.clock = clock;
	}

	public static void main(String[] args) {
		logger.info("start executing main method");
		Greeter greeter = new Greeter(Clock.systemDefaultZone());
		String name = "xyz";
		String greeting = greeter.greet(name);
		logger.log(Level.INFO, "greet method Result is: {0}", greeting);
		logger.info("end execution of main method.");
	}

	public String greet(String name) {
		logger.info("start executing greet method");
		LocalTime currentTime = LocalTime.now(clock);
		logger.info("Current Hour: " + currentTime);

		String sanitizedName = Optional.ofNullable(name).isPresent()
				? name.isEmpty() ? "" : "" + Character.toUpperCase(name.charAt(0)) + name.substring(1).trim()
				: "";

		if (sanitizedName.equals("")) {
			return HELLO + sanitizedName;
		}

		if (currentTime.isAfter(LocalTime.of(6, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
			logger.info("Calling greet at morning");
			return "Good morning " + sanitizedName;
		} else if (currentTime.equals(LocalTime.of(12, 0)) || currentTime.equals(LocalTime.of(6, 0))) {
			logger.info("Calling greet at morning");
			return "Good morning " + sanitizedName;
		} else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(22, 0))) {
			logger.info("Calling greet at evening");
			return "Good evening " + sanitizedName;
		} else if (currentTime.equals(LocalTime.of(22, 0)) || currentTime.equals(LocalTime.of(18, 0))) {
			logger.info("Calling greet at evening");
			return "Good evening " + sanitizedName;
		} else if (currentTime.isAfter(LocalTime.of(22, 0)) || currentTime.isBefore(LocalTime.of(6, 0))) {
			logger.info("Calling greet at night");
			return "Good night " + sanitizedName;
		} else {
			logger.info("Calling greet at Afternoon");
			return "Good afternoon " + sanitizedName;
		}
	}

}
