// Reverse String
// Given a string s, reverse it.
// Example:
// Input: "hello" → Output: "olleh"

package Java.Strings.Easy;

public class ReverseString {
    
public static void main(String[] args) {
    String str = "hello";
    System.out.println("Reversed string: " + reverseString(str));
}

    public static String reverseString(String str){
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
