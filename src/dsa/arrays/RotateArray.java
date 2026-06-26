package dsa.arrays;
import java.util.Arrays;

public class RotateArray {
    public static void leftRotate(int [] arr,int d){
        for(int i=0;i< d;i++){
            int first = arr[0];

            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }

            arr[arr.length-1]=first;
        }
    }

    public static void rightRotate(int [] arr,int d){
        for (int i = 0; i < d; i++) {
            int last = arr[arr.length - 1];

            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        leftRotate(arr1, 2);
        System.out.println("Left Rotate by 2: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        rightRotate(arr2, 2);
        System.out.println("Right Rotate by 2: " + Arrays.toString(arr2));
    }
}
