import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

	@Test
	public void
	given_decimal_returns_roman_numeral_string() {
		assertEquals("I", new RomanNumerals().convert(1));
		assertEquals("II", new RomanNumerals().convert(2));
	}

}