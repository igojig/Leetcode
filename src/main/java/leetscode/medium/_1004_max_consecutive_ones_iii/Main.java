package leetscode.medium._1004_max_consecutive_ones_iii;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
//        int[] arr={1,1,1,0,1,0,1,1,1,1,0,1};
        int[] arr={0,0,0,1,1, 0,0,0,0,0};
//        int[] arr={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
//        int[] arr={1,0,1,0,1,0,1,0,1,0,1,1,0,0,0,1,1,1,1};
//        int[] arr={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int res=s.longestOnes(arr, 2);
        System.out.println(res);
    }
}
