package leetscode.easy._1207_unique_number_occurrences;

import java.util.*;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int num: arr){
            map.merge(num, 1, Integer::sum);
        }

        Set<Integer> set=new HashSet<>();
        for (Integer value : map.values()) {
            if(set.contains(value)){
                return false;
            }
            set.add(value);
        }
        return true;
    }
}
