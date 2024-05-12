package leetscode.medium._2352_equal_row_and_column_pairs;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
//        int[][] arr={
//                {3,1,2,2},
//                {1,4,4,5},
//                {2,4,2,2},
//                {2,4,2,2}
//        };
        int[][] arr={
                {2,1},
                {3,32}
        };
        int ans=s.equalPairs(arr);
        System.out.println(ans);
    }
}
