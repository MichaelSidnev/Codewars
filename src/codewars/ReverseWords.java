package codewars;

public class ReverseWords {

    public static String reverseWords(final String original) {

        if(original.isBlank()){
            return original;
        }

        String[] slitStr = original.split(" ");
        StringBuilder result = new StringBuilder();

        for (String s : slitStr) {
            StringBuilder revStr = new StringBuilder(s);
            result.append(revStr.reverse() + " ");
        }
        return result.toString().trim();
    }


}
