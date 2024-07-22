package codewars;

import java.util.Set;
import java.util.HashSet;

public class PigLatin {
	static Set<String> punctuationMarks = new HashSet<String>()	{{add("!"); add("-"); add(","); add("?"); add("."); }};

	public static String pigIt(String str) {
		StringBuilder result = new StringBuilder("");

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			if (punctuationMarks.contains(word)) {
				result.append(word);
				continue;
			}

			char firstChar = word.charAt(0);
			StringBuilder latinaWorld = new StringBuilder(word);
			latinaWorld.append(firstChar).append("ay ").deleteCharAt(0);
			result.append(latinaWorld);
		}
		return result.toString().trim();
	}
}