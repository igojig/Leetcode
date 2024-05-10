package leetscode.easy._724_find_pivot_index;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] arr = {1, 7, 3, 6, 5, 6};
//        int[] arr = {0,1,-1};
        int[] arr = {1,2,-3};
//        int[] arr = {1,2,3};

//       int[] arr={-1,-1,-1,-1,-4,1};


        int ans=s.pivotIndex(arr);
        System.out.println(ans);
    }
}
