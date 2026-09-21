package dsa.arrays;

public class MedianOfTwoSortedArray {
    public static int [] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int [] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<n){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<m){
            c[k]=b[j];
            j++;
            k++;
        }
        return c;
    }

    public static float findMedian(int [] a, int [] b){
        int [] c=merge(a,b);
        int len=c.length;
        float median;
        if(len%2==0){
            median=(c[len/2]+c[len/2]-1)/2.0f;
        }
        else {
            median=c[len/2];
        }
        return median;
    }

    public static void main(String[] args) {
        int [] a={1,3,5,7};
        int [] b={2,4,6,8};
        float result = findMedian(a,b);
        System.out.println(result);
    }
}
