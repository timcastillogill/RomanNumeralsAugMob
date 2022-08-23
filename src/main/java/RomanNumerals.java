import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {


	public String convert(int decimal) {

		String result = "";

		while (decimal >= 100) {
			result += "C";
			decimal -= 100;
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
