package leetscode.medium._1493_longest_subarray_of_1s_after_deleting_one_element;

public class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, i, j = 0, k = 1, len = nums.length;
        for (i = 0; i < len; i++) {
            if (nums[i] == 0) {
                k--;
            }
            if (k < 0 && nums[j++] == 0){
                k++;
            }
        }
        return i - j - 1;
    }



    public int longestSubarray_11(int[] nums) {
        int start = 0;
        int max = 0;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[start] == 0) {

                    zeroCount--;
                }
                start++;
            }
            max = Math.max(max, i - start);
        }
        return max;
    }
}
