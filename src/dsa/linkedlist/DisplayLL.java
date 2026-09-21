package dsa.linkedlist;

public class DisplayLL {
    public static class Node {
        int data;
        Node next;
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();

        n1.data = 10;
        n2.data = 20;
        n3.data = 30;

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        display(n1);
    }
}