package dsa.arrays;
import java.util.*;
//Adding elements of an array until every element becomes greater than or equal to k

/*
Examples:
Input: arr[] = [1 10 12 9 2 3], k = 6
Output: 2
Explanation: First we add (1 + 2), now the new list becomes 3 10 12 9 3, then we add (3 + 3),
now the new  list becomes 6 10 12 9, Now all the elements in
the list are greater than 6.
Hence the output is 2 i:e 2 operations are required to do this.
 */

public class AddingArrayElements {
    public static int minOperations(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }

        int operations = 0;
        while (pq.peek() < k) {
            if (pq.size() < 2) {
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();
            int newValue = first + 2 * second;

            pq.add(newValue);
            operations++;
        }
        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(minOperations(arr, k));
    }
}