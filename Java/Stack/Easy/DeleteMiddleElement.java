// Delete Middle Element from Stack
// Problem

// Given a stack of integers, delete the middle element without 
// using any extra data structure like another stack or array.

// Example

// Input: Stack = [1, 2, 3, 4, 5] (top is 5)
// Output: [1, 2, 4, 5]  (removed 3)

package Java.Stack.Easy;

import java.util.Stack;

public class DeleteMiddleElement {
    public static void deleteMiddleElement(Stack<Integer> stack, int current, int size){
        if (stack.isEmpty()) return ;
        if (current == size/2){
            stack.pop();
            return;
        }
        int top = stack.pop();

        deleteMiddleElement(stack, current + 1, size);

        stack.push(top);
    }

    public static void main (String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
                stack.push(2);

                        stack.push(3);

                                stack.push(4);

                                        stack.push(5);
    int size = stack.size();
    System.out.println("Original Stack: " + stack);
    deleteMiddleElement(stack, 0, size);
    System.out.println("Stack after deleting middle: " + stack);

    }
}
