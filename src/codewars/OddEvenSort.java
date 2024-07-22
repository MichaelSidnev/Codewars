package codewars;

public class OddEvenSort {
    public static String sortMyString(String s) {

        StringBuilder start = new StringBuilder();
        StringBuilder end = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                start.append(s.charAt(i));
            } else {
                end.append(s.charAt(i));
            }
        }
        return start + " " + end;
    }

}