// Check Palindrome
// Problem Statement

// Given a string s, determine if it is a palindrome.
// A palindrome reads the same forward and backward. Ignore case sensitivity.

// Example:
// Input: "Racecar" → Output: true
// Input: "hello" → Output: false
package Java.Strings.Easy;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "Racecar";
        System.out.println(s + " is a palindrome. " +  isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
