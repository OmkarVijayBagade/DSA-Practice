// here the queue is printed in reverse order using recurssion 
// and stack implementation

//NOTE:  when calling the functions you can't expect correct answer for each methods
//Either you have to comment one of the function say recurssion then stack reverse will be correct 
//Or you have to comment the stack one and then the recurssion will give optimum result

//Or change the calling of one another when compiling the compiler will compile one at the first and then 
//another one at the bottom --> the bottom function call will always give you the original array

package Java.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Original Queue: " + q);

        reverseQueueUsingStack(q);
        System.out.println("Reversed Queue using stack: " + q);

        // reverseQueueUsingRecurssion(q);
        // System.out.println("Reversed Queue using recurssion: " + q);

    }

    public static void reverseQueueUsingStack(Queue<Integer> q){
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

    public static void reverseQueueUsingRecurssion(Queue<Integer> q){
        //base case 
        if (q.size() == 0) return;

        //removing the first element
        int front = q.remove();

        reverseQueueUsingRecurssion(q);

        //adding the removed element back 
        q.add(front);
    }

}
