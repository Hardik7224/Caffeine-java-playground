package section13_Collection_Frameworks.PriorityQueue;
import java.util.*;

// Priority Queue
public class Example2 {
    public static void main(String[] args) {
        // Priority Queue uses Binary Tree Data Structure
        // Smallest Element will have the highest priority.
        // Largest Element will have the lowest priority.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(3);

        System.out.println("Queue : " + minHeap);

        // Always highest priority element is removed
        int removed =  minHeap.remove();
        System.out.println("Removed Element : " + removed);

        int getRoot = minHeap.peek();
        System.out.println("Top Element : " +  getRoot);


        Integer nums[] = new Integer[minHeap.size()];
        int index = 0;
        while (!minHeap.isEmpty())
        {
            nums[index++] = minHeap.remove();
        }

        System.out.println("Sorted Array : " + Arrays.deepToString(nums));

        // MaxHeap
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)
                {
                    return 1;
                }
                else if (o1 > o2) {
                    return -1;
                }
                return 0;
            }
        };

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(comparator);

        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(3);

        System.out.println("Max Heap : " + maxHeap);

        getRoot = maxHeap.peek();
        System.out.println("Max Heap Root : " + getRoot);
    }
}
