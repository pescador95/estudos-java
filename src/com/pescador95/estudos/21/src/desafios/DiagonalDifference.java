package src.desafios;

import java.util.List;

public class DiagonalDifference {

        /*
         * Complete the 'diagonalDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int diagonalDifference(List<List<Integer>> arr) {

            int firstDiaconal = 0;
            int secondDiaconal = 0;

            for (int i = 0; i < arr.size(); i++) {
                firstDiaconal += arr.get(i).get(i);
                secondDiaconal += arr.get(i).get(arr.size() - 1 - i);
            }


            return Math.abs(firstDiaconal - secondDiaconal);
        }

    public static void main(String... args) {
        // Test case
        // 11 2 4
        // 4 5 6
        // 10 8 -12
        // Expected output: 15
        // Explanation: The primary diagonal is: 11 + 5 + (-12) = 4
        // The secondary diagonal is: 4 + 5 + 10 = 19
        // The absolute difference between the sums of the primary and secondary diagonals is |4 - 19| = 15

        System.out.println(diagonalDifference(List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12)
        )));
    }
}
