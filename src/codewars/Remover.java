package codewars;

public class Remover {


    public static int[] removeSmallest(int[] numbers) {

        if (numbers.length == 0) return new int[]{};

        int o = 0;
        int min_index = idx_min(numbers);

        int[] y = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (i == min_index) continue;
            y[o] = numbers[i];
            o++;
        }
        return y;
    } // the end of the remove mehtod
    public static int idx_min(int[] arr) {

        int min = min(arr);
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == min)
                break;
        }
        return i;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int u : arr) {
            if (u < min) min = u;

        }
        return min;
    }

}