package leetscode.easy._724_find_pivot_index;

public class Solution {
    public int pivotIndex(int[] nums) {
//     -1    0   1   2   3   4   5
//     [0]   1,  7,  3,  6,  5,  6 == 28
//          1
        //[0] 1,2,3
// 1,2,-3
        // 0,1,-1
        int sum = 0;
        int leftSum = 0;
        int index = -1;

        for (int num : nums) {
            sum += num;
        }

        while (index < nums.length - 1) {
            if (leftSum == sum - nums[index + 1]) {
                return index + 1;
            }
            leftSum += nums[++index];
            sum -= nums[index];
        }

        return -1;
    }

    public int pivotIndex_1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int right = sum;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (right == left) {
                return i;
            }
            left += nums[i];
        }
        return -1; // Return -1 if there is no pivot index
    }
}
