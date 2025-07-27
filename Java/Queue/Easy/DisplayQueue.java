//Print all elements present in given queue only using add(),remove(),peek(),size() & extra queue.

package Java.Queue.Easy;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue{ 
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q + " ");

        Queue<Integer> helper = new ArrayDeque<>();
        //removing the elements from the q and printing each elements
        while (q.size()>0) {
            System.out.print(q.peek() + " ");
            helper.add(q.remove());
        }

        //adding the elements in helper one by one 
        while (helper.size()>0){
            q.add(helper.remove());
        }
    }
   
}
