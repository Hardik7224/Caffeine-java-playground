package dsa.arrays;

public class UniqueElements {
    public static void findUnique(int[] nums, int max){
        int[] hash = new int[max + 1];

        // counting frequency
        for(int i = 0; i < nums.length; i++){
            hash[nums[i]]++;
        }

        // printing unique elements
        System.out.println("Unique elements are:");
        for(int i = 0; i < hash.length; i++){
            if(hash[i] == 1){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 4, 1, 5, 1};
        int max = 5;
        findUnique(nums, max);
    }
}
