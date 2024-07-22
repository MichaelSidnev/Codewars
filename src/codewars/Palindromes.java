package codewars;

public class Palindromes {
    public static int palindromeChainLength(long n) {
        long k = n;
        long m = k;
        long reverse = 0;
        int count = 0;
        boolean palindrome = false;

        while (!palindrome) {
            while (m != 0) {
                reverse = reverse * 10 + m % 10;
                m /= 10;
            }
            if (k != reverse) {
                k = k + reverse;
                count++;
                reverse = 0;
                m = k;
            } else {
                return count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(palindromeChainLength(10));
    }
}