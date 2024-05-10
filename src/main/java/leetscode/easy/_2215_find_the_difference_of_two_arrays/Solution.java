package leetscode.easy._2215_find_the_difference_of_two_arrays;

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();

        for (int j : nums1) {
            a.add(j);
        }
        for (int j : nums2) {
            b.add(j);
        }
        Set<Integer> copyB=new HashSet<>(b);
        copyB.retainAll(a);
        a.removeAll(copyB);
        b.removeAll(copyB);

        return List.of(new ArrayList<>(a), new ArrayList<>(b));
    }
}
