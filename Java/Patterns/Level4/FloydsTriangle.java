// 1
// 23
// 456
// 78910
package Java.Patterns.Level4;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n =4, num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + "");
            }
            System.out.println();
        }
    }
}
