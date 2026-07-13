package dsa.arrays;
// Number of Buildings Facing the Sun
/*
Example:
Input: arr[] = [6, 2, 8, 4, 11, 13]
Output: 4
Explanation: Only buildings of height 6, 8, 11 and 13 can see the sun, hence output is 4.
 */
public class BuildingsFacingSun {
    public static int visibleBuildings(int[]arr){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    break;
                }
            }
            if(j==i){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={6, 2, 8, 4, 11, 13};
        System.out.println(visibleBuildings(arr));
    }
}