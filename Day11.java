// Link for Question https://leetcode.com/problems/two-sum/description/

public class Day11 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]+nums[j] == target) {
                    int[] result = {i,j};
                    return result;
                }
            }
        }
        return null;
    }
}