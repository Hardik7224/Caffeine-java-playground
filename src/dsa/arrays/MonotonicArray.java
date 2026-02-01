package dsa.arrays;

public class MonotonicArray {

    public static boolean monotonic(int [] arr){
        boolean isMonotonicIncreasingArray = true;
        boolean isMonotonicDecreasingArray = true;

        int j;

        for(int i=0;i<arr.length-1;i++){
            j=i+1;
            if(i<=j && arr[i]<=arr[j]){
                isMonotonicIncreasingArray = false;
            }
            break;
        }

        for(int i=0;i<arr.length-1;i++){
            j=i+1;
            if(i>=j && arr[i]>=arr[j]){
                isMonotonicDecreasingArray = false;
            }
            break;
        }

        return isMonotonicIncreasingArray || isMonotonicDecreasingArray;
    }

    public static void main(String[] args) {
        int [] A = {1,2,3,5,6};
        System.out.println("Array A is monotonic increasing ?: " + monotonic(A)); // monotonic increasing
        int [] B = {9,8,7,6};
        System.out.println("Array B is monotonic decreasing ?: " + monotonic(B)); // monotonic decreasing
    }
}
