package dsa.arrays;

public class MissingNumber {
    public static void findMissing(int[] arr, int n) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        int total = n * (n + 1) / 2;
        int missing = total - sum;
        System.out.println("Missing number is: " + missing);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // 4 is missing
        int n = 5;
        findMissing(arr, n);
    }
}
