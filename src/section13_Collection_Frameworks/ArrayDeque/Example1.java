package section13_Collection_Frameworks.ArrayDeque;
import java.util.ArrayDeque;

public class Example1 {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addLast(30);

        System.out.println("Deque: " + dq);

        dq.removeFirst();

        System.out.println("After Removal: " + dq);
    }
}
