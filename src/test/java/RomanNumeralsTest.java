import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

	@Test
	public void
	should_return_I_given_1() {
		assertEquals("I", new RomanNumerals().convert(1));
	}

}