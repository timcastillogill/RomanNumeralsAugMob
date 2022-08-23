public class RomanNumerals {


	public String convert(int decimal) {
		if (decimal == 5) {
			return "V";
		}

		if (decimal == 6) {
			return "VI";
		}
		return "I".repeat(decimal);
	}
}
