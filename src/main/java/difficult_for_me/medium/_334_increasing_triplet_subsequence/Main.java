package difficult_for_me.medium._334_increasing_triplet_subsequence;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
//        int[] arr={2, 7, 3, 1, 5, 4, 6};
        int[] arr={2,3,1,5,0,4,6};
        boolean res=s.increasingTriplet(arr);
        System.out.println(res);
    }
}
