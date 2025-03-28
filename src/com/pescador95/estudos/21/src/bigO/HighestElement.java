package src.bigO;

public class HighestElement {


    public static void main(String[] args) {

        int[] nums = new int[]{11, 15, 2, 7, 9, 38, 26, 39, 10, 5, 2};

        int result = highestElement(nums);

        System.out.println(result);
    }

    static int highestElement(int[] nums) {

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            System.out.println(i);
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
