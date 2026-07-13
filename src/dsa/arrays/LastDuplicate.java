package dsa.arrays;
import java.util.Arrays;
//Last duplicate element in a sorted array
/*
Example:
Input: arr[] = [1, 5, 5, 6, 6, 7]
Output: [4, 6]
Explanation: Last duplicate element is 6 having index 4.
 */

public class LastDuplicate {
    public static int[] dupLastIndex(int[] arr)
    {
        int[] res = { -1, -1 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                res[0] = i + 1;
                res[1] = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 5, 5, 6, 6, 7 };
        int[] res = dupLastIndex(arr);
        System.out.println(Arrays.toString(res));
    }
}