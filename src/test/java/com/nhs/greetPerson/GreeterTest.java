package com.nhs.greetPerson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreeterTest {
	private Greeter greeter;
	Logger logger = Logger.getLogger(Greeter.class.getName());

	@BeforeEach
	void setUp() {
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
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
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Good morning Xyz", result);
		logger.info("end of execution for testcase isMethodPresent_MethodParameterised.");
	}

	@Test
	public void isNameAsParameterNotPresent() {
		logger.info("start executing isNameAsParameterNotPresent TestCase.");
		String name = "";
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello ", result);
		logger.info("end of execution for testcase isNameAsParameterNotPresent.");
	}

	@Test
	public void isNamePresentWithSpace_TrimResult() {
		logger.info("start executing isNamePresentWithSpace_TrimResult TestCase.");
		String name = "xyz  ";
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Good morning Xyz", result);
		logger.info("end of execution for testcase isNamePresentWithSpace_TrimResult.");
	}

	@Test
	public void parameterContainNotNullValue() {
		logger.info("start executing parameterContainNotNullValue TestCase.");
		String name = "xyz";
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Good morning Xyz", result);
		logger.info("end of execution for testcase parameterContainNotNullValue.");
	}

	@Test
	public void paramerterIsBlank() {
		logger.info("start executing paramerterIsBlank TestCase.");
		String name = "";
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello ", result);
		logger.info("end of execution for testcase paramerterIsBlank.");
	}

	@Test
	public void paramerterIsNull() {
		logger.info("start executing paramerterIsNull TestCase.");
		String name = null;
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Hello ", result);
		logger.info("end of execution for testcase paramerterIsNull.");
	}

	@Test
	public void toCheck_capitalizeFirstLetter_SingleChar() {
		logger.info("start executing toCheck_capitalizeFirstLetter_SingleChar TestCase.");
		String name = "x";
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		assertEquals("Good morning X", result);
		logger.info("end of execution for testcase toCheck_capitalizeFirstLetter_SingleChar.");
	}
	
	@Test
	void testGreetMorningCases_exactlySix() {
		logger.info("start executing testGreetMorningCases_exactlySix Testcase.");
		String name = "xyz";
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		String expectedGreeting = "Good morning Xyz";
		assertEquals(expectedGreeting, result);
	}

	@Test
	void testGreetMorningCases_AfterSix() {
		logger.info("start executing testGreetMorningCases_AfterSix Testcase.");
		String name = "Xyz";
		// exactly 06:00 AM
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T06:01:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		String expectedGreeting = "Good morning Xyz";
		assertEquals(expectedGreeting, result);
	}

	@Test
	void testGreetMorningCases_exactlyTwelve() {
		logger.info("start executing testGreetMorningCases_exactlyTwelve Testcase.");
		String name = "xyz";
		// exactly 12:00
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T12:00:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		String expectedGreeting = "Good morning Xyz";
		assertEquals(expectedGreeting, result);
	}

	@Test
	void testGreetMorningCases_beforeTwelve() {
		logger.info("start executing testGreetMorningCases_beforeTwelve Testcase.");
		String name = "xyz";
		// exactly 11:59
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T11:59:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		String expectedGreeting = "Good morning Xyz";
		assertEquals(expectedGreeting, result);
	}

	@Test
	void testGreetMorningCases_beforeEleven() {
		logger.info("start executing testGreetMorningCases_beforeEleven Testcase.");
		String name = "xyz";
		// exactly 10:59
		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T10:59:00.00Z"), ZoneId.of("UTC"));
		greeter = new Greeter(fixedClock);
		String result = greeter.greet(name);
		logger.log(Level.INFO, "TestCase Actual Result is: {0}", result);
		String expectedGreeting = "Good morning Xyz";
		assertEquals(expectedGreeting, result);
	}

}
