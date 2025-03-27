package src.bigO;


import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int[] array = {38, 27, 43, 3, 9, 82, 10, 5, 8, 13, 24, 20};

        execute(array);
    }

    //        Time complexity: o(n log n)
    //        Space complexity: o(n)
    public static void execute(int[] array) {

        System.out.println("Original Array : " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Ordened Array : " + Arrays.toString(array));
    }


    public static void mergeSort(int[] array) {

        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;

        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);


        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);

    }


    public static void merge(int[] array, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int combinedIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {

            if (left[leftIndex] <= right[rightIndex]) {
                array[combinedIndex++] = left[leftIndex++];
            } else {
                array[combinedIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            array[combinedIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            array[combinedIndex++] = right[rightIndex++];
        }
    }
}
