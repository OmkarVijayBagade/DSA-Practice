//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

package Java.Patterns.Level3;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;
        
        //upper half same as the pyramid pattern
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("*");
            System.out.println();
        }
        //lower half 
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("*");
            System.out.println();
        }

    }
}