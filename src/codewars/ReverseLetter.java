package codewars;

public class ReverseLetter {
    public static String reverseLetter(final String str) {

        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            if(Character.isAlphabetic(str.charAt(i))){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
