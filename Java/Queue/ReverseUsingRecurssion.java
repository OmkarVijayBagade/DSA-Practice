package Java.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseUsingRecurssion {
public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
    }

    public static void reverseQueue(Queue<Integer> q){
        //base case 
        if (q.size() == 0) return;

        //removing the first element
        int front = q.remove();

        reverseQueue(q);

        //adding the removed element back 
        q.add(front);
    }
}
