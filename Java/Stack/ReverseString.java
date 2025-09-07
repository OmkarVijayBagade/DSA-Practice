package Java.Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reverseString(s));
    }

    public static StringBuilder reverseString(String str){
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray())
        {
            stack.push(c);
        }        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());

        }

        return reversed;
    }
}
