package leetscode.medium._735_asteroid_collision;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {46, -36, 3, 39, 20, -33, 35, 4, -26, -37, 27, -50, -23, 48, 5, -1, 29, -34, 34, 11, 22, 8, 41, -20, -10, 17, 35, -14, -9, 3, 12, -13, -47, 23, -39, 25, -43, -2, 26, -26, -42, -5, -4, 34, 3, 25, 20, 27, -6};
//        int[] arr={-4,-1,10,2,-1,8,-9,-6,5,2};
//        int[] arr={8,1, -8};

        int[] res=s.asteroidCollision(arr);
        System.out.println(Arrays.toString(res));
    }

}
