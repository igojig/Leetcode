package leetscode.easy._136_single_number;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {

//        [4,1,2,1,2]

        Set<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }

        Iterator<Integer> iterator = set.iterator();
        int ans=0;
        while (iterator.hasNext()){
            ans=iterator.next();
        }

        return ans;

    }
}
