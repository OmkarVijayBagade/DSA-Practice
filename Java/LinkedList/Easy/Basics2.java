package Java.LinkedList.Easy;

public class Basics2 {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){
        Node first = new Node(2);
        Node second = new Node(69);
        Node third = new Node(30);

        first.next  = second;
        second.next = third;

        Node temp = first;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
