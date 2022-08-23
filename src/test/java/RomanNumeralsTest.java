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
		assertEquals("V", romanNumerals.convert(5));
		assertEquals("VI", romanNumerals.convert(6));
		assertEquals("VII", romanNumerals.convert(7));
		assertEquals("X", romanNumerals.convert(10));
		assertEquals("XX", romanNumerals.convert(20));
		assertEquals("L", romanNumerals.convert(50));
		assertEquals("CC", romanNumerals.convert(200));
	}

}