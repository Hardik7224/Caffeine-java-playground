package dsa.arrays;

public class CombineTwoArrays {
    public static int[] combine(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];

        // copy first array
        for(int i = 0; i < A.length; i++){
            C[i] = A[i];
        }

        // copy second array
        for(int i = 0; i < B.length; i++){
            C[A.length + i] = B[i];
        }

        return C;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = combine(arr1, arr2);

        System.out.println("Combined Array:");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
