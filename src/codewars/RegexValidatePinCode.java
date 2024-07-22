package codewars;

public class RegexValidatePinCode {
    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            int count = 0;

            for (int i = 0; i < pin.length(); i++) {
                if (pin.charAt(i) >= '0' && pin.charAt(i) <= '9') {
                    count++;
                }
            }
            return count == pin.length();
        }
        return false;
    }

}
