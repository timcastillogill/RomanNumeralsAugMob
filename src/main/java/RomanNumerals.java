import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {


	public String convert(int decimal) {

		String result = "";
		int[] decimalValues = { 100 };
		String[] romanNumerals = { "C" };

		while (decimal >= decimalValues[0]) {
			result += romanNumerals[0];
			decimal -= decimalValues[0];
		}

		while (decimal >= 50) {
			result += "L";
			decimal -= 50;
		}

		while (decimal >= 10) {
			result += "X";
			decimal -= 10;
		}

		while (decimal >= 5) {
			result += "V";
			decimal -= 5;
		}

		result += "I".repeat(decimal);

		return result;
	}
}
