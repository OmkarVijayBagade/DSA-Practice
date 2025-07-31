package Java.LinkedList.Easy;

public class LinkedListBase {
    public static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public Node head = null;

    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
