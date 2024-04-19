package leetscode._1672_richest_customer_wealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth=new int[accounts.length];

        for(int i=0;i< accounts.length;i++){
            wealth[i]=sum(accounts[i]);
        }

        int max=0;
        for (int i : wealth) {
            max=Math.max(max, i);
        }


        return max;
    }

    public int sum(int[] nums){
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        return sum;
    }

}
