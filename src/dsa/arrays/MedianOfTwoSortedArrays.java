package dsa.arrays;
import java.util.Arrays;
//Median of two sorted arrays of same size

public class MedianOfTwoSortedArrays {
    public static double getMedian(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);

        int n = c.length;
        int mid1 = n / 2;
        int mid2 = mid1 - 1;
        return (c[mid1] + c[mid2]) / 2.0;
    }

    public static void main(String[] args) {
        int[] a = { 1, 12, 15, 26, 38 };
        int[] b = { 2, 13, 17, 30, 45 };
        System.out.println(getMedian(a, b));
    }
}