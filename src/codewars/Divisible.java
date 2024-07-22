package codewars;

public class Divisible {
	public static boolean isDivisible(int... n) {

		for (int i = 0; i < n.length; i++) {
			if (n[i] == 0 || n[0] % n[i] != 0) {
				return false;
			}
			return true;
		}
		return false;

	}
}
