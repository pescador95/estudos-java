package src.bigO;

public class MedianTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        MedianTwoSortedArray medianTwoSortedArray = new MedianTwoSortedArray();
        System.out.println(medianTwoSortedArray.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] newArr = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                newArr[k++] = nums1[i++];
            } else {
                newArr[k++] = nums2[j++];
            }
        }

        while (i < m) {
            newArr[k++] = nums1[i++];
        }

        while (j < n) {
            newArr[k++] = nums2[j++];
        }

        int newArrL = newArr.length;

        if (newArrL % 2 == 1) {
            return newArr[newArrL / 2];
        } else {
            return (newArr[newArrL / 2 - 1] + newArr[newArrL / 2]) / 2.0;
        }
    }
}
