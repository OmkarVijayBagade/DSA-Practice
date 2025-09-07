package Java.Queue;

import java.util.*;

public class BinaryNumbers{
    public static void main(String[] args) {
        int N = 4;
        generateBinary(N);
    }
    public static void generateBinary(int N){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i=0; i<N; i++){
            String front = q.remove();
            System.out.println(front);
            q.add(front + "0");
            q.add(front + "1");
        }
    }
}