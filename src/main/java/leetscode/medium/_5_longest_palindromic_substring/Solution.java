package leetscode.medium._5_longest_palindromic_substring;

public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int left=0;
        int right=0;
        int[][] dp = new int[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }

        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                left=i;
                right=i+1;
            }
        }


        for (int dif = 2; dif < len; dif++) {
            for (int i = 0; i + dif < len; i++) {
                if (s.charAt(i) == s.charAt(i + dif) && dp[i + 1][i + dif - 1] == 1) {
                    dp[i][i + dif] = 1;
                    if(dif>right-left){
                        left=i;
                        right=i+dif;
                    }
                }
            }
        }

//        System.out.println(left);
//        System.out.println(right);

        return s.substring(left, right+1);

    }
}
