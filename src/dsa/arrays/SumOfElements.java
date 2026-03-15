package dsa.arrays;

public class SumOfElements {
    public static void sum(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is: " + sum);
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        sum(arr);
    }
}
