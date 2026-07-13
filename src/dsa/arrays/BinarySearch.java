package dsa.arrays;

public class BinarySearch {
    public static int binarySearch(int [] arr, int target){
        int LB=0;
        int UB=arr.length - 1;
        int index = Integer.MIN_VALUE;
        while(LB<=UB){
            int mid = (LB + UB)/2;
            if (arr[mid] == target){
                index = mid;
                break;
            } else if (target<arr[mid]) {
                UB = mid-1;
            }
            else{
                LB = mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,7,11,14,18};
        int key = 11;
        int index = binarySearch(arr,key);
        if(index >=0){
            System.out.println("Target is found at index: " + index);
        }
        else{
            System.out.println("Target is not found");
        }
    }
}