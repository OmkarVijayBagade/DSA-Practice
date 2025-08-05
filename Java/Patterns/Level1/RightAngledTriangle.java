// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

package Java.Patterns.Level1;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){ //rows
            for(int j = 1; j <= i; j++){// columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
