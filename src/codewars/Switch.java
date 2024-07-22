package codewars;

public class Switch {
    public static String switcheroo(String x) {
        StringBuilder exchage = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a') {
                exchage.append('b');
            }
            if (x.charAt(i) == 'b') {
                exchage.append('a');
            }
            if (x.charAt(i) == 'c') {
                exchage.append('c');
            }
        }
        return exchage.toString();
    }
}