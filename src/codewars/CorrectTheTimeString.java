package codewars;

public class CorrectTheTimeString {
    public static String timeCorrect(String timestring) {
        if (timestring == null || !timestring.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
            return null;
        }
        String[] arr = timestring.split(":");
        int s = Integer.parseInt(arr[2]);
        int m = Integer.parseInt(arr[1]);
        int h = Integer.parseInt(arr[0]);

        m += s / 60;
        s = s % 60;
        h += m / 60;
        m = m % 60;
        h = h % 24;

        return String.format("%02d:%02d:%02d", h, m, s);
    }

}
