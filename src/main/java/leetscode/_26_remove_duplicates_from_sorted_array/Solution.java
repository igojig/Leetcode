package leetscode._26_remove_duplicates_from_sorted_array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[index++] = nums[i - 1];
                unique++;
            }
        }

        nums[index] = nums[nums.length - 1];

        return unique + 1;

    }
}
