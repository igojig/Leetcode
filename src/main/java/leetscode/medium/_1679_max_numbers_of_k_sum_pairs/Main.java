package leetscode.medium._1679_max_numbers_of_k_sum_pairs;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
//        int[] arr={1,2,3,4};
//        int[] arr={2,3,1,3,4,5,0,2};
//        int[] arr={2,2,2,3,1,1,4,1};
        int[] arr={3,1,3,4,3};
        int res=s.maxOperations(arr, 6);
        System.out.println(res);
    }
}
