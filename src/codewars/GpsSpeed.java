package codewars;

public class GpsSpeed {

    public static int gps(int s, double[] x) {
        if (x.length < 1) {
            return 0;
        }

        int maxSectionSpeed = 0;
        for (int i = 0; i < x.length - 1; i++) {
            int sectionSpeed = (int)(3600 * (x[i + 1] - x[i])) / s;
            if (sectionSpeed > maxSectionSpeed) {
                maxSectionSpeed = sectionSpeed;
            }
        }


        return maxSectionSpeed;
    }


}
