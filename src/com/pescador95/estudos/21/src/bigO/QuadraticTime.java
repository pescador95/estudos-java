package src.bigO;

public class QuadraticTime {

    public static void main(String[] args) {
        int[] numbers = new int[]{38, 27, 43, 3, 9, 82, 10, 5, 8, 13, 24, 20};


        int target = 24;

        execute(numbers, 24);

    }

    //        Time complexity: o(n²)
    //        Space complexity: o(1)
    public static void execute(int[] numbers, int target) {

        System.out.println(findPair(numbers, target));
    }

    public static boolean findPair(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
