package dsa.arrays;
/*
Trapping Rain Water – Problem Statement

Given an array height[] of n non-negative integers,where each element represents the height
of a bar and the width of each bar is 1 unit, compute the total amount of rainwater that can be
trapped between the bars after it rains.
 */

public class TrappingRainWater {
    public static int trappedWater(int[] arr){
        int res =0;
        for(int i=1;i<arr.length-1;i++){
            int left = arr[i];
            for(int j=0;j<i;j++){
                left = Math.max(left,arr[j]);
            }
            int right = arr[i];
            for(int j=i+1;j<arr.length;j++){
                right = Math.max(right,arr[j]);
            }
            res = res + Math.min(left,right) - arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr =  {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedWater(arr));
    }
}