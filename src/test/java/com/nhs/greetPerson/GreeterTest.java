package com.nhs.greetPerson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreeterTest {
	private Greeter greeter;
	@BeforeEach
	  void setUp() {
		greeter = new Greeter();
	  }
	@Test
	public void isClassPresent() {
		String result = "Hello xyz";
		assertEquals("Hello xyz", result);
	}
	@Test
	public void isMethodPresent_MethodParameter() {
		String name = "xyz";
		greeter = new Greeter();
		String result = greeter.greet(name);
		assertEquals("Hello xyz", result);
	}
	
	@Test
	public void isNameAsParameterNotPresent() {
		String name = "";
		greeter = new Greeter();
		String result = greeter.greet(name);
		assertEquals("Hello ", result);
	}
	
}
