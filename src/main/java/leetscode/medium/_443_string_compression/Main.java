package leetscode.medium._443_string_compression;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        char[] arr={'b','b','b','b','b','b','b','b','b','b','b','b','c'};
//        char[] arr={'a'};
        int len= s.compress(arr);
        System.out.println(len);

        System.out.println(Arrays.toString(s.IntToChars(0)));
        System.out.println(new String(s.IntToChars(34)));
    }
}
