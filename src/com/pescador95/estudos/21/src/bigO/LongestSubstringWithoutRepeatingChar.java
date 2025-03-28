package src.bigO;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int[] index = new int[128];
        int leftPointer = 0, maxLength = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char currentChar = s.charAt(rightPointer);
            leftPointer = Math.max(leftPointer, index[currentChar]);
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
            index[currentChar] = rightPointer + 1;
        }

        return maxLength;
    }
}

//Given a string s, find the length of the longest substring without duplicate characters.
//
//
//
//        Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//        Constraints:
//
//        0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.