package codewars;

public class BumpsTheRoad {
    public static String bumps(final String road) {

        int bumpsCount = 0;
        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == 'n') {
                bumpsCount++;
                if (bumpsCount > 15) {
                    return "Car Dead";
                }
            }
        }
        return "Woohoo!";
    }
}