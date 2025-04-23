package repeats._1004_max_consecitive_ones_iii;

public class Solution {
    public int longestOnes(int[] nums, int k) {

        int startZero=0;
        int zeroCount=0;
        int max=0;

        for(int i=0;i< nums.length;i++){

           if(nums[i]==0){
               zeroCount++;
           }
           while (zeroCount>k){
               if(nums[startZero]==0){
                   zeroCount--;
               }
               startZero++;
           }
           max=Math.max(max, i-startZero+1);

        }

        return max;
    }
}
