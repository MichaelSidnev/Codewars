package codewars;

public class WhoLikesIt {
	public static String whoLikesIt(String... names) {
		switch (names.length) {
		case (0):
			return String.format("%s", "no one likes this");
		case (1):
			return String.format("%s", names[0] + " likes this");
		case (2):
			return String.format("%s", names[0] + " and " + names[1] + " like this");
		case (3):
			return String.format("%s", names[0] + ", " + names[1] + " and " + names[2] + " like this");
		default:
			return String.format("%s", names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this");
		}

	}

}
