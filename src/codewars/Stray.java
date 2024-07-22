package codewars;

public class Stray {
    static int stray(int[] numbers) {
        if (numbers[0] == numbers[1]) {
            for (int i = 2; i < numbers.length; i++) {
                if (numbers[1] != numbers[i]) {
                    return numbers[i];
                }
            }
        } else {
            if (numbers[0] == numbers[2]) {
                return numbers[1];
            }
        }
        return numbers[0];
    }
}
