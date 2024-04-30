package leetscode.easy._26_remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={1,1,1,1,2,3,4,4,4};
        int ans=s.removeDuplicates(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
}
