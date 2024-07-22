package codewars;

import java.util.Arrays;
import java.util.Collections;

public class MaxDiffEasy {

	public static int maxDiff(int[] lst) {

		if (lst == null || lst.length < 2) {
			return 0;
		}

		Arrays.sort(lst);

		return lst[lst.length-1] - lst[0];
	}



}
