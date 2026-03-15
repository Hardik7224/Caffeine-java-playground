package dsa.arrays;

public class ReverseArray1 {
    public static void reverse(int[] A){
        int[] B = new int[A.length];
        int n = A.length;

        for(int i = 0; i < n; i++){
            B[n - i - 1] = A[i];
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for(int i = 0; i < n; i++){
            System.out.print(B[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}
