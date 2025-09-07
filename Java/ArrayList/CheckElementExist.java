// Check if Element Exists
// Given a number x and an ArrayList, check if x exists in the list.

package Java.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckElementExist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // System.out.println("List: "+list);

        System.out.println("Enter number to search: ");
        int x = sc.nextInt();

        if (list.contains(x)) {
            System.out.println(x + " exists in the list at index: " + list.indexOf(x));

        } else {
            System.out.println(x + " not found in the list.");

        }
    }    
}
