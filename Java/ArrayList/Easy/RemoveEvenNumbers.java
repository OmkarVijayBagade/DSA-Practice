// Remove Even Numbers
// From an ArrayList of integers, remove all even numbers and print the list.

package Java.ArrayList.Easy;
import java.util.ArrayList;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("List after removing evens: " + list);

    }
}
