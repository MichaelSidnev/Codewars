package codewars;

public class Debug_Sum_of_Digits_of_a_Number {

	public static int sumOfDigits(int n) {
		Integer sum = 0;
		int rotd = 0;
		while (n > 0) {
			rotd = n % 10;
			sum = sum + rotd;
			n = n / 10;
		}

		return sum;
	}


}
