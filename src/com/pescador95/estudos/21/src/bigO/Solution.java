package src.bigO;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr1 = new int[] {1, 2, 3, 0, 0, 0};

        int[] arr2 = new int[] {2, 5, 6};

        int[] result = mergeArrays(nums1,m,nums2,n);
        System.out.println("Common: " + Arrays.toString(result));
    }


    public int[] mergeArrays(int[] nums1, int m, int[] nums2, int n) {

        int arrsum = m + n - 1;

        int arr1 = m -1;
        int arr2 = n -1;

        while (arr1 >= 0 && arr2 >= 0) {

            if (nums1[arr1] > nums2[arr2]) {
                nums1[arrsum] = nums1[arr1];
                arr1--;
                arrsum--;
            }  else {
                nums1[arrsum] = nums2[arr2];
                arr2--;
                arrsum--;
            }
        }

        while (arr2 >= 0) {
            nums1[arrsum] = nums2[arr2];
            arr2--;
            arrsum--;
        }
        return nums1;
    }

}