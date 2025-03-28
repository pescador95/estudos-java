package src.bigO;

import java.util.Arrays;

public class LinearTime {

    public static void main(String... args) {
        int[] numbers = new int[]{38, 27, 43, 3, 9, 82, 10, 5, 8, 13, 24, 20};

        executeLinearTime(numbers);
        executeSquareArray(numbers);
    }

    //        Time complexity: o(n)
    //        Space complexity: o(1)
    public static void executeLinearTime(int[] numbers) {

        linearTime(numbers);
    }


    public static void linearTime(int[] numbers) {
        System.out.print("Linear time: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //        Time complexity: o(n)
    //        Space complexity: o(n)
    public static void executeSquareArray(int[] numbers) {

        System.out.println(" Original Array: " + Arrays.toString(numbers));

        int[] square = squareArray(numbers);

        System.out.println("Square Array: " + Arrays.toString(square));
    }

    public static int[] squareArray(int[] numbers) {
        int[] squared = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            squared[i] = numbers[i] * numbers[i];
        }

        return squared;
    }
}
