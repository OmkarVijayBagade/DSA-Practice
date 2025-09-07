// Add and Print All Elements
    // Write a program to:
    // Take n integers as input
    // Add them to an ArrayList
    // Print all elements

package Java.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllElements {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter how many numbers: ");
        int n = sc.nextInt();

        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        System.out.println("List is: ");
        for (int num : list){
            System.out.print(num + " ");
        }
    }   
}
