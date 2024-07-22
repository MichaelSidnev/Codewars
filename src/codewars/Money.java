package codewars;

public class Money {
    static int years = 0;

    public static int calculateYears(double principal, double interest, double tax, double desired) {

        while (desired > principal) {
            principal = principal + ((principal * interest) - (principal * interest * tax));
            years++;
        }
        System.out.println(years);
        return years;
    }

    public static void main(String[] args) {
        calculateYears(1000, 0.01625, 0.18, 1200);
        System.out.println(years);
    }
}
