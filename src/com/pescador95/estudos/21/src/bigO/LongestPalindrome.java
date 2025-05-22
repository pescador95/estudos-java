package src.bigO;

public class LongestPalindrome {

    int lowIndex;
    int maxLength;

    public String longestPalindrome(String s) {


        int length = s.length();

        if (length < 2) {
            return s;
        }

        for(int i = 0; i < length-1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }

        return s.substring(lowIndex, lowIndex + maxLength);
    }

    public void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (maxLength < right - left - 1) {
            lowIndex = left + 1;
            maxLength = right - left - 1;
        }
    }

    public static void main(String[] args) {
        String palindrome = "babad";
        String Palindrome2= "cbbd";

        LongestPalindrome clazz = new LongestPalindrome();

        String result = clazz.longestPalindrome(palindrome);

        System.out.println(result);
    }
}

//Given a string s, return the longest palindromic substring in s.
//
//
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//        Example 2:
//
//Input: s = "cbbd"
//Output: "bb"
//
//
//Constraints:
//
//        1 <= s.length <= 1000
//s consist of only digits and English letters.