package codewars;

import java.util.Arrays;

public class KillerDoor5 {

	static String events = "..P.P.P.O...";

	public static String run(String events) {
		final int IS_CLOSED = 0;
		final int IS_OPENING = 1;
		final int IS_OPEN = 2;
		final int IS_CLOSING = 3;
		final int STOP_OPENING = 4;
		final int STOP_CLOSING = 5;

		int state = IS_CLOSED;
		int doorPosition = 0;

		int[] result = new int[events.length()];

		for (int i = 0; i < events.length(); i++) {

			if (events.charAt(i) == '.') {
				switch (state) {
				case (IS_CLOSED):
					break;

				case (IS_OPENING):
					if (doorPosition == 5) {
						state = IS_OPEN;
					}
					break;

				case (IS_OPEN):
					break;

				case (IS_CLOSING):
					if (doorPosition == 0) {
						state = IS_CLOSED;
					}
					break;

				case (STOP_CLOSING):
					break;

				case (STOP_OPENING):
					break;
				}
			}

			if (events.charAt(i) == 'P') {
				switch (state) {
				case (IS_CLOSED):
					state = IS_OPENING;
					break;

				case (IS_OPENING):
					state = STOP_OPENING;
					break;

				case (IS_OPEN):
					state = IS_CLOSING;
					break;

				case (IS_CLOSING):
					state = STOP_CLOSING;
					break;

				case (STOP_OPENING):
					state = IS_OPENING;
					break;

				case (STOP_CLOSING):
					state = IS_CLOSING;
					break;
				}
			}
			if (events.charAt(i) == 'O') {

				switch (state) {
				case (IS_OPENING):
					state = IS_CLOSING;
					break;

				case (IS_CLOSING):
					state = IS_OPENING;
					break;
				}
			}

			if (state == IS_CLOSED) {
				result[i] = 0;
			}
			if (state == IS_OPENING) {
				result[i] = ++doorPosition;
			}
			if (state == IS_OPEN) {
				result[i] = 5;
			}
			if (state == IS_CLOSING) {
				result[i] = --doorPosition;
			}
			if (state == STOP_OPENING || state == STOP_CLOSING) {
				result[i] = result[i - 1];
			}
		}

		return Arrays.toString(result).replaceAll("\\[|\\]|,|\\s", "");
	}

	public static void show() {

		System.out.println(run(events));
	}

	public static void main(String[] args) {
		System.out.println(events);
		show();
	}

}
