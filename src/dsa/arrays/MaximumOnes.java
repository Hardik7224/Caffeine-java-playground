package dsa.arrays;

public class MaximumOnes {
    public static int countMaxOnes(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0, 0};
        int maxOnes = countMaxOnes(arr);
        System.out.println("Maximum consecutive ones in array is : " + maxOnes);
    }
}