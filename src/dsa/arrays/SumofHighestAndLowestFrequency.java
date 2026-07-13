package dsa.arrays;

public class SumofHighestAndLowestFrequency {
    public int sumOfHighAndLowFrequency(int[] nums) {
        int n = nums.length;
        int max = 0;
        int min = n;
        boolean[] visited = new boolean[100001];

        for (int i = 0; i < n; i++) {
            int ele = nums[i];
            if (!visited[ele]) {
                visited[ele] = true;
                int count = 0;

                for (int j = 0; j < n; j++) {
                    if (ele == nums[j]) {
                        count++;
                    }
                }
                max = Math.max(max, count);
                min = Math.min(min, count);
            }
        }
        return max + min;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        SumofHighestAndLowestFrequency obj =
                new SumofHighestAndLowestFrequency();
        int result = obj.sumOfHighAndLowFrequency(nums);
        System.out.println(result);
    }
}