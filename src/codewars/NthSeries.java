package codewars;

public class NthSeries {

    public static String seriesSum(int n) {

        // 1/1 + 1/4 + 1/7 + 1/10
        // z = 1 + (3*i);

        int z = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            z = 1 + (3 * i);
            sum +=  1.0 / z;
        }

        return String.format("%.2f", sum);
    }

    public static void main(String[] args) {

        System.out.println(seriesSum(5));
    }
}
