package section8_Introduction_to_Arrays;

public class Example41 {
    public static void main(String[] args) {
        // Right shift by 1
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int last = arr[n - 1];   // store last element

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;   // place last at first position

        // print array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
