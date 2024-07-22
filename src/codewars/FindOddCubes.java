package codewars;

public class FindOddCubes {

    public static int cubeOdd(int arr[]) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result = result + (int) Math.pow(arr[i], 3);
            }
        }

        return result;
    }
}
