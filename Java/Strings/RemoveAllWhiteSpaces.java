// Remove All Whitespaces
// Problem Statement

// Given a string, remove all whitespaces and return the new string.
// Spaces can be anywhere in the string (beginning, middle, or end).

// Example:
// Input: " hello world "
// Output: "helloworld"


package Java.Strings;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String s = " hello world";
        System.out.println(removeWhiteSpaces(s));
    }

    public static String removeWhiteSpaces(String s){
        return s.replaceAll("\\s+", "");
    }
}
