package difficult_for_me.medium._334_increasing_triplet_subsequence;

import java.util.Arrays;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }

        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;

        for(int i=0;i< nums.length;i++){
            int value=nums[i];
            if(value<a){
                a=value;
            } else if (value>a && value<b) {
                b=value;

            } else if (value>b){
                return true;
            }
        }

        return false;
//        int[] smallestTwo = new int[2];
//        Arrays.fill(smallestTwo, Integer.MAX_VALUE);
//        smallestTwo[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            int currentNum = nums[i];
//
//            if (currentNum < smallestTwo[0])
//                smallestTwo[0] = currentNum;
//            else if (currentNum > smallestTwo[0] && currentNum < smallestTwo[1])
//                smallestTwo[1] = currentNum;
//            else if (currentNum > smallestTwo[1])
//                return true;
//        }
//
//        return false;



    }
}
