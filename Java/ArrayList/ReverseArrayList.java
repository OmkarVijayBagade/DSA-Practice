//  Reverse an ArrayList
// Write code to reverse the elements in an ArrayList.
package Java.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5);
        
        int left = 0, right=list.size()-1;
        while (left<right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        System.out.println("Reverse list: " + list);
    }
}
