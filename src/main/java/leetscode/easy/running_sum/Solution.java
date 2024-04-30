package leetscode.easy.running_sum;

public class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i] + result[i - 1];
        }

        return result;
    }
}
