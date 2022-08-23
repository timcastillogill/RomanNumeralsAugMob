public class RomanNumerals {


	public String convert(int decimal) {

		String result = "";

		while (decimal >= 10) {
			result += "X";
			decimal -= 10;
		}

		if (decimal >= 5) {
			result += "V";
			decimal -= 5;
		}

		result += "I".repeat(decimal);

		return result;
	}
}
