// Reverse Words in a String
// Problem Statement

// Given a string s containing words separated by spaces, reverse the order of words.
// A word is defined as a sequence of non-space characters.

// Example 1:
// Input: "the sky is blue"
// Output: "blue is sky the"

// Example 2:
// Input: " hello world "
// Output: "world hello"
package Java.Strings.Easy;

public class ReverseWords {
    public static void main(String[] args) {
        String s = " hello world";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i>0) result.append(" ");
        }

        return result.toString();
    }
}
