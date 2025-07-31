package Java.LinkedList.Easy;

public class Basics3 {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;

    static void insertAtTheTail(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void insertAtTheHead(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
            
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static boolean search(int input){
        Node temp = head;
        while (temp !=null){
            if (temp.data == input) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    static void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        insertAtTheTail(20);
        insertAtTheTail(40);
        insertAtTheTail(69);

        display();

        delete(40);

        display();

        System.out.println("Search 30: " + search(30)); // true
        System.out.println("Search 20: " + search(20)); // false

        insertAtTheHead(1);

        display();
    }
}
