package codewars;

import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder string =  new StringBuilder();
        for (Integer a : binary) {
            string.append(a);
        }
        return Integer.parseInt(string.toString(),2);
    }

}
