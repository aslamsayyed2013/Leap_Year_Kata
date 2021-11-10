package co.incubyte.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	@Test
	void fizzTest() {
		assertEquals("Fizz",FizzBuzz.check(3));
	}

}
