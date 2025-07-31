package Java.LinkedList.Easy;

public class MiddleNode {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node insertNode(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertNode(head, 10);
        head = insertNode(head, 20);
        head = insertNode(head, 30);
        head = insertNode(head, 40);
        head = insertNode(head, 50);

        display(head);

        Node middle = findMiddle(head);
        System.out.println("Middle node: " + middle.data);
    }
}
