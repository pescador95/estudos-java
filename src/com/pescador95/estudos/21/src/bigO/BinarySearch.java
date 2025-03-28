package src.bigO;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String... args) {

        int[] numbers = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int targetNumber = 15;

        execute(numbers, targetNumber);

    }

    //        Time complexity: o(log n)
    //        Space complexity: o(1)
    public static void execute(int[] numbers, int targetNumber) {
        Arrays.sort(numbers);
        int result = binarySearch(numbers, targetNumber);
        System.out.println(result);
    }

    private static int binarySearch(int[] numbers, int targetNumber) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {

            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if (targetNumber == middleNumber) {
                return middlePosition;
            }

            if (targetNumber < middleNumber) {
                high = middlePosition - 1;
            }

            if (targetNumber > middleNumber) {
                low = middlePosition + 1;
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
