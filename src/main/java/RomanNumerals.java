public class RomanNumerals {


	public String convert(int decimal) {
		String result = "";
		if (decimal >= 5) {
			result += "V";
			decimal -= 5;
		}

		result += "I".repeat(decimal);

		return result;
	}
}
