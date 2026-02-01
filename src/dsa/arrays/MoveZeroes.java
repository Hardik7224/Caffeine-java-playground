package dsa.arrays;
import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroesToEnd(int [] arr){
        int j=0;
        int temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,0,2,3,2,0,0,4,5,1};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
