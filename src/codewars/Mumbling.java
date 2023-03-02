package codewars;

public class Mumbling {
	
    public static String accum(String s) {
    	
		StringBuilder str = new StringBuilder();
		s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			str.append(Character.toUpperCase(ch));
			for (int j = 0; j < i; j++) {
				str.append(ch);
			}
			str.append("-");
		}
		return str.deleteCharAt(str.lastIndexOf("-")).toString();
	}

}
