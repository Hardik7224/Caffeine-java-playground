package section8_Introduction_to_Arrays;

import java.util.Scanner;

public class Example42 {
    public static void main(String[] args) {
        // Right shift by k positions
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;

        k = k % n;   // handle k > n

        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        // print array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
