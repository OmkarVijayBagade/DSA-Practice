//    1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 

package Java.Patterns.Level4;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int[][] triangle = new int[n][n];  
        
        for (int i = 0; i < n; i++) {
            triangle[i][0] = 1;  // first element is 1
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

    
        for (int i = 0; i < n; i++) {
            //  spaces to center align
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            //  numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
