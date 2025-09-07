package Java.LinkedList;

public class CountNodes {

    public static int count(LinkedListBase.Node head){
        int count = 0;
        LinkedListBase.Node temp = head;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListBase ll = new LinkedListBase();
        ll.insertAtEnd(10);
        ll.insertAtEnd(30);
        ll.insertAtEnd(50);
        ll.insertAtEnd(70);
        ll.display();
        System.out.println("Node count: " + count(ll.head));
    }
}
