package codewars;

public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!Integer.toString(i).matches("\\d*(5)\\d*")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4, 17));
    }
}
