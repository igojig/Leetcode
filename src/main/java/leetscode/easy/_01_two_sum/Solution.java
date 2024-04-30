package leetscode.easy._01_two_sum;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
                int findable=target-nums[i];
                int foundIndex = map.getOrDefault(findable, -1);
                if (foundIndex != -1) {
                    return new int[]{i, foundIndex};
                } else {
                    map.put(nums[i], i);
                }
            }

        // never
        return new int[]{-1, -1};

    }

}
