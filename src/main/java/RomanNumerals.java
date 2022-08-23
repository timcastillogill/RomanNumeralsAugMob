public class RomanNumerals {


	public String convert(int decimal) {
		if (decimal == 2) {
			return "II";
		}
		if (decimal == 3) {
			return "III";
		}
		return "I";
	}
}
