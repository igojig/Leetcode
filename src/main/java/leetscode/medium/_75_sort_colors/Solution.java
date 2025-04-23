package leetscode.medium._75_sort_colors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public void sortColors(int[] nums) {


        //   0 1 2 3 4 5
        //  [2,0,2,1,1,0]

        int one = 0;
        int two = 0;
        int three = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                one++;
            } else if (nums[i] == 1) {
                two++;
            } else {
                three++;
            }
        }

        int i = 0;

        for (int j = 0; j < one; j++) {
            nums[i++] = 0;
        }
        for (int j = 0; j < two; j++) {
            nums[i++] = 1;
        }
        for (int j = 0; j < three; j++) {
            nums[i++] = 2;
        }


    }
}
