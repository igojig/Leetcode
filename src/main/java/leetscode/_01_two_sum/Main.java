package leetscode._01_two_sum;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={-3,4,3,90};
        Solution solution=new Solution();
        int[] ans= solution.twoSum(arr, 0);
        System.out.println(Arrays.toString(ans));
    }
}
