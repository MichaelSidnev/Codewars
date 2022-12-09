package codewars;

import java.util.Arrays;

public class AreTheyTheSame {
	public static boolean comp(int[] a, int[] b) {
		boolean result = true;
		if (a == null || b == null) {
			result = false;
		} else {
			Arrays.sort(a);
			Arrays.sort(b);

			for (int i = 0; i < a.length; i++) {
				if (a[i] * a[i] != b[i]) {
					result = false;
					break;
				}

			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = null;
		int[] b = null;
		System.out.println(comp(a, b));

	}

}
