package dsa.arrays;
import java.util.ArrayList;
import java.util.Collections;

// Leaders in an array
public class Leaders {
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[arr.length - 1];
        result.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                result.add(max);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
