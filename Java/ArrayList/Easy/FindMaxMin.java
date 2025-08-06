// Find Maximum Element
// Given an ArrayList of integers, find the maximum number.

package Java.ArrayList.Easy;
import java.util.ArrayList;
import java.util.Collections;

public class FindMaxMin {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list, 5,12,8,23);

            int max = list.get(0);

            for(int i=1; i<list.size(); i++){
                if (list.get(i)>max) {
                    max=list.get(i);
                }
            }
            System.out.println("Maximum element: "+max);
    }
}
