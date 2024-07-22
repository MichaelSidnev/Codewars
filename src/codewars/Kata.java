package codewars;

import java.util.Arrays;

public class Kata {
    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 != 0) {
                for (int j = i; j < array.length; j++)
                    if (array[j] % 2 != 0) {
                        if (array[i] > array[j]) {
                            int a = array[i];
                            array[i] = array[j];
                            array[j] = a;
                        }
                    }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
    }


}