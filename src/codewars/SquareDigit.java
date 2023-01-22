package codewars;

public class SquareDigit {
	
	public int squareDigits(int n) {

		String[] m = String.valueOf(n).split("");
		String result = "";

		for (int i = 0; i < m.length; i++) {
			result = result + (Integer.valueOf(m[i]) * Integer.valueOf(m[i]));
		}
		return Integer.valueOf(result);
	}

}
