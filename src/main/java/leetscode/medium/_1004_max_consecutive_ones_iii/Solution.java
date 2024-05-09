package leetscode.medium._1004_max_consecutive_ones_iii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int longestOnes(int[] nums, int k) {

        int start = 0;
        int i = 0;
        int max = 0;
        int zeroes = 0;

        while (i < nums.length) {
            if (nums[i] == 0) {
                zeroes++;
            }
            while (zeroes > k) {
                if (nums[start] == 0) {
                    zeroes--;
                }
                start++;
            }
            max = Math.max(max, i - start + 1);
            i++;
        }

        return max;

    }

    public int longestOnes2(int[] nums, int k) {
        int zeroCount = 0;
        int oneCount = 0;
        int count = 0;
        List<Integer> ones = new ArrayList<>();
        List<Integer> zeroes = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            count++;
            if (i + 1 < nums.length && nums[i + 1] != nums[i]) {
                res.add(count);
                count = 0;
            }
        }
        res.add(++count);


        System.out.println(res);

        return -1;

    }
}
