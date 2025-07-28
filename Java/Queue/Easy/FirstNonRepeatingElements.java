// First Non-Repeating Character in a Stream
// 🧠 Problem Statement:
// Given a stream of lowercase characters, at each point,
//  find the first non-repeating character from the stream so far. 
// If none exists, add #.

// 📥 Input:
// A string A of lowercase letters.

// 📤 Output:
// A string where each character corresponds to the first 
// non-repeating character of the stream so far. 
// If no non-repeating character exists, use #.

// 📌 Example:
// Input:  A = "aabc"
// Output: "a#bb"

package Java.Queue.Easy;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingElements {

    public static String solve(String A) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : A.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            ans.append(q.isEmpty() ? '#' : q.peek());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String A = "aabbc";
        System.out.println(solve(A)); // Output: a#bb
    }
}


