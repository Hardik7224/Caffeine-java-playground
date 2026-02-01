package dsa.arrays;

public class SecondLargest {
    public static int findSecondLargest(int[] arr){
        int first = arr[0];
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(first < arr[i]){
                second = first;
                first = arr[i];
            }
            else if (second < arr[i] && first!=arr[i]) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int [] arr = {8,8,7,6,5,4};
        int element = findSecondLargest(arr);
        System.out.println("Second largest element in array is : " + element);
    }
}
