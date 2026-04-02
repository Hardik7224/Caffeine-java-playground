package section13_Collection_Frameworks.LinkedList;
import java.util.LinkedList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        System.out.println("Linked List 1 is Empty : " + linkedList1.isEmpty());

        // Adding Single Elements In LinkedList
        linkedList1.add(10);
        linkedList1.add(11);
        linkedList1.add(12);
        linkedList1.add(13);

        // Printing LinkedList1 Represent
        System.out.println(linkedList1);

        // Adding the element to 0th index
        linkedList1.add(3,-99);
        System.out.println("Adding the element at 3rd index : " + linkedList1);

        // Adding the element at beginning of the linked list
        linkedList1.addFirst(100);
        System.out.println("Add First 100 : " +linkedList1);

        // Adding the element at the end of the linked list
        linkedList1.addLast(-9999);
        System.out.println("Add Last -9999 : " +linkedList1);

        // Creating Linked List Collection With Predefined Numbers
        LinkedList<Integer> lnLinkedList = new LinkedList<>(List.of(13,14,15,16,17));
        LinkedList<Integer> lnLinkedList1 = new LinkedList<>(List.of(9,8,7));

        // Adding newly created list to linkedList1
        linkedList1.addAll(lnLinkedList);
        System.out.println("After adding another linked list to linkedList1 : " + linkedList1);

        // Adding another LinkedList At 2nd index
        linkedList1.addAll(2,lnLinkedList1);
        System.out.println("Adding Another Linked List At 2nd Index : " + lnLinkedList1);


        Integer[] numsArr = new Integer[linkedList1.size()];
        int i = 0;
        for(Object o : lnLinkedList1.toArray())
        {
            numsArr[i++] =  (Integer) o;
        }

    }
}
