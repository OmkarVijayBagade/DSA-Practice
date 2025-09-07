package Java.Recursion;

public class SimpleRecurssion {
    public static void simple(int n){
        if (n == 0) return;
        simple(n - 1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        simple(5);
    }
}
