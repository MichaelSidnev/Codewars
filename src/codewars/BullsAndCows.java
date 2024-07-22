package codewars;

import java.util.stream.Stream;

public class BullsAndCows {
	private char[] secretCharArray;
	private boolean win = false;
	private int turn = 0;

	public BullsAndCows(int secretNumber) {
		// set the secret number
		if (secretNumber < 1000 || secretNumber > 9999) {
			throw new IllegalArgumentException();
		}

		secretCharArray = Integer.toString(secretNumber).toCharArray();

		checkDistinct(secretCharArray);

	}

	private void checkDistinct(char[] secretCharArray) {
		var distinct = new String(secretCharArray).chars().mapToObj(i -> (char) i).distinct().count();

		if (secretCharArray.length != distinct) {
			throw new IllegalArgumentException();
		}
	}

	public String compareWith(int n) {
		// compare and print bulls and cows
		if (win) {
			return "You already won!";
		}
		if (turn > 7) {
			return "Sorry, you're out of turns!";
		}

		if (n < 1000 || n > 9999) {
			throw new IllegalArgumentException();
		}

		char[] charArray = Integer.toString(n).toCharArray();

		checkDistinct(charArray);

		int bullCount = 0;
		int cowCount = 0;

		for (int i = 0; i < 4; i++) {
			if (charArray[i] == secretCharArray[i]) {
				bullCount++;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (charArray[i] == secretCharArray[j]) {
					if (i != j) {
						cowCount++;
					}
				}
			}
		}

		turn++;
		if (bullCount == 4) {
			win = true;
			return "You win!";
		}

		return bullCount + " bull" + (bullCount != 1 ? "s" : "") + " and " + cowCount + " cow"
				+ (cowCount != 1 ? "s" : "");
	}

}
