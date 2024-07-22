package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        String sum = s1 + s2;
        StringBuilder result = new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alpha.length(); i++) {
            for (int j = 0; j < sum.length(); j++) {
                if (alpha.charAt(i) == sum.charAt(j)) {
                    result.append(alpha.charAt(i));
                    break;
                }
            }
        }
        return result.toString();
    }

}