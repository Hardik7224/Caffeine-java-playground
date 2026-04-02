package section13_Collection_Frameworks.PriorityQueue;
import java.util.PriorityQueue;

public class Example1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Removed Element: " + pq.poll());

        System.out.println("After Poll: " + pq);
    }
}
