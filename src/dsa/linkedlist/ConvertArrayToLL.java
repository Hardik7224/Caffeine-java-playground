package dsa.linkedlist;

public class ConvertArrayToLL {
    public static class Node {
        int data;
        Node next;
    }

    public static Node convertToLL(int[] A) {
        Node head = null;
        Node temp = null;
        for (int i = 0; i < A.length; i++) {
            Node n = new Node();
            n.data = A[i];
            if (head == null) {
                head = n;
                temp = head;
            }
            else {
                temp.next = n;
                temp = n;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] A = {10, 12, 13, 14, 15};
        Node head = convertToLL(A);
        System.out.println("Head: " + head.data);
    }
}