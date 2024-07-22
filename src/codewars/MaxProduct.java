package codewars;

public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        int max = array[0] * array[1];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > max) {
                max = array[i] * array[i + 1];
            }
        }
        return max;
    }
}