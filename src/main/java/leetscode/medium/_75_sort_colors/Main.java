package leetscode.medium._75_sort_colors;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={2,0,2,1,1,0};

        s.sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }
}
