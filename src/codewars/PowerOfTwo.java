package codewars;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {

        return (float) (Math.log(n) / Math.log(2)) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
    }
}
