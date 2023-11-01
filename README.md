# greetPresonRepository
to greet person

# Greeter Class
Its a simple Java class that implements a greet function with specific requirements. 

## Requirements

The Greeter class should have the following functionality:

1. The `greet` function should receive a `name` as input and output a greeting in the format "Hello <name>".

2. The `greet` function should trim the input name to remove any leading or trailing whitespace.

3. The `greet` function should capitalize the first letter of the name.

4. If the time is between 06:00 and 12:00, the `greet` function should return "Good morning <name>".

5. If the time is between 18:00 and 22:00, the `greet` function should return "Good evening <name>".

6. If the time is between 22:00 and 06:00, the `greet` function should return "Good night <name>".

7. The `greet` function should log to the console each time it is called.

## Project Structure

The project is organized as follows:


- `src/main/java/com/nhs/greetPerson/Greeter.java`: The Java class that implements the Greeter functionality.
- `src/test/java/com/nhs/greetPerson/GreeterTest.java`: JUnit test class for testing the Greeter class.
- `pom.xml`: The Maven project configuration file.
- `README.md`: This file, providing project information and instructions.

## Running the Tests

To run the tests for the Greeter Kata, you can use a build tool like Maven. Ensure that you have Maven installed on your system. Then, navigate to the project directory and run:

-mvn test

# System needed
1) java 8 or upper version
2) IDE





