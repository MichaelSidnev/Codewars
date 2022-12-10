package codewars;

import java.util.Arrays;
import java.util.List;

public class AreTheyTheSame {
	public static boolean comp(int[] a, int[] b) {
		boolean result;
		List<int[]> collectionA = Arrays.asList(a);
		List<int[]> collectionB = Arrays.asList(b);
		collectionA.stream().anyMatch(collectionB);
		return result;
	}
	public static void main(String[] args) {
		int[] a = {2,3,4,5};
		int[] b = {25,4,25,9,16,0};
		System.out.println(comp(a, b));
	}
}
