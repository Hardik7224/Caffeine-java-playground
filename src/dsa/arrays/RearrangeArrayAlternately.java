package dsa.arrays;
import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int min = 0;
        int max = n - 1;
        int mod = arr[n - 1] + 1;
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                arr[i] += (arr[max] % mod) * mod;
                max--;
            } else {
                arr[i] += (arr[min] % mod) * mod;
                min++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= mod;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
