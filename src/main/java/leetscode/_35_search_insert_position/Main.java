package leetscode._35_search_insert_position;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 12, 17, 20};
//        int[] arr = {1,3};
        Solution s=new Solution();
        int ans=s.searchInsert(arr, 7);
        System.out.println(ans);

    }
}
