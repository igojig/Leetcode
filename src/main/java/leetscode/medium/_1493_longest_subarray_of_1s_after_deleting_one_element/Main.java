package leetscode.medium._1493_longest_subarray_of_1s_after_deleting_one_element;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={0,1,1,1,0,1,1,0,1};
        int ans=s.longestSubarray(arr);
        System.out.println(ans);
    }
}
