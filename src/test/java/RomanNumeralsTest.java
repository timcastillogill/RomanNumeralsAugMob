import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RomanNumeralsTest {

	private RomanNumerals romanNumerals;
	@BeforeEach
	void setup() {
		romanNumerals = new RomanNumerals();
	}
	@ParameterizedTest
	@MethodSource("givenNumberConvertsToRoman")
	void romanNumber(String roman, int number) {
		String result = romanNumerals.convert(number);

		assertEquals(roman, result);
	}
	private static Stream<Arguments> givenNumberConvertsToRoman() {
		return Stream.of(
				arguments("I", 1),
				arguments("II", 2),
				arguments("III", 3),
				arguments("V", 5),
				arguments("VI", 6),
				arguments("VII", 7),
				arguments("IX", 9),
				arguments("X", 10),
				arguments("XX", 20),
				arguments("L", 50),
				arguments("CC", 200),
				arguments("IV", 4),
				arguments("XL", 40),
				arguments("M", 1000),
				arguments("D", 500),
				arguments("XC", 90),
				arguments("CD", 400),
				arguments("CM", 900)
		);
	}

}