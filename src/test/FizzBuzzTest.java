package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void fizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		int input = 1;
		String expected = "1";
		String actual = fizzBuzz.fizzBuzz(input);
		assertEquals(expected, actual);
	}

}
