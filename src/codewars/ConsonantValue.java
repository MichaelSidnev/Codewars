package codewars;

public class ConsonantValue {
	public static int solve(final String s) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder substring = new StringBuilder(s);
		int highestValue = 0;
		int value = 0;

		for (int i = 0; i < s.length(); i++) {

			

			if (substring.charAt(i) == 'a' || substring.charAt(i) == 'e' || substring.charAt(i) == 'i'
					|| substring.charAt(i) == 'o' || substring.charAt(i) == 'u') {
				
				if (value > highestValue) {
					highestValue = value;
					value = 0;
					substring.delete(0, i);
				}

			} 
			value += alphabet.indexOf(substring.charAt(i));


		}

		return highestValue + 1;
	}

}