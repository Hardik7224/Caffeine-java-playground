package dsa.linkedlist;

public class CreateNode {
    public static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Node n = new Node();
        n.data = 10;
        n.next = null;
        System.out.println("Data: " + n.data);
    }
}