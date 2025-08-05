//     *
//    ***
//   *****
//  *******
// *********

package Java.Patterns.Level3;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) { //rows

            //spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
