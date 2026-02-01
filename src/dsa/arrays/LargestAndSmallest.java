package dsa.arrays;

public class LargestAndSmallest {
    public static int largestElement(int [] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int smallestElement(int [] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int [] arr = {3,3,5,99,-80};
        int max = largestElement(arr);
        System.out.println("Largest element in array is : " + max);
        int min = smallestElement(arr);
        System.out.println("Smallest element in array is : " + min);
    }
}
