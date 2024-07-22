package codewars;

import java.util.Arrays;

public class Minimum {
    public static int minValue(int[] values){

        StringBuilder result = new StringBuilder();

        values = Arrays.stream(values).distinct().sorted().toArray();

        for(int a : values){
            result.append(a);
        }

        Integer.parseInt(String.valueOf(result));

        return Integer.parseInt(String.valueOf(result));
    }
}
