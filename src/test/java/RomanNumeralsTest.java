import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

	private RomanNumerals romanNumerals;
	@BeforeEach
	void setup() {
		romanNumerals = new RomanNumerals();
	}
	@Test
	public void
	given_decimal_returns_roman_numeral_string() {
		assertEquals("I", romanNumerals.convert(1));
		assertEquals("II", romanNumerals.convert(2));
		assertEquals("III", romanNumerals.convert(3));
	}

}