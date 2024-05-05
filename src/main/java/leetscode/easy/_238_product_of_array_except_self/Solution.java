package leetscode.easy._238_product_of_array_except_self;

import java.util.Arrays;

public class Solution {
        public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pref = new int[len];
        int[] suf = new int[len];
        int[] result=new int[len];

        pref[0]=1;
        suf[len-1]=1;

        for(int i=1;i<len;i++){
            pref[i]=pref[i-1]*nums[i-1];
        }

        for (int i = len-2; i >=0; i--) {
            suf[i]=suf[i+1]*nums[i+1];
        }

        for (int i = 0; i < len; i++) {
            result[i]=suf[i]*pref[i];
        }

        return result;
    }


    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans,1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
