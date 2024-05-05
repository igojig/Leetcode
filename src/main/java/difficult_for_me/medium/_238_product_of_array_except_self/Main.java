package difficult_for_me.medium._238_product_of_array_except_self;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={1,2,3,4};
        int[] ans=s.productExceptSelf1(arr);
        System.out.println(Arrays.toString(ans));

    }
}
