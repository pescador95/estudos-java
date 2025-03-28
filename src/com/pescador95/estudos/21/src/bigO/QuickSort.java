package src.bigO;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] numbers = new int[]{38, 27, 43, 3, 9, 82, 10, 5, 8, 13, 24, 20};

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(numbers));
        executeQuickSort(numbers);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(numbers));
    }

    //        Time complexity: o(n log n)
    //        Space complexity: o(log n)
    public static void executeQuickSort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);

        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
