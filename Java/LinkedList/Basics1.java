package Java.LinkedList;

// Raw Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Basics1 {
    public static void main(String[] args) {
        // Node 1
        int data1 = 10;
        Node node1 = new Node(data1);
        node1.next = null;

        // Node 2
        int data2 = 20;
        Node node2 = new Node(data2);
        node2.next = null;

        // Link node1 -> node2
        node1.next = node2;

        // Node 3
        Node node3 = new Node(30);
        node3.next = null;
        node2.next = node3;  // Link node2 -> node3

        // Print manually
        Node temp = node1;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


