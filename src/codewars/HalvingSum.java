package codewars;

public class HalvingSum {
    public static int halvingSum(int n) {
        int result = n;
        int a = n;
        for (int i = 2; a > 0; i *= 2) {
            a = n / i;
            result = result + a;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(halvingSum(25));
    }
}
