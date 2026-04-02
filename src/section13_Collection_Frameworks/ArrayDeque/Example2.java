package section13_Collection_Frameworks.ArrayDeque;
import java.util.ArrayDeque;
import java.util.List;

///  Example On ArrayDeque Implementation Class
public class Example2 {
    public static void main(String[] args) {
        // Doubly Ended Queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Array Dequeue As Queue
        queue.addLast(13);
        queue.addLast(14);
        queue.addLast(15);
        queue.addLast(16);

        System.out.println("Deque Elements : " + queue);

        int first = queue.getFirst();
        int last  = queue.getLast();

        int x =  queue.removeFirst();
        x = queue.removeFirst();
        x = queue.removeFirst();
        x = queue.removeFirst();

        // Deque as Stack
        ArrayDeque<Integer> stack = new ArrayDeque<>(List.of(12,13));

        stack.addFirst(10);
        stack.addFirst(9);
        stack.addFirst(8);

        int top = stack.getFirst();

        int removed = stack.removeFirst();
        removed = stack.removeFirst();
        removed = stack.removeFirst();
        removed = stack.removeFirst();

    }
}
