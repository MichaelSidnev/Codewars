package codewars;

import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int coutn = 0;
        String regExp = "[:;][-~]?[)D]";

        for (String s : arr) {
            if (s.matches(regExp)) {
                coutn++;
            }
        }
        return coutn;
    }
}
