package com.nhs.greetPerson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreeterTest {
	private Greeter greeter;
	Logger logger = Logger.getLogger(Greeter.class.getName());

	@BeforeEach
	void setUp() {
		greeter = new Greeter();
	}

	@Test
	public void isClassPresent() {
		logger.info("start executing isClassPresent TestCase.");
		String result = "Hello xyz";
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello xyz", result);
		logger.info("end of execution for testcase isClassPresent.");
	}

	@Test
	public void isMethodPresent_MethodParameterised() {
		logger.info("start executing isMethodPresent_MethodParameterised TestCase.");
		String name = "xyz";
		greeter = new Greeter();
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello Xyz", result);
		logger.info("end of execution for testcase isMethodPresent_MethodParameterised.");
	}

	@Test
	public void isNameAsParameterNotPresent() {
		logger.info("start executing isNameAsParameterNotPresent TestCase.");
		String name = "";
		greeter = new Greeter();
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello ", result);
		logger.info("end of execution for testcase isNameAsParameterNotPresent.");
	}

	@Test
	public void isNamePresentWithSpace_TrimResult() {
		logger.info("start executing isNamePresentWithSpace_TrimResult TestCase.");
		String name = "xyz  ";
		greeter = new Greeter();
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello Xyz", result);
		logger.info("end of execution for testcase isNamePresentWithSpace_TrimResult.");
	}

	@Test
	public void parameterContainNotNullValue() {
		logger.info("start executing parameterContainNotNullValue TestCase.");
		String name = "xyz";
		greeter = new Greeter();
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello Xyz", result);
		logger.info("end of execution for testcase parameterContainNotNullValue.");
	}

	@Test
	public void paramerterIsBlank() {
		logger.info("start executing paramerterIsBlank TestCase.");
		String name = "";
		greeter = new Greeter();
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello ", result);
		logger.info("end of execution for testcase paramerterIsBlank.");
	}

	@Test
	public void paramerterIsNull() {
		logger.info("start executing paramerterIsNull TestCase.");
		String name = null;
		greeter = new Greeter();
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello ", result);
		logger.info("end of execution for testcase paramerterIsNull.");
	}

	@Test
	public void toCheck_capitalizeFirstLetter_SingleChar() {
		logger.info("start executing toCheck_capitalizeFirstLetter_SingleChar TestCase.");
		String name = "x";
		greeter = new Greeter();
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello X", result);
		logger.info("end of execution for testcase toCheck_capitalizeFirstLetter_SingleChar.");
	}

}
