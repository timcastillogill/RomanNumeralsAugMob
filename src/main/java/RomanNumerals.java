import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {


	public String convert(int decimal) {

		String result = "";
		int[] decimalValues = { 100, 50, 10, 5, 4 };
		String[] romanNumerals = { "C", "L", "X", "V", "IV" };


		for (int i = 0; i < decimalValues.length; i ++) {
			while (decimal >= decimalValues[i]) {
				result += romanNumerals[i];
				decimal -= decimalValues[i];
			}
		}

		result += "I".repeat(decimal);

		return result;
	}
}
