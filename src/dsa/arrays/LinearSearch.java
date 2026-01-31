package dsa.arrays;
public  class LinearSearch {

    public static int linearSearch(int [] arr, int target) {
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] arr= {10,20,30,40};
        int key = 30;
        int index = linearSearch(arr,key);

        if(index >=0){
            System.out.println("Target is found at index: " + index);
        }
        else{
            System.out.println("Target is not found");
        }
    }
}