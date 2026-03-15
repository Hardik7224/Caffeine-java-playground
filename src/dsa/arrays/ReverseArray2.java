package dsa.arrays;

public class ReverseArray2 {
    public static void reverse(int[] A){
        int low = 0;
        int high = A.length - 1;
        int temp;

        while(low <= high){
            temp = A[low];
            A[low] = A[high];
            A[high] = temp;

            low++;
            high--;
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}
