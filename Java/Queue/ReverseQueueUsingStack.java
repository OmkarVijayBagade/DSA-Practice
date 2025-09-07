// Reverse a Queue
// Given a queue, reverse its elements.
package Java.Queue;

import java.util.*;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
    }

    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();

        //pushing all elements in the stack
        while (q.size() != 0) {
            st.push(q.remove());
        }

        //pop from stack and add into queue
        while (st.size() != 0) {
            q.add(st.pop());
        }
    }
}
