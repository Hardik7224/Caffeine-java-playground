package dsa.arrays;
//Check if an array is subset of another array
public class SubsetArray {
    public static boolean isSubset(int[] a, int[] b) {
        int m = a.length, n = b.length;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < m; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    a[j] = -1;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        if (isSubset(a, b)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}