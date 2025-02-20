package leetscode.easy._485_max_consecutive_ones;

public class Main {
    public static void main(String[] args) {
        int [] arr={1,1,0,1,1,1};
        Solution s=new Solution();
        int ans=s.findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
