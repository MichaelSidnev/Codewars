package codewars;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class RoundAndRound {
	public static double roundTo2DecimalPlaces(double number) {


		return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
			}



}
