package codewars;

import java.util.Arrays;
import java.util.Comparator;

public class AreTheyTheSame {
	public static boolean comp(int[] a, int[] b) {

		if (a == null || b == null || a.length != b.length) {
			return false;
		}

		Integer[] integerA = new Integer[a.length];
		for (int i = 0; i < a.length; i++) {
			integerA[i] = a[i];
		}

		Arrays.sort(integerA, new Comparator<Integer>() {
			@Override
			public int compare(Integer int1, Integer int2) {
				return Math.abs(int1) - Math.abs(int2);
			}
		});
		Arrays.sort(b);

		for (int i = 0; i < integerA.length; i++) {
			if (integerA[i] * integerA[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}
}
