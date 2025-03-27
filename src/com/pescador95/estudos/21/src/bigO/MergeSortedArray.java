package src.bigO;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        case1();
        case2();
        case3();
    }

    public static void case1() {

        int[] arr1 = new int[]{1, 2, 3, 0, 0, 0, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6, 7, 8, 9};

        exeute(arr1,arr2);
    }

    public static void case2() {

        int[] arr1 = {2, 5, 6, 0, 0, 0};
        int[] arr2 = {1, 3, 7};

        exeute(arr1, arr2);
    }

    public static void case3() {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 0, 0, 0};
        exeute(arr1, arr2);
    }

    public static void exeute(int[] arr1, int[] arr2) {


        int[] result = mergeSortedArray(arr1, arr2);
        System.out.println("Merged: " + Arrays.toString(result));
    }

    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {

        int[] left;
        int[] right;

        if (arr1.length > arr2.length) {
            left = arr1;
            right = arr2;
        } else {
            right = arr1;
            left = arr2;
        }

        SizePosition validLeft = getValidSizePos(left);
        SizePosition validRight = getValidSizePos(right);

        int maxIndex = (validLeft.getSize() + validRight.getSize()) - 1;

        int leftIndex = validLeft.getPosition();
        int rightIndex = validRight.getPosition();

        while (leftIndex >= 0 && rightIndex >= 0) {

            if (left[leftIndex] > right[rightIndex]) {
                left[maxIndex] = left[leftIndex];
                leftIndex--;
                maxIndex--;
            } else {
                left[maxIndex] = right[rightIndex];
                rightIndex--;
                maxIndex--;
            }

        }

        while (rightIndex >= 0) {
            left[maxIndex] = right[rightIndex];
            rightIndex--;
            maxIndex--;
        }
        return left;
    }

    public static SizePosition getValidSizePos(int[] arr) {

        SizePosition pos = new SizePosition();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > 0) {
                pos = new SizePosition(i + 1, i);
                break;
            }
        }
        return pos;
    }
}

class SizePosition {
    int size;
    int position;

    public SizePosition() {

    }

    public SizePosition(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public int getPosition() {
        return position;
    }
}
