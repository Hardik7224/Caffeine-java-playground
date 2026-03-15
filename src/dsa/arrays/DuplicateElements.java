package dsa.arrays;

public class DuplicateElements {
    public static void findDuplicates(int[] nums, int max){
        int[] hash = new int[max + 1];

        // counting frequency
        for(int i = 0; i < nums.length; i++){
            hash[nums[i]]++;
        }

        // printing duplicates with count
        for(int i = 0; i < hash.length; i++){
            if(hash[i] > 1){
                System.out.println(i + " appears " + hash[i] + " times");
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 3, 4, 1, 5, 1};
        int max = 5;
        findDuplicates(nums, max);
    }
}
