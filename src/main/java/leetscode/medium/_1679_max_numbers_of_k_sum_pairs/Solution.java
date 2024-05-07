package leetscode.medium._1679_max_numbers_of_k_sum_pairs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }

        Map<Integer, Integer> mapToFind = new HashMap<>();
        int count = 0;
        int target;

        for (int i = 0; i < nums.length; i++) {
            target = k - nums[i];
            if (target > 0) {
                if (mapToFind.getOrDefault(nums[i], 0) != 0) {
                    mapToFind.put(nums[i], mapToFind.get(nums[i]) - 1);
                    ++count;
                } else {
                    mapToFind.merge(target, 1, Integer::sum);
                }
            }
        }

        return count;
    }
}
