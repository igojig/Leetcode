package leetscode.easy._283_move_zeros;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={1,2,3,0,0,4,5};
        s.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
