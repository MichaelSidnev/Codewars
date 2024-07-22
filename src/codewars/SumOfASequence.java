package codewars;

public class SumOfASequence {

    public static int sequenceSum(int start, int end, int step) {
        if (start > end) {
            return 0;
        }
        int result = 0;
        for (int i = start; i <= end; i += step) {
            result = result + i;
        }
        return result;
    }
    
}
