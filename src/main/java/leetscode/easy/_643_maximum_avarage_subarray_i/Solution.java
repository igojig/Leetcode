package leetscode.easy._643_maximum_avarage_subarray_i;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int max = 0;
        int sum;

        for (int i = 0; i < k; i++) {
            max += nums[i];
        }

        sum = max;

        for (int i = 1; i < nums.length - k + 1; i++) {
            sum = sum - nums[i - 1] + nums[k + i - 1];
            max = Math.max(max, sum);
        }

        return (double) max / k;
    }
}
