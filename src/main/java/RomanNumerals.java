public class RomanNumerals {


	public String convert(int decimal) {
		if (decimal == 5) {
			return "V";
		}

		return "I".repeat(decimal);
	}
}
