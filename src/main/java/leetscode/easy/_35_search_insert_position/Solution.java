package leetscode.easy._35_search_insert_position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int center = (left + right) / 2;
            if (nums[center] == target) {
                return center;
            }
            if (target < nums[center]) {
                right = center - 1;
            } else {
                left = center + 1;
            }
        }
        return left;
    }
}
